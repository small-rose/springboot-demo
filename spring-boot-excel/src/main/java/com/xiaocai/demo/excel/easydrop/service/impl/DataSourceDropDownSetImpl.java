package com.xiaocai.demo.excel.easydrop.service.impl;


import com.xiaocai.demo.excel.easydrop.constants.EasyConstants;
import com.xiaocai.demo.excel.easydrop.service.DropDownSetInterface;

/**
 * @author zhangxiaocai
 */
public class DataSourceDropDownSetImpl implements DropDownSetInterface {
    @Override
    public String[] getSource() {
        return new String[]{
                EasyConstants.DataSource.P09.getValue(),
                EasyConstants.DataSource.IMPORT.getValue()
        };
    }
}
