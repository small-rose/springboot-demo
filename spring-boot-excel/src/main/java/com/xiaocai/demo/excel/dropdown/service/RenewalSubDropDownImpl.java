package com.xiaocai.demo.excel.dropdown.service;

import com.xiaocai.demo.excel.dropdown.constants.RenewalConstants;
import com.xiaocai.demo.excel.dropdown.entity.TSysOrg;
import com.xiaocai.demo.excel.dropdown.helper.SpringApplicationContextHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RenewalSubDropDownImpl ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/13 13:36
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class RenewalSubDropDownImpl {

    public List<String> getXBType(){
        List<String> list = new ArrayList<>();
        list.add(RenewalConstants.RenewalTypeEnum.NEW.getDescription());
        list.add(RenewalConstants.RenewalTypeEnum.RENEWAL.getDescription());
        list.add(RenewalConstants.RenewalTypeEnum.CONTINUTE.getDescription());
        list.add(RenewalConstants.RenewalTypeEnum.EXPIRED.getDescription());
        list.add(RenewalConstants.RenewalTypeEnum.WINBACK.getDescription());
        return list;
    }

    //分公司
    public List<String> getBranchCode(){
        DemoServiceImpl service = SpringApplicationContextHelper.getBean(DemoServiceImpl.class);

//        List<String> list = new ArrayList<>();
//        list.add("河北分公司");
//        return list;
        List<String> list = new ArrayList<>();
        try {
            List<TSysOrg> tSysOrgs = service.findOrgListByEqualsLevel(1);
            tSysOrgs.stream().forEach(t->{
                list.add(t.getOrgName()+"_"+t.getUnionOrgCode());
            });
        }catch (Exception e) {
            log.info("初始化excel下拉框失败！");
        }
        return list;
    }

    //中支公司
    public Map<String,List<String>> getMidBranchCode(){
        DemoServiceImpl service = SpringApplicationContextHelper.getBean(DemoServiceImpl.class);

//        Map<String,List<String>> map = new HashMap<>();
//        List<String> list = new ArrayList<>();
//        list.add("河北中支公司");
//        list.add("河北1号中支公司");
//        map.put("河北分公司",list);
//        return map;
        Map<String,List<String>> map = new HashMap<>();

        try {
            List<TSysOrg> tSysOrgs = service.findOrgListByEqualsLevel(1);
            tSysOrgs.stream().forEach(t->{
                //根据分公司获得中支公司名称/Code
                List<String> list  = service.getUnionOrgCodeByOrgCode(t.getOrgCode());
                StringBuilder stringBuilder = getOrgName(t);
                List<String> result =  dataConvert( list);
                map.put(stringBuilder.toString(),result);
            });

            System.out.println("====================中支公司数据start=====");
            map.forEach((k,v)->{
                System.out.println(" key = " +k);
                System.out.println(" val = " +v);
            });
            System.out.println("====================中支公司数据end=======");

        }catch (Exception e) {
            log.info("初始化excel下拉框失败！");
        }
        return map;
    }

    //支公司
    public Map<String,List<String>> getSubBranchCode(){

        DemoServiceImpl service = SpringApplicationContextHelper.getBean(DemoServiceImpl.class);

//
//        Map<String,List<String>> map = new HashMap<>();
//        List<String> list = new ArrayList<>();
//        list.add("河北支公司1");
//        list.add("河北支公司2");
//        List<String> list1 = new ArrayList<>();
//        list1.add("河北1号支公司");
//        list1.add("河北2号支公司");
//
//        map.put("河北中支公司",list);
//        map.put("河北1号中支公司",list1);
//
//        return map;
        Map<String,List<String>> map = new HashMap<>();

        try {
            List<TSysOrg> tSysOrgs = service.findOrgListByEqualsLevel(2);
            tSysOrgs.stream().forEach(t->{
                //根据中支公司获得支公司名称/code
                List<String> list  = service.getUnionOrgCodeByOrgCode(t.getOrgCode());
                StringBuilder stringBuilder = getOrgName(t);

                List<String> result = dataConvert(list);
                map.put(stringBuilder.toString(),result);
            });

            System.out.println("====================支公司数据start=====");
            map.forEach((k,v)->{
                System.out.println(" key = " +k);
                System.out.println(" val = " +v);
            });
            System.out.println("====================支公司数据end=======");
        }catch (Exception e) {
            log.info("初始化excel下拉框失败！");
        }
        return map;
    }

    public StringBuilder getOrgName(TSysOrg t){

        //导入时获取code从最后一个下划线开始
        StringBuilder stringBuilder = new StringBuilder();
        t.setOrgName(t.getOrgName().contains("-")?t.getOrgName().replace('-','_'):t.getOrgName());
        t.setOrgName(t.getOrgName().contains("（")?t.getOrgName().replace('（','_'):t.getOrgName());
        t.setOrgName(t.getOrgName().contains("）")?t.getOrgName().replace('）','_'):t.getOrgName());
        t.setOrgName(t.getOrgName().contains(" ")?t.getOrgName().replace(" ",""):t.getOrgName());

        //org_name为一串数字 举例：5436567，则在数字前加上 下划线  匹配行首是0-9
        if(t.getOrgName().matches("^[0-9].*$")){
            stringBuilder.append("_").append(t.getOrgName());
        }else {
            stringBuilder.append(t.getOrgName());
        }
        stringBuilder.append("_"+t.getUnionOrgCode());

        return stringBuilder;
    }


    public List<String> dataConvert(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String m:list) {
            if(m.contains("-")){
                m = m.replace('-','_');
            }
            if(m.contains("（")){
                m = m.replace('（','_') ;
            }
            if(m.contains("）")){
                m = m.replace('）','_');
            }
            if(m.contains(" ")){
                m = m.replace(" ","");
            }
            result.add(m);
        }
        return result;
    }
}
