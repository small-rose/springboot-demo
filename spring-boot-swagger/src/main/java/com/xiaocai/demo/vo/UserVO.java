package com.xiaocai.demo.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/6/9 18:01
 * @version: v1.0
 */
@Data
public class UserVO {

    private String user ;
    private String pass ;
    private List<String> roles ;

}
