package com.xiaocai.demo.excel.dropdown.constants;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ RenewalConstants ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/10/18 9:46
 * @Version ： 1.0
 **/
public class RenewalConstants {


    /**
     * 续保客户类型
     */
    public enum RenewalTypeEnum{
        /**
         * 当年新保
         */
        NEW("NP", "当年新保"),
        /**
         * 当年续保
         */
        RENEWAL("RP", "当年续保"),
        /**
         * 当年应续
         */
        CONTINUTE("CP", "当年应续"),
        /**
         * 当年脱保
         */
        EXPIRED("EP", "当年脱保"),
        /**
         * 脱保赢回
         */
        WINBACK("WB", "脱保赢回");

        RenewalTypeEnum(String code,String description){
            this.code = code;
            this.description = description;
        }
        private String code;
        private String description;

        public String getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }
    }

}
