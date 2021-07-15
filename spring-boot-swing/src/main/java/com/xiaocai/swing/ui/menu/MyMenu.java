package com.xiaocai.swing.ui.menu;

import javax.swing.*;

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
        setBorder(BorderFactory.createEmptyBorder());

    }
}
