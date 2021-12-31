package cn.xiaocai.demo.spider.utils;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/30 23:14
 * @version: v1.0
 */
public class CamelCaseUtil {

    public static String midScoreToCamelCase(String content){
        String tempStr = content;
        if (StringUtils.isEmpty(tempStr)){
            return "";
        }
        if (StringUtils.hasText(tempStr) && !tempStr.contains("-")){
            return tempStr ;
        }

        String[] arr = tempStr.split("-");
        String[] result = new String[arr.length-1];
        for (int i = 1; i < arr.length; i++) {
            result[i-1] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }
        String start = arr[0] + String.join("", result);
        return start ;
    }



    public static String camelCaseTomidScore(String content){
        String tempStr = content;
        if (StringUtils.isEmpty(tempStr)){
            return "";
        }

        char[] chars = tempStr.toCharArray();
        List<Character> result = new ArrayList<>();
        for (int i = 1; i < chars.length; i++) {

            if (Character.isUpperCase(chars[i])){
                result.add('-');
                result.add(Character.toLowerCase(chars[i]));
            }else{
                result.add(chars[i]);
            }

        }
        String midScore = Character.toString(chars[0]) ;
        for (Character character : result){
            midScore = midScore.concat(String.valueOf(character));
        }
        return midScore ;
    }


    public static void main(String[] args) {

        String name = "midscore-to-camel-case" ;
        System.out.println(midScoreToCamelCase(name));
        String camelCase = "midscoreToCamelCase" ;

        System.out.println(camelCaseTomidScore(camelCase));
    }
}
