package com.xiaocai.swing.ui.main;

import com.xiaocai.swing.common.SpringContextHolder;
import org.springframework.stereotype.Component;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 09:35
 **/
@Component("MainFrameController")
public class MainFrameController {

    private MyFrame myFrame;


    /**
     * 准备工作 和显示主界面
     */
    public void prepareAndOpenFrame()  {
        if(myFrame==null){
            myFrame =  SpringContextHolder.getBean(MyFrame.class);
        }
        MainListener listener = new MainListener(myFrame);
        listener.addListeners();
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
