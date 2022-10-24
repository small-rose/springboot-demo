package com.xiaocai.demo.excel.easydrop.service.impl;


import com.xiaocai.demo.excel.easydrop.constants.EasyConstants;
import com.xiaocai.demo.excel.easydrop.service.DropDownSetInterface;

public class AuditStatusDropDownSetImpl implements DropDownSetInterface {
    @Override
    public String[] getSource() {
        return new String[]{
                EasyConstants.AuditStatus.AUDIT_A.getValue(),
                EasyConstants.AuditStatus.AUDIT_B.getValue(),
                EasyConstants.AuditStatus.AUDIT_C.getValue(),
                EasyConstants.AuditStatus.AUDIT_D.getValue(),
                EasyConstants.AuditStatus.AUDIT_E.getValue(),
                EasyConstants.AuditStatus.AUDIT_F.getValue(),
                EasyConstants.AuditStatus.AUDIT_G.getValue()
        };
    }
}
