package com.xiaocai.demo.excel.easydrop.service;

import java.util.List;
import java.util.Map;

public interface TsOrgService {

    /**
     * 取1级 分公司
     * @return
     */
    Map<String, List<String>> getSubcompany();

    /**
     * 取2级 中支公司
     * @return
     */
    Map<String, List<String>> getMidBranch();


    /**
     * 取3级 支公司
     * @return
     */
    Map<String, List<String>> getSubBranch();


}
