package com.example.temp.limit;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/19 21:07
 * @version: v1.0
 */
@Data
@AllArgsConstructor
public class TimeUnitTest {
    private static TimeUnit timeUnit;

    public static void main(String[] args) {
        timeUnit = TimeUnit.SECONDS ;
        System.out.println(timeUnit.toMillis(2));

        int blcok = 10 ;
        System.out.println( blcok << 1);
    }

}
