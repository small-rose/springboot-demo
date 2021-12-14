package com.xiaocai.demo.excel.oracle.controller;

import com.xiaocai.demo.excel.oracle.service.OracleSelectService;
import com.xiaocai.demo.excel.oracle.vo.TableColumn;
import com.xiaocai.demo.excel.oracle.vo.TableInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/14 20:58
 * @version: v1.0
 */
@RestController
public class SelectController {

    @Autowired
    private OracleSelectService oracleSelectService;
    @GetMapping("/init")
    public Map go(){
        Map result = new HashMap(1);

        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @GetMapping("/tableinfos")
    public Map tableinfos(String schema){
        if (StringUtils.hasLength(schema)){
            schema = "PAYMT";
        }
        List<TableInfo> allTables = oracleSelectService.getAllTables(schema);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("data", allTables);
        return map ;
    }


    @GetMapping("/tablePk")
    public Map tablePk(String schema){
        if (StringUtils.hasLength(schema)){
            schema = "PAYMT";
        }
        Map<String, String> tablePrimaryKey = oracleSelectService.getTablePrimaryKey(schema);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("data", tablePrimaryKey);
        return map ;
    }

    @GetMapping("/columninfos")
    public Map columninfos(String schema, String tableName){
        if (StringUtils.hasLength(schema)){
            schema = "PAYMT";
        }
        if (StringUtils.hasLength(tableName)){
            tableName = "T_APPLICATIONS";
        }
        List<TableColumn> columnInfos = oracleSelectService.getColumnInfo(schema, tableName);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("data", columnInfos);
        return map ;
    }
}
