package com.xiaocai.demo.convertor.bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 *  json demo
 */
public class UserInfoTest {


    @Test
    public void test_11(){
        ObjectMapper objectMapper = new ObjectMapper();
        UserInfo userInfo1 = new UserInfo("李寻欢",28,"男",new Date(), Arrays.asList("孙晓红","阿飞"));
        UserInfo userInfo2 = new UserInfo("张小菜",18,"男",new Date(), Arrays.asList("张三","李四"));
        try {
            //对象转json字符串
            String jsonString = objectMapper.writeValueAsString(userInfo1);

            String jsons = "[{\"name\":\"李寻欢\",\"number\":28,\"birth\":\"2022-07-21\",\"friendList\":[\"孙晓红\",\"阿飞\"],\"s\":\"男\"},{\"name\":\"张小菜\",\"number\":18,\"birth\":\"2022-07-21\",\"friendList\":[\"张三\",\"李四\"],\"s\":\"男\"}]";

            //json字符串转为对象
            UserInfo emp1 = objectMapper.readValue(jsons, UserInfo.class);
            System.out.println("json字符串：" + jsonString);
            System.out.println("对象1：" + emp1);

            System.out.println("====================================================");

            //对象转为json字符串写入文件
            objectMapper.writeValue(new File("emp.json"), userInfo1);
            //从文件中读取json字符串转为对象
            UserInfo emp2 = objectMapper.readValue(new File("emp.json"), UserInfo.class);
            System.out.println("对象2：" + emp2);

            System.out.println("====================================================");

            //对象写为字节流
            byte[] bytes = objectMapper.writeValueAsBytes(userInfo1);
            //字节流转为对象
            UserInfo emp3 = objectMapper.readValue(bytes, UserInfo.class);
            System.out.println("对象3：" + emp3);

            System.out.println();
            System.out.println("*****************************************************");
            System.out.println();

            //Map和json互转
            Map<String, Object> map = Maps.newHashMap();
            map.put("001", userInfo1);
            map.put("002", "元旦");
            String mapToString = objectMapper.writeValueAsString(map);
            Map<String, Object> stringToMap = objectMapper.readValue(mapToString, new TypeReference<Map<String, Object>>() {
            });
            System.out.println("json字符串：" + mapToString);
            System.out.println("map：" + stringToMap);

            System.out.println("====================================================");

            //List和json互转
            List<UserInfo> empList = Lists.newArrayList(userInfo1, userInfo2);
            String jsonList = objectMapper.writeValueAsString(empList);
            List<UserInfo> stringToList = objectMapper.readValue(jsonList, new TypeReference<List<UserInfo>>() {
            });
            System.out.println("json字符串：" + jsonList);
            System.out.println("map：" + stringToList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}