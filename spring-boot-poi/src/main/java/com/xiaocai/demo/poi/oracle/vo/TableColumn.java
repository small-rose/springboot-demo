package com.xiaocai.demo.poi.oracle.vo;

import lombok.Data;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/14 22:11
 * @version: v1.0
 */
@Data

public class TableColumn {

    private String columnName ;

    private String columnType;

    private String comments;

    private String nullable;

}
