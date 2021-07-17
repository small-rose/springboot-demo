package com.xiaocai.swing.ui.content;

import com.sun.istack.internal.NotNull;
import com.xiaocai.swing.common.Constants;
import com.xiaocai.swing.common.vo.MenuVo;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/15 22:04
 * @version: v1.0
 */
@Slf4j
public class ToolBarPanel extends JToolBar {

    @Setter
    @NotNull
    private MenuVo[] tools;
    @Setter
    @NotNull
    private int mainWith ;
    @Setter
    @Getter
    @NotNull
    private int toolBar_height ;

    
    private JButton[] toolButtons ;
    
    public ToolBarPanel(MenuVo[] tools){
        setBorderPainted(true);
        setLayout(new FlowLayout(FlowLayout.LEADING,10,10));

        this.tools = tools;
    }

    public void init(LeftCardPanel leftCards){
        setMinimumSize(new Dimension(mainWith, toolBar_height));
        setFloatable(false);

        toolButtons = new JButton[tools.length];
        int n = 0 ;
        MenuVo menuVn = null;
        while (n < tools.length){
            menuVn = tools[n];
            toolButtons[n] = new JButton(menuVn.getMenuName());
            toolButtons[n].setFont(new Font("微软雅黑", Font.PLAIN, 38));
            toolButtons[n].setIcon(menuVn.getImageIcon());
            toolButtons[n].setMargin(new Insets(0,0,10,0));
            toolButtons[n].setActionCommand(menuVn.getMenuCommand());
            toolButtons[n].setIcon(Constants.LOGO);
            toolButtons[n].setBorder(BorderFactory.createLineBorder(Color.GRAY));
            toolButtons[n].setBorderPainted(true);
            toolButtons[n].setPreferredSize(new Dimension(186,80));
            final int finalN = n;
            toolButtons[n].addActionListener((e) ->{
                ((CardLayout)leftCards.getLayout()).show(leftCards,"L"+ finalN);
            });
            add(toolButtons[n]);
            n++;
        }
    }


}
