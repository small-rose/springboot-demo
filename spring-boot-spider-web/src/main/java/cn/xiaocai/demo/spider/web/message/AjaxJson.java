package cn.xiaocai.demo.spider.web.message;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/9 12:03
 * @version: v1.0
 */
public class AjaxJson {

    //状态码
    private int code ;

    private String message;

    //查询数据
    private Map<String, Object> extend = new HashMap<>();

    public static AjaxJson success(){
        AjaxJson ajaxJson = new AjaxJson();
        ajaxJson.setCode(200);
        ajaxJson.setMessage("处理成功");
        return ajaxJson;
    }
    public static AjaxJson failed(){
        AjaxJson ajaxJson = new AjaxJson();
        ajaxJson.setCode(100);
        ajaxJson.setMessage("处理失败");
        return ajaxJson;
    }

    public static AjaxJson success(String msg){
        AjaxJson ajaxJson = new AjaxJson();
        ajaxJson.setCode(200);
        if(!StringUtils.hasText(msg)){
            msg = "处理成功";
        }
        ajaxJson.setMessage(msg);
        return ajaxJson;
    }

    public static AjaxJson failed(String msg){
        AjaxJson ajaxJson = new AjaxJson();
        ajaxJson.setCode(500);
        if(!StringUtils.hasText(msg)){
            msg = "处理失败";
        }
        ajaxJson.setMessage(msg);
        return ajaxJson;
    }

    public AjaxJson addData(String key,Object obj){
        this.getExtend().put(key, obj);
        return this;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }


}
