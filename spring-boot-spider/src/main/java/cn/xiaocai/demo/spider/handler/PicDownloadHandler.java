package cn.xiaocai.demo.spider.handler;

import cn.xiaocai.demo.spider.data.PicData;
import cn.xiaocai.demo.spider.data.PicLinkQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.rules.PicLinkRule;
import cn.xiaocai.demo.spider.utils.DownPicUtil;
import cn.xiaocai.demo.spider.utils.HttpsDownPicUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ DownloadHandler ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 11:19
 * @Version ： 1.0
 **/
@Slf4j
public class PicDownloadHandler extends BaseHandler{

    protected final PicLinkQueue picLinkQueue ;

    public PicDownloadHandler(PicLinkQueue picLinkQueue){
        this.picLinkQueue = picLinkQueue;

        this.rule = picLinkQueue.getRules() ;
    }


    private static final String path = "d:\\download\\";



    @Override
    public List<UrlData> analsysUrlList(UrlData doc) {
        return null;
    }


    @Override
    protected boolean skipRules(String absHref, String text) {
        return false;
    }

    @Override
    protected void execute(UrlData urlData) {
        //System.out.println("准备下载 ： "+urlData.getUrl());
        PicData picData = (PicData) urlData;
        PicLinkRule picRule = (PicLinkRule) rule;
        String downPath = path;
        if (StringUtils.hasLength(picRule.getDownLoadPath())){
            downPath = picRule.getDownLoadPath();
        }
        File file = new File(downPath);
        if (!file.getAbsolutePath().endsWith("/")){
            downPath += File.separator ;
        }
        if (StringUtils.hasLength(picData.getTag())){
            downPath += picData.getTag();
        }
        if (!file.getAbsolutePath().endsWith("/")){
            downPath += File.separator ;
        }
        if (StringUtils.hasLength(picData.getName())){
            downPath += picData.getName();
        }
        try {
            File createFile = new File(downPath);
            if(!createFile.exists()){
                createFile.mkdirs();
            }
            String path =  "xxx";
            if (picData.getUrl().startsWith("https")){
                path = HttpsDownPicUtil.save(downPath, picData.getUrl(), picData.getPicName(), picData.getSuffix(), picData.getReferer());
            }else {
                path = DownPicUtil.save(downPath, picData.getUrl(), picData.getPicName(), picData.getSuffix(), picData.getReferer());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("^_^ download pic success ,You can find it in "+ path);
    }


}