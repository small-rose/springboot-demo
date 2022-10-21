package com.xiaocai.demo.hutools;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.text.StrSpliter;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FileUtilDemo ] 说明：无
 * @Function :  功能说明： 文件duxie
 * @Date ：2022/8/15 14:19
 * @Version ： 1.0
 **/
@Slf4j
public class FileUtilDemo {

    public void readFile(){
        log.info("开始执行风勘任务清单下发任务");

        String readPath = "";
        String readFileName = "";

        // 读取报表系统下发的
        FileReader fileReader = new FileReader(readPath);//默认UTF-8编码，可以在构造中传入第二个参数做为编码
        List<String> lineList = fileReader.readLines();
        if (CollectionUtils.isEmpty(lineList)){
            log.info("风勘任务下发清单无数据");
            return  ;
        }

        lineList.stream().forEach(l->{
            //按行处理数据
            //客户名称,企业代码  ,分公司,中支公司,支公司,经办人, 风险查勘员, 在保车辆数,风勘类型: 保前风勘/保中风勘
            String[] split = l.split(",");
            String[] split1 = StrUtil.split(l, ",");
            List<String> strings = StrSpliter.split(l, 0);
        });

        String targertPath = "";
        String fileName = "taskList2022";
        FileWriter fileWriter = new FileWriter(new File(targertPath+fileName));

        //生成风勘任务
        List<String> taskList = new ArrayList<>();
        taskList.stream().forEach(t->fileWriter.write(t, true));

        // 下发报表系统
        log.info("风勘任务清单下发任务执行完成");
    }
}
