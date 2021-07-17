/*
 * Created by JFormDesigner on Sat Jul 17 17:09:46 CST 2021
 */

package com.xiaocai.swing.function.from;

import cn.hutool.core.util.RuntimeUtil;
import com.jgoodies.forms.factories.Borders;
import com.xiaocai.swing.common.utils.SystemUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author unknown
 */
@Component("NetFromDemo02")
@Slf4j
public class NetFromDemo02 extends JFrame {
    public NetFromDemo02() {
        initComponents();
    }

    private void pingBottonActionPerformed(ActionEvent e) {
        // TODO add your code here
        String text = ipValue.getText();
        try {

            String ipConfigStr;
            if (SystemUtil.isWindowsOs()) {
                ipConfigStr = RuntimeUtil.execForStr("ipconfig");
            } else {
                ipConfigStr = RuntimeUtil.execForStr("ifconfig");
            }
            pingIpResult.setText(ipConfigStr);
            pingIpResult.setCaretPosition(0);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ExceptionUtils.getStackTrace(ex));
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        ipLabel = new JLabel();
        ipValue = new JTextField();
        pingBotton = new JButton();
        scrollPane1 = new JScrollPane();
        pingIpResult = new JTextArea();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(Borders.createEmptyBorder("7dlu, 7dlu, 7dlu, 7dlu"));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder
            ( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- ipLabel ----
                ipLabel.setText("IP\u6216\u8005\u57df\u540d");

                //---- ipValue ----
                ipValue.setFont(new Font("\u7b49\u7ebf Light", Font.BOLD, 14));
                ipValue.setToolTipText("\u8bf7\u8f93\u5165IP\u6216\u57df\u540d");

                //---- pingBotton ----
                pingBotton.setText("ping");
                pingBotton.setBackground(new Color(0, 204, 255));
                pingBotton.addActionListener(e -> pingBottonActionPerformed(e));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(pingIpResult);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(ipLabel)
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(pingBotton, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipValue, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane1))
                            .addGap(0, 96, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(ipValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(ipLabel))
                            .addGap(5, 5, 5)
                            .addComponent(pingBotton)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        setPreferredSize(new Dimension(getWidth(), getHeight()));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel ipLabel;
    private JTextField ipValue;
    private JButton pingBotton;
    private JScrollPane scrollPane1;
    private JTextArea pingIpResult;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
