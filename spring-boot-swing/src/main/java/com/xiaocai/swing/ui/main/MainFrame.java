package com.xiaocai.swing.ui.main;

import com.xiaocai.swing.function.listener.TabActionListener;
import com.xiaocai.swing.ui.menu.MyMenu;
import com.xiaocai.swing.ui.tool.MyButton;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 09:36
 **/
@Component("MainFrame")
public class MainFrame extends JFrame {


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private JToolBar toolBar1;
    private JButton button1 ;
    private JButton button2 ;

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


        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();

        menu1 = new MyMenu("文件");
        menu2 = new MyMenu("编辑");

        //======== this ========
        setMinimumSize(new Dimension(1000, 500));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        menuBar1.add(menu1);
        menuBar1.add(menu2);
        setJMenuBar(menuBar1);

        toolBar1 = new JToolBar();
        toolBar1.setFloatable(false);

        JPanel leftCards = new JPanel(new CardLayout());

        leftCards.setMinimumSize(new Dimension(300,300));



        JTabbedPane rightPanel = new JTabbedPane();

        JPanel tools = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
        tools.setMaximumSize(new Dimension(100,getHeight()));

        int b = 1 ;
        while (b < 10){
            MyButton m1 = new MyButton("Tools-0"+b);
            m1.addActionListener(new TabActionListener(rightPanel,m1));
            tools.add(m1);
            b++;
        }

        JPanel codes = new JPanel(new FlowLayout(FlowLayout.LEFT,5,5));
        JTree.DynamicUtilTreeNode nodes = new JTree.DynamicUtilTreeNode("Root", null);
        nodes.setAllowsChildren(true);
        int c = 1 ;
        MutableTreeNode treeNode = null ;
        while (c < 10){

            if (c==1){
                treeNode = new JTree.DynamicUtilTreeNode("level" + c, null );

                int x = 0 ;
                MutableTreeNode[] children = new MutableTreeNode[5];
                while (x < 5){
                    children[x] = new DefaultMutableTreeNode("Data-"+x);
                    children[x].setParent(treeNode);
                    x ++ ;
                }

            }else {
                treeNode = new JTree.DynamicUtilTreeNode("level" + c, null);
            }
            nodes.add(treeNode);
            c++;
        }
        codes.add(new JTree(nodes));
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
        sp.setDividerLocation(110);

        JSplitPane main = new JSplitPane(JSplitPane.VERTICAL_SPLIT, toolBar1, sp);
        setContentPane(main);
        pack();
        setLocationRelativeTo(getOwner());
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


}
