package com.xiaocai.demo.mybatis.generator.example.entity;

/**
 *  
 * @Table : mm_queryfile_td
 * @author : zzy
 * @date : 2022-03-11 15:37:37
 * @modify : 
 */
public class MmQueryfileTd {
    /**
     * 申请号
     */
    private Long applyno;

    /**
     * 文件存储路径
     */
    private String path;

    /**
    * 获取-申请号
    * @return applyno
     */
    public Long getApplyno() {
        return applyno;
    }

    /**
    * 设置-申请号
    * @paramType java.lang.Long
    * @param applyno - 申请号
     */
    public void setApplyno(Long applyno) {
        this.applyno = applyno;
    }

    /**
    * 获取-文件存储路径
    * @return path
     */
    public String getPath() {
        return path;
    }

    /**
    * 设置-文件存储路径
    * @paramType java.lang.String
    * @param path - 文件存储路径
     */
    public void setPath(String path) {
        this.path = path;
    }
}