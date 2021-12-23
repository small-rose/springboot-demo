package cn.xiaocai.demo.jsoup.web.service.impl;

import cn.xiaocai.demo.jsoup.spider.utils.NetUtil;
import cn.xiaocai.demo.jsoup.web.service.CatchService;
import org.jsoup.nodes.Document;


/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 14:22
 **/
public class CatchServiceImpl implements CatchService {


    @Override
    public Document catchHtml(String url) {
        return NetUtil.getDocument(url);
    }

    @Override
    public String catchContent(Document doc) {
        return null;
    }
}
