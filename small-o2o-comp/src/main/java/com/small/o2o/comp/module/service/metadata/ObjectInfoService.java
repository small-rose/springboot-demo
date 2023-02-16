package com.small.o2o.comp.module.service.metadata;


import com.small.o2o.comp.module.facade.FilePickService;
import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.vo.ObObjectInfoVO;
import com.small.o2o.comp.module.vo.OracleObjectInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiaocai
 */
@Slf4j
@Service
public class ObjectInfoService {


    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;
    @Autowired
    private FilePickService filePickService;



    public List<OracleObjectInfoVO> getObjectInfo() {
        List<String> obNames = new ArrayList<>();
        List<String> oraNames = new ArrayList<>();

        List<ObObjectInfoVO> typesVOList = obMetaDataService.queryObjectInfo();
        List<ObObjectInfoVO> typesVOList2 = oracleMetaDataService.queryObjectInfo();

        typesVOList.stream().forEach(p -> obNames.add(p.getObjectType()));
        typesVOList2.stream().forEach(p -> oraNames.add(p.getObjectType()));

        List<String> allNames = new ArrayList<>();
        //获取一个包含了oldIds和newIds的总结合,但是没有去重
        allNames.addAll(obNames);
        allNames.addAll(oraNames);
        //去重，获取并集 对象 新集合
        List<String> joinNames = allNames.stream().distinct().collect(Collectors.toList());

        List<OracleObjectInfoVO> resultList = new ArrayList<>();
        OracleObjectInfoVO object = null;
        int indexNo = 1;
        log.info("getProcedureList 取并集大小为：" + joinNames.size());

        for (String n : joinNames) {
            object = new OracleObjectInfoVO();
            object.setNo(String.valueOf(indexNo));
            object.setNo2(String.valueOf(indexNo));

            List<ObObjectInfoVO> obList = typesVOList.stream().parallel().filter(p -> p.getObjectType().equals(n)).collect(Collectors.toList());

            List<ObObjectInfoVO> oraList = typesVOList2.stream().parallel().filter(p -> p.getObjectType().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObObjectInfoVO ob = obList.get(0);
                object.setObjectType(ob.getObjectType());
                object.setCount(ob.getCount());
            }
            if (oraList.size() > 0) {
                ObObjectInfoVO oracle = oraList.get(0);
                object.setObjectType2(oracle.getObjectType());
                object.setCount2(oracle.getCount());
            }
            resultList.add(object);
            indexNo++;
        }
        ;
        return resultList;
    }

}
