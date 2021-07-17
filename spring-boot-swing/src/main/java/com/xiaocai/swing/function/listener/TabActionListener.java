package com.xiaocai.swing.function.listener;

import com.xiaocai.swing.function.from.CommentForm;
import com.xiaocai.swing.ui.tool.MyButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 13:20
 **/
public class TabActionListener implements ActionListener {

    private final JTabbedPane rightPanel ;
    private MyButton myButton ;

    private static int INDEX = 0;

    private static Map<String, Integer> tabMap = new ConcurrentHashMap<>();

    public TabActionListener(JTabbedPane rightPanel, MyButton myButton ) {
        this.rightPanel = rightPanel;
        this.myButton = myButton;
    }
    public TabActionListener(JTabbedPane rightPanel, CommentForm form) {
        this.rightPanel = rightPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.paramString();
        System.out.println("s :"+s);
        String cmd = e.getActionCommand();
        System.out.println("cmd :"+cmd);

        if (tabMap.keySet().contains(e.getActionCommand())){
            rightPanel.setSelectedIndex(tabMap.get(e.getActionCommand()));
            System.out.println(" 选中已经打开的卡片 ： "+e.getActionCommand());
        }else{

            rightPanel.addTab(e.getActionCommand(), new JPanel());
            //rightPanel.setMnemonicAt(INDEX, KeyEvent.VK_1);
            rightPanel.setSelectedIndex(INDEX);
            tabMap.put(e.getActionCommand(), INDEX);

            INDEX ++ ;
        }
    }
}
