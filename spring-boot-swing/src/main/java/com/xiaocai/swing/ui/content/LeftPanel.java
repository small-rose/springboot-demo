package com.xiaocai.swing.ui.content;


import com.sun.istack.internal.NotNull;
import com.xiaocai.swing.common.vo.MenuVo;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 14:11
 * @version: v1.0
 */
public class LeftPanel extends JPanel{

    @Setter
    @NotNull
    private int width;
    @Setter
    @NotNull
    private int height;

    public LeftPanel(MenuVo[] menuVos){

        this.menuVos = menuVos;
    }

    @Getter
    private Box vBox = Box.createVerticalBox() ;
    // 二级菜单按钮
    private MenuVo[] menuVos ;


    public void init(int cardIndex, LeftCardPanel leftCards,RightCardPanel rightCards){

        int x = 0 ;
        MenuVo menuVo = null;
        while (x< menuVos.length) {

            menuVo = menuVos[x];;
            JButton button = new JButton();
            button.setFont(new Font("微软雅黑", Font.PLAIN, 32));
            button.setText(menuVo.getMenuName());
            button.setToolTipText("左按钮-"+ cardIndex+ "-" + x);
            button.setMargin(new Insets(5,3,5,3));
            button.setActionCommand("l-"+ cardIndex +x);
            button.setAlignmentX(Component.CENTER_ALIGNMENT);
            //button.setMargin(new Insets(10,10,10,10));
            //button.setBorder(BorderFactory.createCompoundBorder());
            //button.setPreferredSize(new Dimension(leftPanel_width/2,100));
            int finalX = x;
            int finalN1 = cardIndex;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    ((CardLayout)leftCards.getLayout()).show(rightCards,"R"+ finalN1 );
                    JTabbedPane jTabbedPane = (JTabbedPane) rightCards.getComponent(finalN1);
                    jTabbedPane.setSelectedIndex(finalX);
                }
            });

            Box hBox = Box.createHorizontalBox();
            hBox.add(Box.createHorizontalGlue());
            hBox.add(button);
            hBox.add(Box.createHorizontalGlue());

            vBox.add(Box.createVerticalStrut(10));
            vBox.add(hBox);
            x ++ ;
        }

        add(vBox);
        setPreferredSize(new Dimension(width, height));
    }

}
