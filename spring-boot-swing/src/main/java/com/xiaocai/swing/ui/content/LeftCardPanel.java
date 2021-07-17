package com.xiaocai.swing.ui.content;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/15 23:17
 * @version: v1.0
 */
public class LeftCardPanel extends JPanel {

    @Setter
    private int leftPanel_width ;
    @Setter
    private int leftPanel_height;

    private int cardNum ;
    private JPanel[] leftPanel ;

    // 创建左侧的卡片式布局
    public LeftCardPanel(int cardNum){
        setLayout(new CardLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.cardNum = cardNum;
    }


    /**
     * 初始化左侧的卡片面板
     */
    public void init(){

        leftPanel = new JPanel[cardNum];
        int n = 0 ;
        while (n < cardNum){
            leftPanel[n] = new JPanel();
            leftPanel[n].setBorder(BorderFactory.createLineBorder(Color.RED));
            leftPanel[n].setLayout(new BoxLayout(leftPanel[n], BoxLayout.Y_AXIS));
            leftPanel[n].setMaximumSize(new Dimension(leftPanel_width, leftPanel_height));
            //leftPanel[n].setMinimumSize(new Dimension(leftPanel_width, mainHeight-toolBar_height));

            leftPanel[n].setPreferredSize(new Dimension(leftPanel_width/2,  leftPanel_height));

            add(leftPanel[n], "L"+n);
            n++;
        }
    }

    /**
     * 向卡片面板中添加内容
     * @param n
     * @param component
     */
    public void addContent(int n, JComponent component){
        ((JPanel)getComponents()[n]).add(component);
    }


}
