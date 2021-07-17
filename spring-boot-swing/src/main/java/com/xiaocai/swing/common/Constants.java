package com.xiaocai.swing.common;

import org.springframework.core.io.ClassPathResource;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/15 22:08
 * @version: v1.0
 */
public class Constants {

    public static final String [] TOP_MENUS_ALL = {"工具","速记"};

    public static final String [] SECOND_MENUS_TOOL = {"IP查询","Json格式化"};

    public static final String [] SECOND_MENUS_NOTE = {"默认记事本"};

    public static final Color GREEN_COLOR = new Color(199,237,204);

    public static ImageIcon LOGO = null;

    static {
        try {
            LOGO = new ImageIcon(new ClassPathResource("/icon/logo-3.png").getURL());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
