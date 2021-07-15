package com.xiaocai.swing.ui.tool;

import javax.swing.*;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 11:12
 **/
public class MyButton extends JButton {


    public MyButton(String text){
        super(text);
    }
    public MyButton(ImageIcon imageIcon){
        super(imageIcon);
    }

    public MyButton(String text, ImageIcon imageIcon){
        super(text, imageIcon);
    }
}
