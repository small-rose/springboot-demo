package com.xiaocai.demo.excel.easydrop.service.casecade;

import com.xiaocai.demo.excel.dropdown.helper.SpringApplicationContextHelper;
import com.xiaocai.demo.excel.easydrop.service.DropDownCaseCadeSetInterface;
import com.xiaocai.demo.excel.easydrop.service.TsOrgService;

import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SubcompanyDataService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/24 15:55
 * @Version ： 1.0
 **/

/**
 * 取1级 分公司
 */


public class MidBranchDataServiceImpl implements DropDownCaseCadeSetInterface {

    @Override
    public Map<String, List<String>> getSource() {
        TsOrgService tsOrgService = SpringApplicationContextHelper.getBean(TsOrgService.class);

        return tsOrgService.getMidBranch();
    }
}
