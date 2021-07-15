package com.xiaocai.swing.ui.main;

import com.xiaocai.swing.common.SpringContextHolder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.io.IOException;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 09:35
 **/
@Component("MainFrameController")
public class MainFrameController {

    private MainFrame mainFrame;


    /**
     * 准备工作 和显示主界面
     */
    public void prepareAndOpenFrame()  {
        if(mainFrame==null){
            mainFrame = SpringContextHolder.getBean(MainFrame.class);
        }
        mainFrame.setVisible(true);
    }
}
