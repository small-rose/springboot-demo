package com.small.o2o.comp.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TableListener extends AnalysisEventListener<DropTableVo> {

    private String targetPath ;

    private String sql_format = "DROP TABLE  %s ;" ;

    private List<String> sqlList = new ArrayList<String>();

    @Override
    public void invoke(DropTableVo dropTableVo, AnalysisContext analysisContext) {
        //System.out.println(dropTableVo);

        if (!"保留表".equalsIgnoreCase(dropTableVo.getKeep())){
            String SQL = String.format(sql_format, dropTableVo.getTableName());
            sqlList.add(SQL);
        }else{
            //String SQL = "-- " +String.format(sql_format, dropTableVo.getTableName());
            //sqlList.add(SQL);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("====================DROP TABLE ==================" + sqlList.size());
        sqlList.forEach(System.out::println);
        log.info("====================DROP TABLE ==================");
    }
}
