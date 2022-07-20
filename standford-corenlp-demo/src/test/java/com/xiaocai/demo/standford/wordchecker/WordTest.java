package com.xiaocai.demo.standford.wordchecker;

import com.github.houbb.word.checker.util.ZhWordCheckers;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ WordTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/18 13:33
 * @Version ： 1.0
 **/
public class WordTest {

    @Test
    public void test_14(){
        final String word = "一位老人，一位普通的老人，他穿着谱通的粗麻衣，肩上扛着一把锄头，一手搭着锄头把，一手拎着一把野菜，不紧不慢地行走在山下的小路上。\n" +
                "\n" +
                "夕阳，已被远处的南山遮住了大半。远处的霞光里，一只黑色的鸟缓缓飞来，进入树林数息，又振翅飞起，盘旋了两周之后，钻进了山林里。老人看了一眼树林，又继续往回家的方向。\n" +
                "\n" +
                "他的后背已汗湿，他晒得暗红的脸也布满细细的汗珠，汗珠直接填满了皱纹，下颌的美髯略显凌乱。";


        List<String> stringList = ZhWordCheckers.correctList(word);
        //./Assert.assertEquals("[万变不离其]", stringList.toString());
        System.out.println(stringList);
    }
}
