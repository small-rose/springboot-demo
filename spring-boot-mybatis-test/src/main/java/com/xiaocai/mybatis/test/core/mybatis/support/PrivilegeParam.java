package com.xiaocai.mybatis.test.core.mybatis.support;

import com.xiaocai.mybatis.test.core.exception.BusinessException;
import lombok.Getter;
import lombok.Setter;

@Getter
public class PrivilegeParam {
    /**
     * 数据权限模式:
     *      一种是在正常的SQL外包包裹一层查询，并带上相关数据权限查询条件，称之为嵌套模式 NESTED_CASE（默认使用的模式）
     *      另一种是在正常的SQL后面追加 and 相关的数据权限查询条件，称之为追加模式 APPEND_CASE
     *      请谨慎使用
     * @return
     */
    @Setter
    private PrivilegeMode mode = PrivilegeMode.NESTED_CASE ;

    /**
     * 默认使用的opcode
     */
    private final static String DEFAULT_OPCODE = "999";


    private  String opCode;

    /**
     *  本工程使用的 powerMark 传值保留原有符号
     *  查询 ='5'
     *  操作 >='4'
     *  无权限   ='0'
     */
    private  String powerMark;

    private  String subcompany;

    private  String departmentcode;

    @Setter
    private String tableAlis ;  //该参数目前发现在追加模式下会使用

    public PrivilegeParam( String powerMark) {
        this.opCode = DEFAULT_OPCODE;
        if (!powerMark.contains("'")){
            powerMark = checkPowerMark(powerMark);
        }
        this.powerMark = powerMark;
    }

    public PrivilegeParam(String opCode, String powerMark) {
        this.opCode = opCode;
        if (!powerMark.contains("'")){
            powerMark = checkPowerMark(powerMark);
        }
        this.powerMark = powerMark;
    }


    public PrivilegeParam(String opCode, String powerMark, String subcompany) {
        this.opCode = opCode;
        if (!powerMark.contains("'")){
            powerMark = checkPowerMark(powerMark);
        }
        this.powerMark = powerMark;
        this.subcompany = subcompany;
    }

    public PrivilegeParam(String opCode, String powerMark, String subcompany, String departmentcode) {
        this.opCode = opCode;

        if (!powerMark.contains("'")){
            powerMark = checkPowerMark(powerMark);
        }
        this.powerMark = powerMark;
        this.subcompany = subcompany;
        this.departmentcode = departmentcode;
    }

    /**
     *  方便前端动态传 powerMark 使使用
     * @param powerMark
     */
    protected String checkPowerMark(String powerMark) {
        if ("=5".equals(powerMark)) {
            powerMark = "='5'";
        } else if (">=4".equals(powerMark)) {
            powerMark = ">='4'";
        } else {
            throw new BusinessException("传入的权限错误！");
        }
        return powerMark;
    }

    public  static  class PowerMark{
        public final static String POWER_OPTION = "='5'";
        public final static String POWER_SELECT = ">='4'";
        public final static String POWER_NOTHING = "='0'";
    }


    public static void main(String[] args) {
        System.out.println("='5'".contains("'"));
        System.out.println("='5'".length());
    }
}
