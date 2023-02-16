package com.small.o2o.comp.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
public class TableColumnListener extends AnalysisEventListener<DropColumnVo> {

    private String targetPath ;

    private String sql_format  = "ALTER TABLE %s DROP COLUMN %s ;" ;
    private String yasuo_format  = "ALTER TABLE %s set unused COLUMN %s ;" ;
    private String DROP_format  = "ALTER TABLE %s DROP unused COLUMNS ;" ;

    private List<String> sqlList = new ArrayList<String>();

    private final Map<String,String> tableMap ;

    private String lastTableName = "";

    public TableColumnListener(Map<String, String> tableMap) {
        this.tableMap = tableMap;
    }

    @Override
    public void invoke(DropColumnVo dropColumnVo, AnalysisContext analysisContext) {
        //System.out.println(dropColumnVo)

        if (dropColumnVo.getObTableName()==null && dropColumnVo.getObColumnName()==null){

            if (StringUtils.hasText(lastTableName) && !lastTableName.equalsIgnoreCase(dropColumnVo.getTableName())
            && "ENABLED".equalsIgnoreCase(tableMap.get(lastTableName))){
                String SQL = String.format(DROP_format, lastTableName);
                sqlList.add(SQL);
            }
            // 压缩表
            if ("ENABLED".equalsIgnoreCase(tableMap.get(dropColumnVo.getTableName()))){
                String SQL = String.format(yasuo_format, dropColumnVo.getTableName(), dropColumnVo.getColumnName());
                sqlList.add(SQL);
                lastTableName = dropColumnVo.getTableName();
            }else{
                String SQL = String.format(sql_format, dropColumnVo.getTableName(), dropColumnVo.getColumnName());
                sqlList.add(SQL);
                lastTableName = dropColumnVo.getTableName();
            }



        }

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("====================DROP TABLE COLUMN==================" + sqlList.size());
        sqlList.forEach(System.out::println);
        log.info("====================DROP TABLE COLUMN==================");
    }
}
