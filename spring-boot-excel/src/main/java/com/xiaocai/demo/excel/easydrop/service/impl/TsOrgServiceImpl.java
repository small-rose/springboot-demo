package com.xiaocai.demo.excel.easydrop.service.impl;

import com.xiaocai.demo.excel.dropdown.entity.TSysOrg;
import com.xiaocai.demo.excel.dropdown.mapper.TSysOrgMapper;
import com.xiaocai.demo.excel.easydrop.service.TsOrgService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TsOrgServiceImpl ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/24 14:08
 * @Version ： 1.0
 **/
@Slf4j
@Service
public class TsOrgServiceImpl implements TsOrgService {

    @Autowired
    private TSysOrgMapper tSysOrgMapper;


    @Override
    public Map<String, List<String>> getSubcompany() {
        Map<String, List<String>> result = new HashMap<>();
        List<String> list = new ArrayList<>();
        try {
            List<TSysOrg> tSysOrgs = tSysOrgMapper.findOrgListByEqualsLevel(1);
            tSysOrgs.stream().forEach(t->{
                list.add(t.getOrgName()+"_"+t.getUnionOrgCode());
            });
            result.put("branchCode",list);
        }catch (Exception e) {
            log.info("初始化excel下拉框失败！");
        }
        return result ;
    }

    @Override
    public Map<String, List<String>> getMidBranch() {

        Map<String,List<String>> map = new HashMap<>();

        try {
            List<TSysOrg> tSysOrgs = tSysOrgMapper.findOrgListByEqualsLevel(1);
            tSysOrgs.stream().forEach(t->{
                //根据分公司获得中支公司名称/Code
                List<String> list  = tSysOrgMapper.getUnionOrgCodeByOrgCode(t.getOrgCode());
                StringBuilder stringBuilder = getOrgName(t);
                List<String> result =  dataConvert( list);
                map.put(stringBuilder.toString(),result);
            });

            System.out.println("====================中支公司数据=========");
            map.forEach((k,v)->{
                System.out.println(" key = " +k);
                System.out.println(" val = " +v);
            });
            System.out.println("====================中支公司数据=========");

        }catch (Exception e) {
            log.info("初始化excel下拉框失败！");
        }
        return map;
    }

    @Override
    public Map<String, List<String>> getSubBranch() {
        Map<String,List<String>> map = new HashMap<>();

        try {
            List<TSysOrg> tSysOrgs = tSysOrgMapper.findOrgListByEqualsLevel(2);
            tSysOrgs.stream().forEach(t->{
                //根据中支公司获得支公司名称/code
                List<String> list  = tSysOrgMapper.getUnionOrgCodeByOrgCode(t.getOrgCode());
                StringBuilder stringBuilder = getOrgName(t);

                List<String> result = dataConvert(list);
                map.put(stringBuilder.toString(),result);
            });

            System.out.println("====================支公司数据=========");
            map.forEach((k,v)->{
                System.out.println(" key = " +k);
                System.out.println(" val = " +v);
            });
            System.out.println("====================支公司数据=========");

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
