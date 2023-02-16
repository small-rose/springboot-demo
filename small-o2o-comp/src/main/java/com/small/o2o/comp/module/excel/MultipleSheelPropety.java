package com.small.o2o.comp.module.excel;


import com.alibaba.excel.metadata.Sheet;
import lombok.Data;

import java.util.List;

@Data
public class MultipleSheelPropety {


    private List<? extends SheetDataVO> data;
    private List<? extends SheetDataVO> data2;

    private Sheet sheet;
}
