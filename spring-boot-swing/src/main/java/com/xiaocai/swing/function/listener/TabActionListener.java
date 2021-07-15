package com.xiaocai.swing.function.listener;

import com.xiaocai.swing.ui.tool.MyButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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

    private JTabbedPane rightPanel;
    private MyButton myButton ;

    private static int INDEX = 0;

    private static Map<String, Integer> tabMap = new ConcurrentHashMap<>();

    public TabActionListener(JTabbedPane rightPanel, MyButton myButton ) {
        this.rightPanel = rightPanel;
        this.myButton = myButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.paramString();
        System.out.println("s :"+s);
        String cmd = e.getActionCommand();
        System.out.println("cmd :"+cmd);

        if (tabMap.keySet().contains(e.getActionCommand())){
            rightPanel.setSelectedIndex(tabMap.get(myButton.getText()));
            System.out.println(" 选中已经打开的卡片 ： "+myButton.getText());
        }else{
            if (INDEX > 10){
                INDEX = INDEX -10 ;
                rightPanel.removeTabAt(INDEX -10);
            }
            rightPanel.addTab(myButton.getText(), new JPanel());
            //rightPanel.setMnemonicAt(INDEX, KeyEvent.VK_1);
            rightPanel.setSelectedIndex(INDEX);
            tabMap.put(e.getActionCommand(), INDEX);

            INDEX ++ ;
        }
    }
}
