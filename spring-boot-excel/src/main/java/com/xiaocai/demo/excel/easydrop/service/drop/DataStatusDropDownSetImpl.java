package com.xiaocai.demo.excel.easydrop.service.drop;

import com.xiaocai.demo.excel.easydrop.constants.EasyConstants;
import com.xiaocai.demo.excel.easydrop.service.DropDownSetInterface;

public class DataStatusDropDownSetImpl implements DropDownSetInterface {
    @Override
    public String[] getSource() {
        return new String[]{
                EasyConstants.DataStatus.DATA_A.getValue(),
                EasyConstants.DataStatus.DATA_B.getValue(),
                EasyConstants.DataStatus.DATA_C.getValue(),
                EasyConstants.DataStatus.DATA_D.getValue(),
                EasyConstants.DataStatus.DATA_E.getValue()
        };
    }
}
