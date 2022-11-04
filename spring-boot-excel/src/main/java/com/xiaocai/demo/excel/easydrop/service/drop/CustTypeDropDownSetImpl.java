package com.xiaocai.demo.excel.easydrop.service.drop;

import com.xiaocai.demo.excel.easydrop.constants.EasyConstants;
import com.xiaocai.demo.excel.easydrop.service.DropDownSetInterface;

public class CustTypeDropDownSetImpl implements DropDownSetInterface {

    @Override
    public String[] getSource() {
        return new String[]{
                EasyConstants.CustTypeEnum.POLICY_HOLDER.getCustTypeName(),
                EasyConstants.CustTypeEnum.INSURANT.getCustTypeName(),
                EasyConstants.CustTypeEnum.CAR_OWNER.getCustTypeName()
        };
    }
}
