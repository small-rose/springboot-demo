package com.xiaocai.demo.poi.oracle.controller;


import com.xiaocai.demo.poi.oracle.facade.ExcelFacadeService;
import com.xiaocai.demo.poi.oracle.service.OracleSelectService;
import com.xiaocai.demo.poi.oracle.vo.TableColumn;
import com.xiaocai.demo.poi.oracle.vo.TableInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Slf4j
@RestController
@RequestMapping(value = "/select")
@Api(value = "查询测试", description="查询测试", tags="查询测试")
public class SelectController {

    @Autowired
    private ExcelFacadeService excelFacadeService;
    @Autowired
    private OracleSelectService oracleSelectService;

    private static Map fileNmame = new HashMap();

    @ApiOperation(value = "执行入口-生成EXCEL",response = Map.class)
    @GetMapping("/initExcel")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "schema", value = "db schema", required = true, dataType="string",
                    defaultValue = "PAYMT", example = "PAYMT"),
    })
    public Map toExcel(String schema){
        if (StringUtils.isEmpty(schema)){
            schema = "PAYMT";
        }
        String result = excelFacadeService.generatedExcel(schema);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }


    @ApiOperation(value = "执行入口-解析Excel",response = Map.class)
    @GetMapping("/initSQL")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "excelFile", value = "EXCEL路径", required = true, dataType="string",
                    defaultValue = "D:\\onlyTest\\paymt_db.xlsx", example = "D:\\onlyTest\\paymt_db.xlsx"),
            @ApiImplicitParam(name = "sqlFile", value = "SQL文件路径", required = true, dataType="string",
                    defaultValue = "D:\\onlyTest\\paymt_db_sql.sql", example = "D:\\onlyTest\\paymt_db_sql.sql")
    })
    public Map toSQL(String excelFile, String sqlFile){

        Map map = new HashMap(2);

        if (StringUtils.isEmpty(excelFile) || StringUtils.isEmpty(sqlFile)){
            map.put("code", "100");
            map.put("result", "参数不允许为空");
        }
//        String excelFile = "";
//        String sqlFile = "";
        String result = excelFacadeService.analysisExcel(excelFile, sqlFile);
        map.put("code", "200");
        map.put("result", result);
        return map ;
    }

    @ApiOperation(value = "查表和表注释",response = Map.class)
    @GetMapping("/tableinfos")
    public Map tableinfos(String schema){
        if (StringUtils.isEmpty(schema)){
            schema = "PAYMT";
        }
        List<TableInfo> allTables = oracleSelectService.getAllTables(schema);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("data", allTables);
        return map ;
    }


    @ApiOperation(value = "查表和表主键",response = Map.class)
    @GetMapping("/tablePk")
    public Map tablePk(String schema){
        if (StringUtils.isEmpty(schema)){
            schema = "PAYMT";
        }
        Map<String, String> tablePrimaryKey = oracleSelectService.getTablePrimaryKey(schema);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("data", tablePrimaryKey);
        return map ;
    }

    @ApiOperation(value = "查表的列、类型、列注释",response = Map.class)
    @GetMapping("/columninfos")
    public Map columninfos(String schema, String tableName){
        if (StringUtils.isEmpty(schema)){
            schema = "PAYMT";
        }
        if (StringUtils.isEmpty(tableName)){
            tableName = "T_APPLICATIONS";
        }
        List<TableColumn> columnInfos = oracleSelectService.getColumnInfo(schema, tableName);
        Map map = new HashMap(2);
        map.put("code", "200");
        map.put("data", columnInfos);
        return map ;
    }
}
