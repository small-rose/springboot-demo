package cn.xiaocai.demo.kingbase.test;

import cn.xiaocai.demo.kingbase.web.mapper.kingbase.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/4/24 10:07
 * @version: v1.0
 */

@RunWith( SpringRunner.class)
@SpringBootTest()
public class KingbaseTest {


    @Autowired
    TestMapper testMapper;

    @Test
    public void test01(){
        testMapper.test();
    }
}
