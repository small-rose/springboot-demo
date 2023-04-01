package com.small.o2o.comp.module.constants;

/**
 * @author zhangxiaocai
 */
public class OBConstants {

    public enum SheetNameEnum{
        OBJECT_INFO(0, "OBJECT","元数据信息汇总"),
        TABLE_INFO(1, "TABLE","表信息"),
        TableColumnVO(2, "TABLE_COLUMN","表对应的列"),
        TABLE_VIEW(3, "VIEW","表视图"),
        TABLE_INDEX(4, "INDEX","表索引"),


        SEQUENCES(5, "SEQUENCES","序列"),
        TYPE(6, "TYPE","集合"),
        FUNCTION(7, "FUNCTION","函數"),
        PROCEDEURE(8, "PROCEDURE","存储过程"),
        PACKAGE(9, "PACKAGE","存过包"),
        TABLE_CHA(10, "TABLE_CHA","查表"),
        TABLE_COLUMN_CHA(11, "TABLE_COLUMN_CHA","查列"),
        TABLE_PRIMARYKEY(12, "PRIMARYKEY","表主键"),
        PACKAGE_NAME(13, "PACKAGE","包数量");


        private int index ;
        private String code ;
        private String desc ;

        SheetNameEnum(int index, String code, String desc) {
            this.index = index;
            this.code = code;
            this.desc = desc;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public static SheetNameEnum getSheetNameEnum(int index) {
            for(SheetNameEnum sheetNameEnum : SheetNameEnum.values()){
                if (index==sheetNameEnum.getIndex()){
                    return sheetNameEnum ;
                }
            }
            return null;
        }
    }
}
