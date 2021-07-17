package com.xiaocai.swing.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.swing.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/16 20:37
 * @version: v1.0
 */
@Data
@AllArgsConstructor
public class MenuVo {

    private int id ;
    private String menuName ;
    private ImageIcon imageIcon;
    private String menuCommand;


}
