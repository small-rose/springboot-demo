package com.xiaocai.demo.excel.dropdown.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaocai.demo.excel.dropdown.entity.TSysOrg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 机构信息表（T_SYS_ORG） Mapper 接口
 * </p>
 *
 * @author xuguoping
 * @since 2021-10-08
 */
@Repository
@Mapper
public interface TSysOrgMapper extends BaseMapper<TSysOrg> {
    
    List<TSysOrg> selectOrgListByUserId(@Param("userId") String userId);

    TSysOrg findOrgByChildOrgCode(String orgCode);

    String selectOrgCodeByUnionOrgCode(@Param("orgCode") String orgCode);

    String selectOrgNameByOrgCode(@Param("orgCode") String orgCode);

    List<TSysOrg> findOrgListByEqualsLevel(@Param("orgLevel") Integer orgLevel);

    List<TSysOrg> findOrgListByParentUnionOrgCode(@Param("orgCode")String orgCode);


    String getNameByCode(@Param("codes") String[] codes);


    List<TSysOrg> findOrgTree();


    TSysOrg queryOrgCodeByUnionOrgCode(@Param("unionOrgCode") String unionOrgCode);

    List<String> getSubCode();

    List<String> getUnionOrgCodeByOrgCode(@Param("orgCode") String orgCode);

}
