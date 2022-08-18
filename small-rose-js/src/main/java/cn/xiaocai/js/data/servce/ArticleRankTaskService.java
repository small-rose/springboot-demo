package cn.xiaocai.js.data.servce;

import cn.xiaocai.js.data.persistence.entity.ArticleRank;
import cn.xiaocai.js.data.persistence.entity.SpiderLog;
import cn.xiaocai.js.data.persistence.repostory.ArticleRankRepository;
import cn.xiaocai.js.data.persistence.repostory.SpiderLogRepository;
import cn.xiaocai.js.data.uitl.DateUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/30 23:37
 * @version: v1.0
 */
@Slf4j
@Service
public class ArticleRankTaskService {

    @Autowired
    private ArticleRankRepository articleRankRepository ;
    @Autowired
    private SpiderLogRepository spiderLogRepository ;

    private static  String URL = "https://www.jianshu.com/asimov/fp_rankings/voter_notes?date=";

    public String catchRankData(String start, String end) throws UnirestException {

        String yyyyMMdd = start ;
        if (StringUtils.hasText(end)){
            LocalDate yyyyMMdd1 = LocalDate.parse(start, DateTimeFormatter.BASIC_ISO_DATE);
            LocalDate yyyyMMdd2 = LocalDate.parse(end, DateTimeFormatter.BASIC_ISO_DATE);
            List<LocalDate> localDates = DateUtil.getsAllDatesInTheDateRange(yyyyMMdd1, yyyyMMdd2);
            log.info("抓取日期区间开始 " + yyyyMMdd1.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            log.info("抓取日期区间结束 " + yyyyMMdd2.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            for (LocalDate billDate : localDates){
                catchRankData(billDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            }
            log.info("日期区间{} 到 {} 的数据抓取完成！", yyyyMMdd1, yyyyMMdd2);
        }else{
            yyyyMMdd = start ;
            List<SpiderLog> list = spiderLogRepository.selectByRankDateRankType(yyyyMMdd, "AR");

            if (!CollectionUtils.isEmpty(list)){
                SpiderLog spiderLog = list.get(0);
                if ("S".equals(spiderLog.getStatus())) {
                    log.info("日期 " + yyyyMMdd + " 的排名已经抓取");
                    return "ALREADY";
                }else {
                    log.info("日期 " + yyyyMMdd + " 的排名上次抓取失败");
                }
            }
            String result = catchAndSaveRankData(yyyyMMdd);

            SpiderLog spiderLog = saveLog(yyyyMMdd, result);
            //list.stream().forEach(System.out::println);
        }

        return  "SUCCESS";
    }


    public String catchRankData(String date) throws UnirestException {
        String yyyyMMdd = date;
        if(!StringUtils.hasText(yyyyMMdd)){
            LocalDate localDate = LocalDate.now().minusDays(1);
            yyyyMMdd = localDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        }

        Long dateCount = articleRankRepository.countByDate(yyyyMMdd);
        log.info(" 本次抓取  yyyyMMdd = " +yyyyMMdd +"数据");
        if (dateCount> 0 && dateCount > 100){
            Integer delCount = articleRankRepository.deleteByDate(yyyyMMdd);
            log.info("本次删除无效数据：{} " +delCount, yyyyMMdd);
            SpiderLog spiderLog = new SpiderLog();
            spiderLog.setRank_type("AR");
            spiderLog.setRank_date(yyyyMMdd);
            spiderLogRepository.delete(spiderLog);
            log.info("本次删除日志数据：{} " , yyyyMMdd);
        }

        log.info("本次抓取的上榜日期为" + yyyyMMdd);
        List<SpiderLog> list = spiderLogRepository.selectByRankDateRankType(yyyyMMdd, "AR");

        if (!CollectionUtils.isEmpty(list)){
            SpiderLog spiderLog = list.get(0);
            if ("S".equals(spiderLog.getStatus())) {
                log.info("日期 " + yyyyMMdd + " 的排名已经抓取");
                return "ALREADY";
            }else {
                log.info("日期 " + yyyyMMdd + " 的排名抓取失败");
            }
        }
        String result = catchAndSaveRankData(yyyyMMdd);

        SpiderLog spiderLog = saveLog(yyyyMMdd, result);
        //list.stream().forEach(System.out::println);
        return  "SUCCESS";
    }


    private String catchAndSaveRankData(String yyyyMMdd) throws UnirestException {
        log.info("开始抓取 " + yyyyMMdd +" 的文章排名数据！");
        GetRequest getRequest = Unirest.get(URL +yyyyMMdd);
        HttpResponse<String> stringResult = getRequest.asString();
        int status = stringResult.getStatus();
        if (status!=200 ){
            log.info("---抓取排名接口异常");
            return "Fail|"+status ;
        }
        //System.out.println("Status: " + status);
        //System.out.println("StatusText: " +stringResult.getStatusText());
        //System.out.println("Headers: " +stringResult.getHeaders());
        String body = stringResult.getBody();
        JSONObject responseJson = JSONObject.parseObject(body);
        String respDate = (String) responseJson.get("date");
        if (!yyyyMMdd.equals(respDate)){
            log.info("---请求日期与响应日期不符！！");
            return "Fail";
        }
        JSONArray notes = (JSONArray) responseJson.get("notes");
        List<ArticleRank> list = JSONObject.parseArray(notes.toString(),  ArticleRank.class);
        long size = list.size() ;
        if (size ==0){
            return "Fail|没有数据";
        }
        ArticleRank articleRank = null ;
        for(int index = 0 ; index < size ; index ++) {
            articleRank = list.get(index);
            articleRank.setRank_no(index+1);
            articleRank.setRank_date(yyyyMMdd);
            if (articleRank.getTitle()==null){
                articleRank.setTitle("该文章不可访问");
            }
            if (articleRank.getAuthor_nickname()==null){
                articleRank.setAuthor_nickname("该用户不在简书");
            }

            String pinyinString = null;
            try {
                pinyinString = PinyinHelper.convertToPinyinString(articleRank.getAuthor_nickname(), "", PinyinFormat.WITHOUT_TONE);
            } catch (PinyinException e) {
                log.info("转换失败 ： " + articleRank.getAuthor_nickname());
                e.printStackTrace();
            }
            articleRank.setAuthor_nickname_py(pinyinString);
            //System.out.println(articleRank.toString());
        }

        articleRankRepository.saveAll(list);
        log.info("排名数据保存成功！");
        return "SUCCESS";
    }


    private SpiderLog saveLog(String yyyyMMdd, String result){
        //保存结果

        List<SpiderLog> list = spiderLogRepository.selectByRankDateRankType(yyyyMMdd, "AR");
        SpiderLog spiderLog = null;
        if (CollectionUtils.isEmpty(list)){
            spiderLog = new SpiderLog();
            spiderLog.setRank_date(yyyyMMdd);
            spiderLog.setRank_type("AR");
        }else{
            spiderLog = list.get(0);

        }
        spiderLog.setExec_time(new Date());
        if (result.startsWith("SUCCESS")){
            spiderLog.setResult("SUCCESS");
            spiderLog.setStatus("S");
        }else{
            spiderLog.setResult(result);
            spiderLog.setStatus("F");
        }
        spiderLog =  spiderLogRepository.save(spiderLog);
        return spiderLog ;
    }


}
