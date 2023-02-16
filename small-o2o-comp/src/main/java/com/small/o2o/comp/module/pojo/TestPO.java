package com.small.o2o.comp.module.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@TableName("TEST")
public class TestPO implements Serializable {

    @TableId(value = "NAME")
    private Long id  ;

    @TableField(value = "NAME")
    private String name ;


    @TableField(value = "AGE")
    private int age ;


    @TableField(value = "ADDR")
    private String addr ;

}
