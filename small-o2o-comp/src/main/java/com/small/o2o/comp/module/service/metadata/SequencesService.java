package com.small.o2o.comp.module.service.metadata;


import com.small.o2o.comp.module.service.ob.ObMetaDataService;
import com.small.o2o.comp.module.service.oracle.OracleMetaDataService;
import com.small.o2o.comp.module.vo.ObSequencesVO;
import com.small.o2o.comp.module.vo.OracleSequencesVO;
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
public class SequencesService {

    @Autowired
    private ObMetaDataService obMetaDataService;
    @Autowired
    private OracleMetaDataService oracleMetaDataService;




    public List<OracleSequencesVO> getSequences() {

        List<String> allNames = new ArrayList<>();

        List<ObSequencesVO> obObjList = obMetaDataService.querySequencesVO();
        List<ObSequencesVO> oraObjList = oracleMetaDataService.querySequencesVO();

        obObjList.forEach(p -> allNames.add(p.getSequenceName()));
        oraObjList.forEach(p -> {
            if (allNames.contains(p.getSequenceName())) {
                allNames.add(p.getSequenceName());

            }
        });

        List<OracleSequencesVO> resultList = new ArrayList<>();
        OracleSequencesVO sequences = null;
        int indexNo = 1;
        log.info("getSequences 取并集大小为：" + allNames.size());

        for (String n : allNames) {
            sequences = new OracleSequencesVO();
            sequences.setNo(String.valueOf(indexNo));
            sequences.setNo2(String.valueOf(indexNo));

            if (indexNo == 1) {
                sequences.setCount1(String.valueOf(obObjList.size()));
                sequences.setCount2(String.valueOf(oraObjList.size()));
            }

            List<ObSequencesVO> obList = obObjList.stream().parallel().filter(p -> p.getSequenceName().equals(n)).collect(Collectors.toList());

            List<ObSequencesVO> oraList = oraObjList.stream().parallel().filter(p -> p.getSequenceName().equals(n)).collect(Collectors.toList());
            if (obList.size() > 0) {
                ObSequencesVO ob = obList.get(0);
                sequences.setSequenceName(ob.getSequenceName());
                sequences.setLastNumber(ob.getLastNumber());
            }
            if (oraList.size() > 0) {
                ObSequencesVO oracle = oraList.get(0);
                sequences.setSequenceName2(oracle.getSequenceName());
                sequences.setLastNumber2(oracle.getLastNumber());
            }
            resultList.add(sequences);
            indexNo++;
        }
        ;
        return resultList;
    }

}
