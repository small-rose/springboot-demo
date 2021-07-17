package com.xiaocai.swing.ui.content;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 13:53
 * @version: v1.0
 */
public class RightCardPanel  extends JPanel {

    @Setter
    private int rightPanel_width ;
    @Setter
    private int rightPanel_height;

    private int cardNum ;

    private JTabbedPane[] rightTabPanel ;

    private JPanel rightPanel ;

    // 创建 右 侧的卡片式布局
    public RightCardPanel(int cardNum){
        final CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);
        setBorder(BorderFactory.createLineBorder(Color.RED));
        this.cardNum = cardNum;
    }

    /**
     * 初始化 右 侧的卡片面板
     */
    public void init(){

        rightTabPanel = new JTabbedPane[cardNum];
        int n = 0 ;
        while (n < cardNum){
            rightTabPanel[n] = new JTabbedPane();
            rightTabPanel[n].setBorder(BorderFactory.createLineBorder(Color.RED));
            rightTabPanel[n].setMaximumSize(new Dimension(rightPanel_width, rightPanel_height));
            //leftPanel[n].setMinimumSize(new Dimension(leftPanel_width, mainHeight-toolBar_height));

            rightTabPanel[n].setPreferredSize(new Dimension(rightPanel_width -10,  rightPanel_height));

            add(rightTabPanel[n], "R"+n);
            n++;
        }
    }

    /**
     * 向卡片面板中添加内容
     * @param n
     * @param component
     */
    public void addTabContent(int n,  JComponent component){
        ((JTabbedPane)getComponents()[n]).addTab(component.getName(),component);
    }
}
