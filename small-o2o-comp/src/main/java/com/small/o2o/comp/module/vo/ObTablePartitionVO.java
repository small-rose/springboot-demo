package com.small.o2o.comp.module.vo;

import com.small.o2o.comp.module.excel.SheetDataVO;
import lombok.Data;

@Data
public class ObTablePartitionVO extends SheetDataVO {

    private String tableName ;
    private Long count ;


}
