package com.xiaocai.swing.ui.main;

import com.xiaocai.swing.common.Constants;
import com.xiaocai.swing.function.listener.TabActionListener;
import com.xiaocai.swing.ui.tool.MyButton;
import lombok.Getter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.multi.MultiToolBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 09:36
 **/
@Component("MainFrame")
@Getter
public class MainFrame extends JFrame {

    private JToolBar toolBar1;
    private JButton button1 ;
    private JButton button2 ;

    private JSplitPane topPanel ;
    private JSplitPane leftPanel ;

    public MainFrame() {
        initAttributes();
        initComponents();
    }

    private void initAttributes(){
        try {
            ImageIcon imageIcon = new ImageIcon(new ClassPathResource("/icon/logo-3.png").getURL());
            setIconImage(imageIcon.getImage());
            setTitle("张小菜");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void initComponents() {
        InitGlobalFont(new Font("微软雅黑", Font.PLAIN, 40)); // 统一设置字体
        setForeground(Constants.GREEN_COLOR);

        //======== this ========
        setMinimumSize(new Dimension(1000, 500));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());


        toolBar1 = new JToolBar();
        toolBar1.setFloatable(false);
        toolBar1.setBorderPainted(true);
        MultiToolBarUI.createUI(toolBar1);

        JPanel leftCards = new JPanel(new CardLayout());
        leftCards.setForeground(Constants.GREEN_COLOR);
        leftCards.setMinimumSize(new Dimension(300,300));



        JTabbedPane rightPanel = new JTabbedPane();
        rightPanel.setForeground(Constants.GREEN_COLOR);

        JPanel tools = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
        tools.setMaximumSize(new Dimension(100,getHeight()));

        int b = 1 ;
        while (b < 10){
            MyButton m1 = new MyButton("Tools-0"+b);
            m1.addActionListener(new TabActionListener(rightPanel, m1));
            tools.add(m1);
            b++;
        }

        JPanel codes = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));


        codes.setMaximumSize(new Dimension(100,getHeight()));

        leftCards.add(tools,"Tools");
        leftCards.add(codes, "Codes");

        {
            button1 = new MyButton("Tools");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    e.getActionCommand();
                    ((CardLayout)leftCards.getLayout()).show(leftCards,"Tools");
                }
            });
            toolBar1.add(button1);

            button2 = new JButton("Codes");
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    ((CardLayout)leftCards.getLayout()).show(leftCards, "Codes");
                }
            });
            toolBar1.add(button2);
        }
        // 把工具栏放在north的位置
        add(toolBar1, BorderLayout.NORTH);

        leftCards.setBorder(BorderFactory.createDashedBorder(Color.red));
        leftCards.setMaximumSize(new Dimension(100, getHeight()));
        leftCards.setVisible(true);



        // 创建一个水平JSplitPane，左边是p1,右边是p2
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftCards, rightPanel);
        // 设置分割条的位置
        sp.setDividerLocation(120);

        JSplitPane main = new JSplitPane(JSplitPane.VERTICAL_SPLIT, toolBar1, sp);
        setContentPane(main);

        pack();
        setLocationRelativeTo(getOwner());
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    /**
     * 统一设置字体，父界面设置之后，所有由父界面进入的子界面都不需要再次设置字体
     */
    private static void InitGlobalFont(Font font) {
        FontUIResource fontRes = new FontUIResource(font);
        // 打印字体信息
        System.out.println("fontRes:" + fontRes);
        for (Enumeration<Object> keys = UIManager.getDefaults().keys(); keys.hasMoreElements();) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);

            if (value instanceof FontUIResource) {
                // 打印默认的所有有关字体的信息
                System.out.println("key:" + key + "value:" + value);
                UIManager.put(key, fontRes);
                // 打印更改后的相关信息
                System.out.println("key:" + key + "value:" + UIManager.get(key));
            }

        }
    }
}
