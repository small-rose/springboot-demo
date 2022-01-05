package cn.xiaocai.demo.spider.web.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ CategoryPages ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/31 23:44
 * @Version ： 1.0
 **/
@Data
public class CategoryPages {

    @JSONField(ordinal = 1)
    protected String eleLocation ;

    @JSONField(ordinal = 2)
    protected List<String> skipKeys ;

}
