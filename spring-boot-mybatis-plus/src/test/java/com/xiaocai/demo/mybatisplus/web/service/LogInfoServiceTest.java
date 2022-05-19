package com.xiaocai.demo.mybatisplus.web.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatisplus.MybatisPlusDemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;


@SpringBootTest(classes= MybatisPlusDemoApplication.class)
class LogInfoServiceTest {

    @SpyBean
    LogInfoService logInfoService ;

    @Test
    void selectLogs() {
        Page result = logInfoService.selectLogs(1,10, null);
        System.out.println(result);

    }
}