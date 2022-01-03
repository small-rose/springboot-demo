package cn.xiaocai.demo.spider.handler;

import cn.xiaocai.demo.spider.data.LinkGroupPageQueue;
import cn.xiaocai.demo.spider.data.PicData;
import cn.xiaocai.demo.spider.data.PicLinkQueue;
import cn.xiaocai.demo.spider.data.UrlData;
import cn.xiaocai.demo.spider.rules.PicLinkRule;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/24 22:36
 * @version: v1.0
 */
@Slf4j
@Component
@Scope("prototype")
public class PicLinkHandler extends BaseHandler{

    protected  List<PicData>  picList = new CopyOnWriteArrayList<>();

    protected final LinkGroupPageQueue linkGroupPageQueue;
    protected final PicLinkQueue picLinkQueue;

    public PicLinkHandler(LinkGroupPageQueue linkGroupPageQueue, PicLinkQueue picQueue) {
        this.linkGroupPageQueue = linkGroupPageQueue;
        this.picLinkQueue = picQueue;
        this.rule = picQueue.getRules() ;
    }


    @Override
    public List<PicData> analsysUrlList(UrlData urlData) {
        picList.clear();
        return this.analysisImgUrl(urlData);
    }


    @Override
    protected boolean skipRules(String absHref, String text) {
        return false;
    }

    @Override
    protected void execute(UrlData urlData) {

    }


    public List<PicData> analysisImgUrl(UrlData paramData) {

        Document document = catchHandler.spyAsync(paramData);

        log.info("imgTags from : " + paramData.getUrl());
        log.info("imgTags rule : " + rule.getEleLocation());
         Elements imgTags = document.select(rule.getEleLocation());
        log.info("imgTags size : " + imgTags.size());
        PicData picData = null;
        for (Element link : imgTags) {
            String linkName = link.attr("alt");
            if(StringUtils.isEmpty(linkName) || "".equals(linkName.trim())){
                linkName = link.attr("title");
            }
            String absHref = "";
            if (link.hasClass(PicLinkRule.IMG_ATTR_DATA_ORIGINAL)){
                absHref = link.attr(PicLinkRule.IMG_DATA_ORIGINAL);
            }else{
                absHref = link.attr(PicLinkRule.IMG_SRC_NOMARL);
            }

            log.info("pic Link linkName :"+linkName +" , link = "+absHref);
            String urlFileName = absHref.substring(absHref.lastIndexOf("/")+1,absHref.length()-4);
            //String fileName = linkName.concat(urlFileName);

            picData = new PicData();
            picData.setReferer(paramData.getReferer());
            picData.setUrl(absHref);
            picData.setPicName(urlFileName);
            picData.setTag(paramData.getMark());
            picData.setName(paramData.getName());
            if (IS_MARK) {
                picData.setMark(paramData.getMark());
            }
            if (StringUtils.hasText(paramData.getTag())){
                picData.setTag(paramData.getTag());
            }else{
                picData.setTag(linkName);
            }

            String suffix = absHref.substring(absHref.lastIndexOf("."));
            picData.setSuffix(suffix);

            log.info("add a pic url data : " + picData);
            picList.add(picData);
            //picLinkQueue.add(urlData);
        }
        return picList ;
    }
}
