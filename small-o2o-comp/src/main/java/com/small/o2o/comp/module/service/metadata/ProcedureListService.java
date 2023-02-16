package com.small.o2o.comp.module.service.metadata;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author xiaocai
 */
@Slf4j
@Service
public class ProcedureListService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;
    @Autowired
    private FilePickService filePickService ;

    public List<OracleProcedureVO> getProcedureList(String type) {

        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObProcedureVO> procedureVOS = obMetaDataService.queryProcedureVO(type);
        List<ObProcedureVO> procedureVOS2 = oracleMetaDataService.queryProcedureVO(type);


        procedureVOS.stream().forEach(p -> obNames.add(p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName())));
        procedureVOS2.stream().forEach(p -> oraNames.add(p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName())));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleProcedureVO> resultList = new ArrayList<>();
        OracleProcedureVO procedure = null;
        int indexNo = 1;
        log.info("getProcedureList 取并集大小为：" + joinNames.size());

        for (String n : joinNames) {
            procedure = new OracleProcedureVO();
            procedure.setNo(String.valueOf(indexNo));
            procedure.setNo2(String.valueOf(indexNo));
            if (indexNo == 1) {
                procedure.setCount1(String.valueOf(procedureVOS.size()));
                procedure.setCount2(String.valueOf(procedureVOS2.size()));
            }
            List<ObProcedureVO> obList = procedureVOS.stream().parallel().filter(p -> (p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName()).equals(n))).collect(Collectors.toList());

            List<ObProcedureVO> oraList = procedureVOS2.stream().parallel().filter(p -> (p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName()).equals(n))).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObProcedureVO ob = obList.get(0);
                procedure.setObjectType(ob.getObjectType());
                procedure.setObjectName(ob.getObjectName());
                procedure.setProcedureName(ob.getProcedureName());
            }
            if (oraList.size() > 0) {
                ObProcedureVO oracle = oraList.get(0);
                procedure.setObjectType2(oracle.getObjectType());
                procedure.setObjectName2(oracle.getObjectName());
                procedure.setProcedureName2(oracle.getProcedureName());
            }
            resultList.add(procedure);
            indexNo++;
        }

        return resultList;
    }


    public List<OracleProcedureVO> getProcedurePkgList(String type) {
        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObProcedureVO> procedureVOS = obMetaDataService.queryNameListProcedureVO(type);
        List<ObProcedureVO> procedureVOS2 = oracleMetaDataService.queryNameListProcedureVO(type);

        procedureVOS.stream().forEach(p -> obNames.add(p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName())));
        procedureVOS2.stream().forEach(p -> oraNames.add(p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName())));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleProcedureVO> resultList = new ArrayList<>();
        OracleProcedureVO procedure = null;
        int indexNo = 1;
        log.info("getProcedureNameList 取并集大小为：" + joinNames.size());

        List<String> plsqlUnitListTable = filePickService.getOBPlsqlUnitListTable();
        Map<String, String> obPlsqlMap = plsqlUnitListTable.stream().collect(
                Collectors.toMap(o -> o, Function.identity()));
        List<String> plsqlUnitListTable2 = filePickService.getORAPlsqlUnitListTable();
        Map<String, String> oraPlsqlMap = plsqlUnitListTable2.stream().collect(
                Collectors.toMap(o -> o, Function.identity()));

        for (String n : joinNames) {
            procedure = new OracleProcedureVO();
            procedure.setNo(String.valueOf(indexNo));
            procedure.setNo2(String.valueOf(indexNo));
            if (indexNo == 1) {
                procedure.setCount1(String.valueOf(procedureVOS.size()));
                procedure.setCount2(String.valueOf(procedureVOS2.size()));
            }
            List<ObProcedureVO> obList = procedureVOS.stream().parallel().filter(p -> (p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName()).equals(n))).collect(Collectors.toList());

            List<ObProcedureVO> oraList = procedureVOS2.stream().parallel().filter(p -> (p.getObjectName().concat(p.getProcedureName() == null ? "" : p.getProcedureName()).equals(n))).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObProcedureVO ob = obList.get(0);
                procedure.setObjectType(ob.getObjectType());
                procedure.setObjectName(ob.getObjectName());
                procedure.setProcedureName(obPlsqlMap.get(ob.getObjectName()));
            }
            if (oraList.size() > 0) {
                ObProcedureVO oracle = oraList.get(0);
                procedure.setObjectType2(oracle.getObjectType());
                procedure.setObjectName2(oracle.getObjectName());
                procedure.setProcedureName2(oraPlsqlMap.get(oracle.getObjectName()));
            }
            resultList.add(procedure);
            indexNo++;
        }

        return resultList;
    }
}
