package com.xiaocai.demo.mybatisplus.web.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatisplus.web.entity.LogInfo;
import com.xiaocai.demo.mybatisplus.web.mapper.LogInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LogInfoService  {

    @Autowired
    private LogInfoMapper logInfoMapper ;


    Page<LogInfo> selectLogs(int current, int pageSize,  LogInfo log) {
        Page page = new Page(current,pageSize);
        page = logInfoMapper.selectLogs(page, log);
        return page ;
    }

    List<LogInfo> selectLogs(LogInfo log) {
        return logInfoMapper.selectLogs(log);
    }
}