package com.xiaocai.swing.ui.content;

import javax.swing.*;
import java.awt.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 15:13
 * @version: v1.0
 */
public class NetPanel extends RightPanel {

    private JTextField ipTextField ; // 输入框
    private JButton pingButton ;
    private JTextArea resultArea ; // 结果框

    public NetPanel(){

    }

    public void init(){
        final BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setFont(new Font("微软雅黑", Font.PLAIN, 35));
        setLayout(layout);
        setBorder(BorderFactory.createLineBorder(Color.BLUE));

        Box vBox = Box.createVerticalBox();

        ipTextField = new JTextField("请输入域名或IP");
        vBox.add(ipTextField);

        pingButton = new JButton();
        pingButton.setText("ping");
        vBox.add(pingButton);

        resultArea = new JTextArea();
        resultArea.setRows(8);
        vBox.add(resultArea);

        add(vBox);

    }
}
