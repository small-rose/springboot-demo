package com.xiaocai.demo.mockito.jmockdata;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.TypeReference;
import com.xiaocai.demo.mockito.jmockdata.bean.BasicBean;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JMockTest02 ] 说明： 集合类型的模拟
 * @Function :  功能说明： https://github.com/jsonzou/jmockdata.git
 * @Date ：2022/7/11 19:10
 * @Version ： 1.0
 **/

public class JMockTest02 {


    /**
     * 测试模拟--容器类型（LIST,SET,MAP）
     */
    @Test
    public void mockTest_Collections() {
        //******注意TypeReference要加{}才能模拟******

        //模拟基础类型，不建议使用这种方式，参考基础类型章节直接模拟。
        Integer integerNum = JMockData.mock(new TypeReference<Integer>(){});
        Integer[] integerArray = JMockData.mock(new TypeReference<Integer[]>(){});
        //模拟集合
        List<Integer> integerList = JMockData.mock(new TypeReference<List<Integer>>(){});
        //模拟数组集合
        List<Integer[]> integerArrayList = JMockData.mock(new TypeReference<List<Integer[]>>(){});
        //模拟集合数组
        List<Integer>[] integerListArray = JMockData.mock(new TypeReference<List<Integer>[]>(){});
        //模拟集合实体
        List<BasicBean> basicBeanList = JMockData.mock(new TypeReference<List<BasicBean>>(){});
        //各种组合忽略。。。。map同理。下面模拟一个不知道什么类型的map
        Map<List<Map<Integer, String[][]>>, Map<Set<String>, Double[]>> some = JMockData.mock(new TypeReference<Map<List<Map<Integer, String[][]>>, Map<Set<String>, Double[]>>>(){});


        //模拟集合
        List<String> stringList = JMockData.mock(new TypeReference<List<String>>(){});
        System.out.println(stringList);
    }



}
