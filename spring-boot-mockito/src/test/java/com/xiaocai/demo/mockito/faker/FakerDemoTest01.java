package com.xiaocai.demo.mockito.faker;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FakerDemoTest01 ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/12 10:40
 * @Version ： 1.0
 **/
public class FakerDemoTest01 {


    @Test
    public void test_15(){

        Faker faker = new Faker(Locale.CHINA);

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        System.out.println(" name = " + name);
        System.out.println(" firstName = " + firstName);
        System.out.println(" lastName = " + lastName);
        System.out.println(" streetAddress = " + streetAddress);


    }
}
