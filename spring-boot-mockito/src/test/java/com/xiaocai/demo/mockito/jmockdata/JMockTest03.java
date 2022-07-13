package com.xiaocai.demo.mockito.jmockdata;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import com.xiaocai.demo.mockito.jmockdata.bean.AXB;
import com.xiaocai.demo.mockito.jmockdata.bean.BasicBean;
import com.xiaocai.demo.mockito.jmockdata.bean.RegexTestDataBean;
import com.xiaocai.demo.mockito.jmockdata.bean.SelfRefData;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertSame;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ JMockTest02 ] 说明： 定制化的mock
 * @Function :  功能说明： https://github.com/jsonzou/jmockdata.git
 * @Date ：2022/7/11 19:10
 * @Version ： 1.0
 **/

public class JMockTest03 {


    /**
     * 更改随机范围以及排除某些不模拟数据的字段
     * 字段支持三种模式匹配，可快速配置：[*FieldWord*]、[*FieldWord]、[FieldWord*]
     */
    @Test
    public void mockTest_specail() {
        MockConfig mockConfig = new MockConfig()
                // 全局配置
                .globalConfig()
                .setEnabledStatic(false)
                .setEnabledPrivate(false)
                .setEnabledPublic(false)
                .setEnabledProtected(false)
                .sizeRange(1,1)
                .charSeed((char) 97, (char) 98)
                .byteRange((byte) 0, Byte.MAX_VALUE)
                .shortRange((short) 0, Short.MAX_VALUE)

                // 某些字段（名等于integerNum的字段、包含float的字段、double开头的字段）配置
                .subConfig("integerNum","*float*","double*")
                .intRange(10, 11)
                .floatRange(1.22f, 1.50f)
                .doubleRange(1.50,1.99)

                // 某个类的某些字段（long开头的字段、date结尾的字段、包含string的字段）配置。
                .subConfig(BasicBean.class,"long*","*date","*string*")
                .longRange(12, 13)
                .dateRange("2018-11-20", "2018-11-30")
                .stringSeed("SAVED", "REJECT", "APPROVED")
                .sizeRange(1,1)

                // 全局配置
                .globalConfig()
                // 排除所有包含list/set/map字符的字段。表达式不区分大小写。
                .excludes("*List*","*Set*","*Map*")
                // 排除所有Array开头/Boxing结尾的字段。表达式不区分大小写。
                .excludes(BasicBean.class,"*Array","Boxing*");
        BasicBean basicBean = JMockData.mock(BasicBean.class, mockConfig);
        System.out.println(basicBean);
    }

    /**
     * 设置小数位数
     */
    public void testDecimalScaleMock() {
        MockConfig mockConfig = new MockConfig()
                .doubleRange(-1.1d,9999.99999d)
                .floatRange(-1.11111f,9999.99999f)
                .decimalScale(3) // 设置小数位数为3，默认是2
                .globalConfig();
        JMockData.mock(BigDecimal.class,mockConfig);
    }

    /**
     * 正则模拟数据
     * 支持\w \W \d \D \s \S
     * 支持[0-9a-zA-Z] [abc123_]
     * 支持{n} {n,} {n,m}
     * 支持 * + . ?
     * 不支持其他，如() ^ $ | \n \t \cx \b \B \f 等等
     */
    @Test
    public void testRegexMock() {
        MockConfig mockConfig = new MockConfig()
                // 随机段落字符串
                .stringRegex("I'am a nice man\\.And I'll just scribble the characters, like：[a-z]{2}-[0-9]{2}-[abc123]{2}-\\w{2}-\\d{2}@\\s{1}-\\S{1}\\.?-.")
                // 邮箱
                .subConfig(RegexTestDataBean.class,"userEmail")
                .stringRegex("[a-z0-9]{5,15}\\@\\w{3,5}\\.[a-z]{2,3}")
                // 用户名规则
                .subConfig(RegexTestDataBean.class,"userName")
                .stringRegex("[a-zA-Z_]{1}[a-z0-9_]{5,15}")
                // 年龄
                .subConfig(RegexTestDataBean.class,"userAge")
                .numberRegex("[1-9]{1}\\d?")
                // 用户现金
                .subConfig(RegexTestDataBean.class,"userMoney")
                .numberRegex("[1-9]{2}\\.\\d?")
                // 用户的得分
                .subConfig(RegexTestDataBean.class,"userScore")
                .numberRegex("[1-9]{1}\\d{1}")
                // 用户身价
                .subConfig(RegexTestDataBean.class,"userValue")
                .numberRegex("[1-9]{1}\\d{3,8}")
                .globalConfig();

    }

    /**
     * bug ...  StackOverflowError
     */
    @Test
    public void testCircular() {
        AXB axb = JMockData.mock(AXB.class);
        AXB circularAxb = axb.getBXA().getAXB();
        assertSame(axb, circularAxb);
    }

    /**
     * bug ...  StackOverflowError
     */
    @Test
    public void testSelf() {
        SelfRefData selfRefData = JMockData.mock(SelfRefData.class);
        assertSame(selfRefData.getParent(), selfRefData);
    }
}
