package com.small.o2o.comp.module.mapper.oracle;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.small.o2o.comp.module.pojo.TestPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author c_zhangzongyuan
 */
@Repository
public interface OracleTestPoMapper extends BaseMapper<TestPO> {

    /**
     * 选择写入
     */
    public void insertSelective(TestPO testPO);

    public void insertBatch(@Param("dataList") List<TestPO> dataList);
    /**
     * 全部删除
     */
    public void deleteAll();

}
