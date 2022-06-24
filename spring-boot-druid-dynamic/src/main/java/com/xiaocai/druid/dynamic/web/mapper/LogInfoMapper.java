package com.xiaocai.druid.dynamic.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaocai.druid.dynamic.web.entity.Account;
import com.xiaocai.druid.dynamic.web.entity.LogInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogInfoMapper extends BaseMapper<Account> {


    Page<LogInfo> selectLogs(Page page, LogInfo log);

    List<LogInfo> selectLogs(LogInfo log);
}