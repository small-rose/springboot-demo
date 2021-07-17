package com.xiaocai.swing.ui.tool;

import javax.swing.*;
import java.awt.*;

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
        initUi();
    }
    public MyButton(ImageIcon imageIcon){
        super(imageIcon);
        initUi();
    }

    public MyButton(String text, ImageIcon imageIcon){
        super(text, imageIcon);
        initUi();
    }

    private void initUi(){
        setMargin(new Insets(3,3,3,3));
    }
}
