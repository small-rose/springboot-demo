package com.xiaocai.druid.dynamic.web.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.druid.dynamic.web.entity.LogInfo;
import com.xiaocai.druid.dynamic.web.mapper.LogInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LogInfoService  {

    @Autowired
    private LogInfoMapper logInfoMapper ;


    Page<LogInfo> selectLogs(int current, int pageSize, LogInfo log) {
        Page page = new Page(current,pageSize);
        page = logInfoMapper.selectLogs(page, log);
        return page ;
    }

    @DS("slave")
    List<LogInfo> selectLogs(LogInfo log) {
        return logInfoMapper.selectLogs(log);
    }
}