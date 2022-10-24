package com.xiaocai.demo.excel.dropdown;

import com.xiaocai.demo.excel.SpringBootExcelApplication;
import com.xiaocai.demo.excel.dropdown.utils.ExcelUtils;
import com.xiaocai.demo.excel.dropdown.vo.ImportRenewalVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ DropdownDemoTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/18 14:11
 * @Version ： 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootExcelApplication.class)
public class DropdownDemoTest {


    @Test
    public void test_19() throws IOException {
        ExcelUtils.createExcel(new ImportRenewalVo(),null,null,null);
    }
}
