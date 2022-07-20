package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_useporperty_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmUseporpertyTd {
    /**
     * 车辆使用性质代码
     */
    private Long useporperty;

    /**
     * 映射财务代码
     */
    private Long erpuseporperty;

    /**
     * 车辆使用性质名称
     */
    private String useporpertyname;

    /**
     * 财务车辆使用性质名称
     */
    private String erpuseporpertyname;

    /**
    * 获取-车辆使用性质代码
    * @return useporperty
     */
    public Long getUseporperty() {
        return useporperty;
    }

    /**
    * 设置-车辆使用性质代码
    * @paramType java.lang.Long
    * @param useporperty - 车辆使用性质代码
     */
    public void setUseporperty(Long useporperty) {
        this.useporperty = useporperty;
    }

    /**
    * 获取-映射财务代码
    * @return erpuseporperty
     */
    public Long getErpuseporperty() {
        return erpuseporperty;
    }

    /**
    * 设置-映射财务代码
    * @paramType java.lang.Long
    * @param erpuseporperty - 映射财务代码
     */
    public void setErpuseporperty(Long erpuseporperty) {
        this.erpuseporperty = erpuseporperty;
    }

    /**
    * 获取-车辆使用性质名称
    * @return useporpertyname
     */
    public String getUseporpertyname() {
        return useporpertyname;
    }

    /**
    * 设置-车辆使用性质名称
    * @paramType java.lang.String
    * @param useporpertyname - 车辆使用性质名称
     */
    public void setUseporpertyname(String useporpertyname) {
        this.useporpertyname = useporpertyname;
    }

    /**
    * 获取-财务车辆使用性质名称
    * @return erpuseporpertyname
     */
    public String getErpuseporpertyname() {
        return erpuseporpertyname;
    }

    /**
    * 设置-财务车辆使用性质名称
    * @paramType java.lang.String
    * @param erpuseporpertyname - 财务车辆使用性质名称
     */
    public void setErpuseporpertyname(String erpuseporpertyname) {
        this.erpuseporpertyname = erpuseporpertyname;
    }
}