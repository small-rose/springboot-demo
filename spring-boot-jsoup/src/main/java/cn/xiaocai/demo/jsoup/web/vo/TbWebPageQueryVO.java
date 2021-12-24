package cn.xiaocai.demo.jsoup.web.vo;

import cn.xiaocai.demo.jsoup.web.model.TbWebPage;
import cn.xiaocai.demo.jsoup.web.model.TbWebSite;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TbWebSiteQueryVO ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/24 15:47
 * @Version ： 1.0
 **/

@Slf4j
@Data
public class TbWebPageQueryVO extends TbWebPage {


    /**
     * 查询条件开始时间
     */
    private String start;

    /**
     * 查询条件结束
     */
    private String end ;
}
