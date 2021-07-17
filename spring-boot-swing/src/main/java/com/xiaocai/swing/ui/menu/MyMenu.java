package com.xiaocai.swing.ui.menu;

import javax.swing.*;
import java.awt.*;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 10:54
 **/
public class MyMenu extends JMenu {

    private MyMenu(){

    }

    public MyMenu(String text){
        setText(text);
        //setBorder(BorderFactory.createEmptyBorder());
        initialize();
    }

    /**
     * 初始化，设置按钮属性：无边，无焦点渲染，无内容区，各边距0
     */
    private void initialize() {
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setFocusable(true);
        this.setMargin(new Insets(0, 0, 0, 0));
    }
}
