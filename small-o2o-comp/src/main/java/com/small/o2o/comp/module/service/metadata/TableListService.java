package com.small.o2o.comp.module.service.metadata;


import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.vo.ObTableInfoVO;
import com.small.o2o.comp.module.vo.ObTablePartitionVO;
import com.small.o2o.comp.module.vo.OracleTableInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author xiaocai
 */
@Slf4j
@Service
public class TableListService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;

    /**
     * 表-视图 对比
     *
     * @return
     */
    public List<OracleTableInfoVO> getTableInfo(String tableType) {

        //        List<String> obNames = new ArrayList<>();
        //        List<String> oraNames = new ArrayList<>();

        List<ObTableInfoVO> obObjList = obMetaDataService.queryTableInfo(tableType);
        List<ObTableInfoVO> oraObjList = oracleMetaDataService.queryTableInfo(tableType);

        Map<String, ObTableInfoVO> obObjMap = obObjList.stream().collect(
                Collectors.toMap(o -> o.getTableName(), (p) -> p));

        Map<String, ObTableInfoVO> oracleObjMap = oraObjList.stream().collect(
                Collectors.toMap(o -> o.getTableName(), Function.identity()));

        //OB 查分区数
        List<ObTablePartitionVO> obTablePartitionList = obMetaDataService.queryTablePartitionVO();
        Map<String, Long> obPartMap = obTablePartitionList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));
        //OB 查记录数
        List<ObTablePartitionVO> obRecordList = obMetaDataService.queryTableReCords();
        Map<String, Long> obRecordMap = obRecordList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));

        //ORACLE 查分区数
        List<ObTablePartitionVO> oraTablePartitionList = oracleMetaDataService.queryTablePartitionVO();
        Map<String, Long> oraPartMap = oraTablePartitionList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));
        //ORACLE 查记录数
        List<ObTablePartitionVO> oraRecordList = oracleMetaDataService.queryTableReCords();
        //Map<String, Long> oraRecordMap = oraRecordList.stream().collect(Collectors.toMap(ObTablePartitionVO::getTableName, ObTablePartitionVO::getCount));
        Map<String, Long> oraRecordMap = new HashMap<>();
        for (ObTablePartitionVO obTablePartitionVO : oraRecordList) {
            oraRecordMap.put(obTablePartitionVO.getTableName(), obTablePartitionVO.getCount());
        }

        List<String> allTables = new ArrayList<>();
        for (ObTableInfoVO obTableInfoVO : obObjList) {
            allTables.add(obTableInfoVO.getTableName());

        }
        for (ObTableInfoVO obTableInfoVO : oraObjList) {
            if (!allTables.contains(obTableInfoVO.getTableName())) {
                allTables.add(obTableInfoVO.getTableName());
            }
        }

        List<OracleTableInfoVO> resultList = new ArrayList<>();
        OracleTableInfoVO object = null;
        int indexNo = 1;
        log.info("getTableInfo 取并集大小为：" + allTables.size());
        for (String n : allTables) {
            object = new OracleTableInfoVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));
            ObTableInfoVO obTiv = obObjMap.get(n);
            ObTableInfoVO oracleTiv = oracleObjMap.get(n);

            if (obTiv != null) {
                ObTableInfoVO ob = obTiv;
                log.info(ob.toString());
                object.setTableName(ob.getTableName());
                object.setTableComment(ob.getTableComment());
                if (obPartMap.get(object.getTableName()) != null) {
                    object.setPartitions(obPartMap.get(object.getTableName()));
                }
                if (obRecordMap.get(object.getTableName()) != null) {
                    object.setCountRows(obRecordMap.get(object.getTableName()));
                }

            }
            if (oracleTiv != null ) {
                ObTableInfoVO oracle = oracleTiv;
                object.setTableName2(oracle.getTableName());
                object.setTableComment2(oracle.getTableComment());

                if (oraPartMap.get(object.getTableName2()) != null) {
                    object.setPartitions2(obPartMap.get(object.getTableName2()));
                }
                if (oraRecordMap.get(object.getTableName2()) != null) {
                    object.setCountRows2(obRecordMap.get(object.getTableName2()));
                }
            }
            resultList.add(object);
            indexNo++;
        }

        return resultList;
    }


}
