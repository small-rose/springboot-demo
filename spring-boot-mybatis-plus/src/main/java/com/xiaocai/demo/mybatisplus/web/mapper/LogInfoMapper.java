package com.xiaocai.demo.mybatisplus.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.demo.mybatisplus.web.entity.Account;
import com.xiaocai.demo.mybatisplus.web.entity.LogInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogInfoMapper extends BaseMapper<Account> {


    Page<LogInfo> selectLogs(Page page, LogInfo log);

    List<LogInfo> selectLogs(LogInfo log);
}