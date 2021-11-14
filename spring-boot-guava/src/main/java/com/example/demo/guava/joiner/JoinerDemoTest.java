package com.example.demo.guava.joiner;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  Joiner 是个连接器，用分隔符将多个字符串（或数组元素）连接成一个字符串。
 * 常用方法如下：
 *
 *     （1）on(String)：静态工厂方法，生成一个新的 Joiner 对象，参数为连接符
 *     （2）skipNulls()：如果元素为空，则跳过
 *     （3）useForNull(String)：如果元素为空，则用这个字符串代替
 *     （4）join(数组/链表)：要连接的数组/链表
 *     （5）appendTo(String,数组/链表)：在第一个参数后面新加上 拼接后的字符串
 *     （6）withKeyValueSeparator(String)：得到 MapJoiner，连接Map的键、值
 *
 * 注意：joiner实例总是不可变的。用来定义joiner目标语义的配置方法总会返回一个新的joiner实例。这使得joiner实例都是线程安全的，你可以将其定义为static final常量。
 * @author: 张小菜
 * @date: 2021/11/14 21:35
 * @version: v1.0
 */
public class JoinerDemoTest {

    @Test
    public void joiner_Test_on(){
        List<String> list1 = Arrays.asList("aa", "bb", "cc");
        System.out.println(Joiner.on("-").join(list1));
        //aa-bb-cc
    }

    @Test
    public void joiner_Test_skipNulls(){
        List<String> list2 = Arrays.asList("aa", "bb", "cc", null, "dd");
        System.out.println(Joiner.on("-").skipNulls().join(list2));
        // aa-bb-cc-dd
    }

    @Test
    public void joiner_Test_useForNull(){
        List<String> list2 = Arrays.asList("aa", "bb", "cc", null, "dd");
        System.out.println(Joiner.on("-").useForNull("null123").join(list2));
        // aa-bb-cc-null123-dd
    }

    @Test
    public void joiner_Test_withKeyValueSeparator(){

        Map map = ImmutableMap.of("k1", "v1", "k2", "v2");
        System.out.println(Joiner.on("-").withKeyValueSeparator("=").join(map));
        // k1=v1-k2=v2
    }

    @Test
    public void joiner_Test_appendTo(){

        StringBuilder sb = new StringBuilder("result:");
        Joiner.on(", ").appendTo(sb, 1, 2, 3);
        System.out.println(sb);//result:1 2 3
    }
}
