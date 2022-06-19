package com.xiaocai.demo.json.format;

import com.alibaba.fastjson.JSONObject;
import com.xiaocai.demo.json.bean.MyBean;
import com.xiaocai.demo.vo.UserVO;
import org.junit.Test;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ FormatTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/22 15:00
 * @Version ： 1.0
 **/
public class FormatTest {

    @Test
    public  void jsonFormat() {

        MyBean bean = new MyBean();
        bean.setStatus("1");
        bean.setReturnMsg("你的参数没有输入");
        String data = JSONObject.toJSONString(bean);
        System.out.println(data);

        UserVO userVO = new UserVO();
        userVO.setUser("zxc");
        userVO.setPass("123456");
        String result = JSONObject.toJSONString(userVO);
        System.out.println(result);
    }
}
