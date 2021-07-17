/*
 * Created by JFormDesigner on Sat Jul 17 22:21:57 CST 2021
 */

package com.xiaocai.swing.ui.main;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author unknown
 */
@Component
@Getter
public class MyFrame extends JFrame {
    public MyFrame() {
        initComponents();
    }

    private void ipButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        toolBar1 = new JToolBar();
        toolsButton = new JButton();
        codeButton = new JButton();
        noteButton = new JButton();
        mainPanel = new JPanel();
        leftPanel = new JPanel();
        leftcard_tools = new JPanel();
        ipButton = new JButton();
        xmlButton = new JButton();
        jsonButton = new JButton();
        rightPanel = new JPanel();
        tool_card = new JTabbedPane();
        ipcard_panel = new JPanel();
        ipValue = new JTextField();
        pingButton = new JButton();
        scrollPane1 = new JScrollPane();
        ipResult = new JTextArea();
        label1 = new JLabel();
        xmlcard_panel = new JPanel();
        scrollPane2 = new JScrollPane();
        xmlSource = new JTextArea();
        xmlFormatButton = new JButton();
        xmlUnFormatBtn = new JButton();
        scrollPane3 = new JScrollPane();
        xmlTarget = new JTextArea();
        jsoncard_panel = new JPanel();
        scrollPane4 = new JScrollPane();
        jsonSource = new JTextArea();
        button4 = new JButton();
        button5 = new JButton();
        scrollPane5 = new JScrollPane();
        jsonTarget = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== toolBar1 ========
        {

            //---- toolsButton ----
            toolsButton.setText("\u5de5\u5177");
            toolBar1.add(toolsButton);

            //---- codeButton ----
            codeButton.setText("\u4ee3\u7801");
            toolBar1.add(codeButton);

            //---- noteButton ----
            noteButton.setText("\u901f\u8bb0");
            toolBar1.add(noteButton);
        }
        contentPane.add(toolBar1, BorderLayout.NORTH);

        //======== mainPanel ========
        {
            mainPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,mainPanel. getBorder
            ( )) ); mainPanel. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
            mainPanel.setLayout(new BorderLayout());

            //======== leftPanel ========
            {
                leftPanel.setPreferredSize(new Dimension(118, 242));
                leftPanel.setMinimumSize(new Dimension(280, 600));
                leftPanel.setLayout(new CardLayout());

                //======== leftcard_tools ========
                {
                    leftcard_tools.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                    //---- ipButton ----
                    ipButton.setText("IP\u5de5\u5177");
                    ipButton.addActionListener(e -> ipButtonActionPerformed(e));

                    //---- xmlButton ----
                    xmlButton.setText("XML\u683c\u5f0f\u5316");

                    //---- jsonButton ----
                    jsonButton.setText("JSON\u683c\u5f0f\u5316");

                    GroupLayout leftcard_toolsLayout = new GroupLayout(leftcard_tools);
                    leftcard_tools.setLayout(leftcard_toolsLayout);
                    leftcard_toolsLayout.setHorizontalGroup(
                        leftcard_toolsLayout.createParallelGroup()
                            .addGroup(leftcard_toolsLayout.createSequentialGroup()
                                .addGroup(leftcard_toolsLayout.createParallelGroup()
                                    .addComponent(ipButton, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xmlButton, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsonButton, GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
                    );
                    leftcard_toolsLayout.setVerticalGroup(
                        leftcard_toolsLayout.createParallelGroup()
                            .addGroup(leftcard_toolsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ipButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xmlButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsonButton)
                                .addContainerGap(238, Short.MAX_VALUE))
                    );
                }
                leftPanel.add(leftcard_tools, "card1");
            }
            mainPanel.add(leftPanel, BorderLayout.WEST);

            //======== rightPanel ========
            {
                rightPanel.setLayout(new CardLayout());

                //======== tool_card ========
                {

                    //======== ipcard_panel ========
                    {

                        //---- pingButton ----
                        pingButton.setText("ping \u4e00\u4e0b");
                        pingButton.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));

                        //======== scrollPane1 ========
                        {

                            //---- ipResult ----
                            ipResult.setRows(10);
                            ipResult.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));
                            scrollPane1.setViewportView(ipResult);
                        }

                        //---- label1 ----
                        label1.setText("IP\u6216\u8005\u57df\u540d");
                        label1.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 14));

                        GroupLayout ipcard_panelLayout = new GroupLayout(ipcard_panel);
                        ipcard_panel.setLayout(ipcard_panelLayout);
                        ipcard_panelLayout.setHorizontalGroup(
                            ipcard_panelLayout.createParallelGroup()
                                .addGroup(ipcard_panelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(label1)
                                    .addGap(18, 18, 18)
                                    .addGroup(ipcard_panelLayout.createParallelGroup()
                                        .addComponent(pingButton, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ipValue, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1))
                                    .addContainerGap(63, Short.MAX_VALUE))
                        );
                        ipcard_panelLayout.setVerticalGroup(
                            ipcard_panelLayout.createParallelGroup()
                                .addGroup(ipcard_panelLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(ipcard_panelLayout.createParallelGroup()
                                        .addComponent(label1)
                                        .addComponent(ipValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pingButton)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addContainerGap())
                        );
                    }
                    tool_card.addTab("Ping", ipcard_panel);

                    //======== xmlcard_panel ========
                    {

                        //======== scrollPane2 ========
                        {

                            //---- xmlSource ----
                            xmlSource.setRows(10);
                            scrollPane2.setViewportView(xmlSource);
                        }

                        //---- xmlFormatButton ----
                        xmlFormatButton.setText("\u683c\u5f0f\u5316");

                        //---- xmlUnFormatBtn ----
                        xmlUnFormatBtn.setText("\u538b\u7f29");

                        //======== scrollPane3 ========
                        {

                            //---- xmlTarget ----
                            xmlTarget.setRows(10);
                            scrollPane3.setViewportView(xmlTarget);
                        }

                        GroupLayout xmlcard_panelLayout = new GroupLayout(xmlcard_panel);
                        xmlcard_panel.setLayout(xmlcard_panelLayout);
                        xmlcard_panelLayout.setHorizontalGroup(
                            xmlcard_panelLayout.createParallelGroup()
                                .addGroup(xmlcard_panelLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(xmlcard_panelLayout.createParallelGroup()
                                        .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                        .addGroup(xmlcard_panelLayout.createSequentialGroup()
                                            .addGroup(xmlcard_panelLayout.createParallelGroup()
                                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                                                .addGroup(xmlcard_panelLayout.createSequentialGroup()
                                                    .addComponent(xmlFormatButton)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(xmlUnFormatBtn)
                                                    .addGap(0, 365, Short.MAX_VALUE)))
                                            .addContainerGap())))
                        );
                        xmlcard_panelLayout.setVerticalGroup(
                            xmlcard_panelLayout.createParallelGroup()
                                .addGroup(xmlcard_panelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(xmlcard_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(xmlFormatButton)
                                        .addComponent(xmlUnFormatBtn))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                        );
                    }
                    tool_card.addTab("XML\u683c\u5f0f\u5316", xmlcard_panel);

                    //======== jsoncard_panel ========
                    {

                        //======== scrollPane4 ========
                        {

                            //---- jsonSource ----
                            jsonSource.setRows(10);
                            scrollPane4.setViewportView(jsonSource);
                        }

                        //---- button4 ----
                        button4.setText("\u683c\u5f0f\u5316");

                        //---- button5 ----
                        button5.setText("\u538b\u7f29");

                        //======== scrollPane5 ========
                        {

                            //---- jsonTarget ----
                            jsonTarget.setRows(10);
                            scrollPane5.setViewportView(jsonTarget);
                        }

                        GroupLayout jsoncard_panelLayout = new GroupLayout(jsoncard_panel);
                        jsoncard_panel.setLayout(jsoncard_panelLayout);
                        jsoncard_panelLayout.setHorizontalGroup(
                            jsoncard_panelLayout.createParallelGroup()
                                .addGroup(jsoncard_panelLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(jsoncard_panelLayout.createParallelGroup()
                                        .addComponent(scrollPane5, GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                                        .addGroup(jsoncard_panelLayout.createSequentialGroup()
                                            .addGroup(jsoncard_panelLayout.createParallelGroup()
                                                .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                                                .addGroup(jsoncard_panelLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(button4)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(button5)
                                                    .addGap(0, 341, Short.MAX_VALUE)))
                                            .addContainerGap())))
                        );
                        jsoncard_panelLayout.setVerticalGroup(
                            jsoncard_panelLayout.createParallelGroup()
                                .addGroup(jsoncard_panelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jsoncard_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4)
                                        .addComponent(button5))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(18, Short.MAX_VALUE))
                        );
                    }
                    tool_card.addTab("Json\u683c\u5f0f\u5316", jsoncard_panel);
                }
                rightPanel.add(tool_card, "card1");
            }
            mainPanel.add(rightPanel, BorderLayout.CENTER);
        }
        contentPane.add(mainPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JToolBar toolBar1;
    private JButton toolsButton;
    private JButton codeButton;
    private JButton noteButton;
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel leftcard_tools;
    private JButton ipButton;
    private JButton xmlButton;
    private JButton jsonButton;
    private JPanel rightPanel;
    private JTabbedPane tool_card;
    private JPanel ipcard_panel;
    private JTextField ipValue;
    private JButton pingButton;
    private JScrollPane scrollPane1;
    private JTextArea ipResult;
    private JLabel label1;
    private JPanel xmlcard_panel;
    private JScrollPane scrollPane2;
    private JTextArea xmlSource;
    private JButton xmlFormatButton;
    private JButton xmlUnFormatBtn;
    private JScrollPane scrollPane3;
    private JTextArea xmlTarget;
    private JPanel jsoncard_panel;
    private JScrollPane scrollPane4;
    private JTextArea jsonSource;
    private JButton button4;
    private JButton button5;
    private JScrollPane scrollPane5;
    private JTextArea jsonTarget;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
