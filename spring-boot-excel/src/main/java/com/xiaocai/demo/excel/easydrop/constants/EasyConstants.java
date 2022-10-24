package com.xiaocai.demo.excel.easydrop.constants;

import java.util.Arrays;

/**
 * @author zhangxiaocai
 */
public class EasyConstants {

    /**
     * 客户清单枚举类型
     */
    public enum CustTypeEnum{
        POLICY_HOLDER("01","投保人"),
        INSURANT("02","被保人"),
        CAR_OWNER("03","车主");
        private String custTypeCode;

        private String custTypeName;

        CustTypeEnum(String custTypeCode, String custTypeName) {
            this.custTypeCode = custTypeCode;
            this.custTypeName = custTypeName;
        }

        public String getCustTypeCode() {
            return custTypeCode;
        }

        public void setCustTypeCode(String custTypeCode) {
            this.custTypeCode = custTypeCode;
        }

        public String getCustTypeName() {
            return custTypeName;
        }

        public void setCustTypeName(String custTypeName) {
            this.custTypeName = custTypeName;
        }


        public static String[] codeList() {
            return Arrays.stream(values()).map(CustTypeEnum::getCustTypeCode).distinct().toArray(String[]::new);
        }
    }


    /**
     * 数据来源
     */
    public enum DataSource {
        P09("1","P09"),
        IMPORT("2","调入");

        DataSource(String code, String value){
            this.code = code;
            this.value = value;
        }

        private String code;

        private String value;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    /**
     * 数据状态
     */
    public enum DataStatus {
        DATA_A("01","未确认"),
        DATA_B("02","已确认"),
        DATA_C("03","调出"),
        DATA_D("04","调入已确认"),
        DATA_E("05","调入未确认");

        DataStatus(String code, String value){
            this.code = code;
            this.value = value;
        }

        private String code;

        private String value;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


    /**
     * 审核状态
     */
    public enum AuditStatus {
        AUDIT_A("01","未处理"),
        AUDIT_B("02","待审核"),
        AUDIT_C("03","审核通过"),
        AUDIT_D("04","已调出"),
        AUDIT_E("05","未通过"),
        AUDIT_F("06","退回"),
        AUDIT_G("07","调出退回");

        AuditStatus(String code, String value){
            this.code = code;
            this.value = value;
        }

        private String code;

        private String value;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }


    }
}
