package com.xiaocai.demo.excel.easydrop.service.drop;

import com.xiaocai.demo.excel.dropdown.helper.SpringApplicationContextHelper;
import com.xiaocai.demo.excel.easydrop.service.DropDownSetInterface;
import com.xiaocai.demo.excel.easydrop.service.TsOrgService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class BranchCodeDropDownSetImpl implements DropDownSetInterface {

    @Override
    public String[] getSource() {

        TsOrgService tsOrgService = SpringApplicationContextHelper.getBean(TsOrgService.class);
        String str = "";
        try {
            Map<String, List<String>> unitList = tsOrgService.getSubcompany();

            List<String> list = unitList.get("branchCode");
            str = list.stream().collect(Collectors.joining(","));
        } catch (Exception e) {
            log.info("初始化excel下拉框失败！");
        }
        String[] split = str.split(",");
        return split;
    }
}
