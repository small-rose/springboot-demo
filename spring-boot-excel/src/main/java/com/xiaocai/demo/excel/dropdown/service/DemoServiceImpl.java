package com.xiaocai.demo.excel.dropdown.service;


import com.xiaocai.demo.excel.dropdown.entity.TSysOrg;
import com.xiaocai.demo.excel.dropdown.mapper.TSysOrgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project : businessVehicleIntelligent
 * @Author : zengfangling
 * @Description : [ ServiceImpl ] 说明：无
 * @Function :  功能说明：无
 * @Date : 2022/10/11 17:35
 * @Version ： 1.0
 **/
@Service
public class DemoServiceImpl {

    @Autowired
    private TSysOrgMapper tSysOrgMapper;

    public List<TSysOrg> findOrgListByEqualsLevel(Integer level){
        List<TSysOrg> list = tSysOrgMapper.findOrgListByEqualsLevel(level);
        return list == null? new ArrayList<>():list;
    }

    public List<String> getUnionOrgCodeByOrgCode(String orgCode){
        List<String> list = tSysOrgMapper.getUnionOrgCodeByOrgCode(orgCode);
        return list == null? new ArrayList<>():list;
    }
}
