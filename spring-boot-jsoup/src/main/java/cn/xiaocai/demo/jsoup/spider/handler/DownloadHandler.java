package cn.xiaocai.demo.jsoup.spider.handler;

import cn.xiaocai.demo.jsoup.spider.data.PicData;
import cn.xiaocai.demo.jsoup.spider.data.UrlData;
import cn.xiaocai.demo.jsoup.spider.utils.DownPicUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
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
public class DownloadHandler {

    private static final String path = "d:\\download\\";

    public void down(PicData picData) {
        DownPicUtil.save(path, picData.getUrl(), picData.getPicName(), picData.getSuffix());
        log.info("save pic success "+ picData.getUrl());
    }


}
