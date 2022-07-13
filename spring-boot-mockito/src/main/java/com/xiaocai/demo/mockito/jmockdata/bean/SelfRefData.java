package com.xiaocai.demo.mockito.jmockdata.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SelfRefData ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/12 10:19
 * @Version ： 1.0
 **/
@Data
public class SelfRefData {

    private Integer id;
    private String name;
    private SelfRefData parent;
    private Map<SelfRefData, SelfRefData> parentMap;
    private SelfRefData[] parentArray;
    private List<SelfRefData> list;
    private List<SelfRefData[]> listArray;
    private List<List<SelfRefData[]>> listListArray;
    private List<SelfRefData>[] arrayList;

    private SelfRefData[][][] data;
    private Map<SelfRefData, SelfRefData[]> mapArray;
    private Map<SelfRefData, List<SelfRefData>> mapList;
    private Map<SelfRefData, List<SelfRefData[]>> mapListArray;
}
