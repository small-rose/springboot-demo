package com.xiaocai.demo.excel.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 11:07
 **/
public class ExcelReadListener extends AnalysisEventListener<IndexOrNameData> {
    @Override
    public void onException(Exception e, AnalysisContext analysisContext) throws Exception {
        e.printStackTrace();
    }

    @Override
    public void invoke(IndexOrNameData indexOrNameData, AnalysisContext analysisContext) {
        System.out.println("解析到一条数据：" + indexOrNameData);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        //System.out.println("excel文件读取完毕！");
    }

    @Override
    public boolean hasNext(AnalysisContext analysisContext) {
        return false;
    }

    @Override
    public void invokeHead(Map map, AnalysisContext analysisContext) {
        System.out.println(map);
    }
}
