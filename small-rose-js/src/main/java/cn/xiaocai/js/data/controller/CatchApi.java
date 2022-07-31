package cn.xiaocai.js.data.controller;

import cn.xiaocai.js.data.config.fuzhu.CacheManager;
import cn.xiaocai.js.data.persistence.service.SearchService;
import cn.xiaocai.js.data.servce.ArticleRankTaskService;
import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 14:36
 * @version: v1.0
 */
@EnableSwaggerBootstrapUI
@Slf4j
@RestController
@Api(value = "保留测试", description="保留测试", tags="保留测试")
public class CatchApi {
    @Autowired
    private ArticleRankTaskService articleRankTaskService;
    @Autowired
    private SearchService searchService;
    @Autowired
    CacheManager cacheManager ;

    @GetMapping("/cache/{number}")
    @ApiOperation(value = "执行入口-删除某日期数据",response = String.class)
    public String cache(@PathVariable(name = "number", required = true) long number) {
        if (number <=0){
            number = 30;
        }
        cacheManager.setLimit(number);
        return "操作成功,显示缓存变为 " + cacheManager.getLimit() +" 。";
    }

    @GetMapping("/clear/{billDate}")
    @ApiOperation(value = "执行入口-删除某日期数据",response = String.class)
    public String deleAll(@PathVariable(name = "billDate", required = false) String billDate) {
        if (billDate==null || billDate=="0"){
            billDate = "";
        }
        List<String> dateList = null;
        if (billDate.contains(",")){
            String[] split = billDate.split(",");
            dateList = Arrays.asList(split);
        }else{
            dateList = new ArrayList<>();
            dateList.add(billDate);
        }
        dateList.stream().forEach(System.out::println);
        Integer all = searchService.deleteAll(dateList);
        return "操作成功,累计处理 " + all +" 条数据。";
    }

    @GetMapping("/do/{billDate}")
    @ApiOperation(value = "执行入口-抓取某日期数据",response = String.class)
    public String docatch(@PathVariable(name = "billDate") String billDate) {
        String result = "SUCCESS";
        try {
            if (!isValidDate(billDate)){
                result = "日期格式非法，请使用格式yyyyMMdd";
                return result ;
            }
            articleRankTaskService.catchRankData(billDate, null);
        } catch (UnirestException e) {
            e.printStackTrace();
            result = "ERROR:" +e.getLocalizedMessage();
        }
        return result;
    }

    @GetMapping("/do/{start}/{end}")
    @ApiOperation(value = "执行入口-抓取日期区间数据",response = String.class)
    public String doSearch(@PathVariable(name = "start") String start, @PathVariable(name = "end") String end) {
        String result = "SUCCESS";

        try {
            if (!isValidDate(start) || !isValidDate(end) ){
                result = "日期格式非法，请使用格式yyyyMMdd";
                return result ;
            }
            articleRankTaskService.catchRankData(start, end);
        } catch (UnirestException e) {
            e.printStackTrace();
            result = "ERROR:" +e.getLocalizedMessage();
        }
        return result;
    }


    /**
     * 校验日期格式
     *
     * @param str
     * @return
     */
    private  boolean isValidDate(String str) {
        boolean convertSuccess = true;
        if (!StringUtils.hasText(str)){
            return false ;
        }
        //判断字符串长度是否为8位
        if (str.length() == 8) {
            // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            try {
                // 设置lenient为false.
                // 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
                format.setLenient(false);
                Date dateStr = format.parse(str);

                if (dateStr.after(new Date())) { //对账不能使用未到来的日期
                    convertSuccess = false;
                }
                LocalDate localDate = LocalDate.now();
                LocalDate before = localDate.minusMonths(6);
                log.info("--对账单处理限制日志： " +before);
                Date beforedate = Date.from(before.atStartOfDay(ZoneOffset.ofHours(8)).toInstant());
                if (dateStr.before(beforedate)) { //对账不能使用历史6个月之前的
                    convertSuccess = false;
                }

            } catch (Exception e) {
                // e.printStackTrace();
                // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
                convertSuccess = false;
            }
        } else {
            convertSuccess = false;
        }
        return convertSuccess;
    }
}
