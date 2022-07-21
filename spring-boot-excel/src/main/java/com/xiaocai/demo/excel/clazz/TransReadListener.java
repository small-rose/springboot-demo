package com.xiaocai.demo.excel.clazz;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-29 11:07
 **/
public class TransReadListener extends AnalysisEventListener<Map<Integer, String>> {

    static List<Map<Integer, String>> readList = new ArrayList<>();
    static List<Map<String, Object>> preList = new ArrayList<>();
    static List<com.xiaocai.demo.excel.clasz.TransDtl> beanList = new ArrayList<>();
    @Override
    public void onException(Exception e, AnalysisContext analysisContext) throws Exception {
        e.printStackTrace();
    }

    @Override
    public void invoke(Map<Integer, String> transDtl, AnalysisContext analysisContext) {
        //System.out.println("解析到一条数据：" + transDtl.toString());
        readList.add(transDtl);
        if (readList.size()==4){
            HashMap<String, Object> data = new HashMap<>();
            for (int i = 0 ; i<3 ; i=i+2) {
                Map<Integer, String> keyMap = readList.get(i);
                Map<Integer, String> valueMap = readList.get(i+1);
                for (Integer integer : keyMap.keySet()) {
                    data.put(keyMap.get(integer), valueMap.get(integer)==null? "" : valueMap.get(integer));
                }
            }
            JSONObject json = new JSONObject(data);
            System.out.println(json.toJSONString());
            com.xiaocai.demo.excel.clasz.TransDtl transDtl1 = JSON.parseObject(json.toJSONString(), com.xiaocai.demo.excel.clasz.TransDtl.class);
            System.out.println(transDtl1);
            preList.add(data);
            beanList.add(transDtl1);
            readList.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("excel文件读取完毕！------------");


    }

    //@Override
    //public boolean hasNext(AnalysisContext analysisContext) {
    //    return false;
   // }

    //@Override
    //public void invokeHead(Map map, AnalysisContext analysisContext) {
    //    System.out.println(map);
   // }
}
