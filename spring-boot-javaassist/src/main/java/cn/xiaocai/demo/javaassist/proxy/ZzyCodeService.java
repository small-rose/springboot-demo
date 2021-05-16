package cn.xiaocai.demo.javaassist.proxy;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/16 15:04
 * @version: v1.0
 */
public class ZzyCodeService {

    public String code(String code){
        System.out.println("this is my code work ...");
        System.out.println("code : " + code);
        return  "success";
    }
}
