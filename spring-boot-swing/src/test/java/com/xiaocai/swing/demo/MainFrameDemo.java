package com.xiaocai.swing.demo;

import com.xiaocai.swing.common.Constants;
import com.xiaocai.swing.common.utils.GlobalUtil;
import com.xiaocai.swing.common.vo.MenuVo;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/16 0:14
 * @version: v1.0
 */
@Slf4j
public class MainFrameDemo {

    private JFrame main;

    private JToolBar toolBar;

    private JButton[] menuButtons ;

    private JPanel mainPanel ;

    private JSplitPane topSplitPanel ;

    private JPanel leftCards = new JPanel();

    private JPanel[] leftPanel ;

    private JSplitPane leftSplitPanel ;

    private JPanel rightCards = new JPanel();

    private JTabbedPane[] tabbedPane ;

    private JPanel[] rightM ;

    private static java.util.List<MenuVo> menuVoList = new ArrayList<>();

    private static int toolBar_height = 100;

    private static int leftPanel_width = 240;


    private static String[] labels = {"Ping", "Xml格式化", "Json格式化", "测试一个比较长的标签", "文字"};

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        menuVoList.add(new MenuVo(1,"菜单1",new ImageIcon("/icon/logo-3.png"), "cmd1"));
        menuVoList.add(new MenuVo(2,"菜单2",new ImageIcon("/icon/logo-3.png"), "cmd2"));
        menuVoList.add(new MenuVo(3,"菜单3",new ImageIcon("/icon/logo-3.png"), "cmd3"));
        menuVoList.add(new MenuVo(4,"菜单4",new ImageIcon("/icon/logo-3.png"), "cmd4"));
        menuVoList.add(new MenuVo(5,"菜单5",new ImageIcon("/icon/logo-3.png"), "cmd5"));

        MainFrameDemo main = new MainFrameDemo();
        main.init();
    }

    private void init() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        GlobalUtil.InitGlobalFont(new Font("微软雅黑", Font.PLAIN, 40));
        //UIManager.put("TabbedPane.tabAreaInsets", new Insets(1,1,1,1));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        final int mainWith = (int )width;
        final int mainHeight = (int )height;
        //leftPanel_width = mainWith /5 ;
        log.info(" left width : " + leftPanel_width);
        main = new JFrame("测试");
        main.getContentPane().setLayout(new BorderLayout());
        main.setMinimumSize(new Dimension(mainWith, mainHeight));

        toolBar = new JToolBar();
        toolBar.setBorderPainted(true);
        toolBar.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
        toolBar.setFloatable(false);
        toolBar.setMinimumSize(new Dimension(mainWith, toolBar_height));

        //MultiToolBarUI.createUI(toolBar);

        rightCards = new JPanel();
        final CardLayout cardLayout = new CardLayout();
        rightCards.setLayout(cardLayout);

        tabbedPane = new JTabbedPane[5];
        int n = 0;
        while (n <5){
            tabbedPane[n] = new JTabbedPane();
            tabbedPane[n].setFont(new Font("微软雅黑", Font.PLAIN, 30));
            tabbedPane[n].setMinimumSize(new Dimension(mainWith - leftPanel_width,mainHeight - toolBar_height));
            // 表示二级菜单[左侧按钮]对应的面板
            rightM = new  JPanel[5];
            int r = 0 ;
            while (r < 5) {
                rightM[r] = new JPanel();
                rightM[r].setFont(new Font("微软雅黑", Font.PLAIN, 40));
                final JTextArea textArea = new JTextArea(5, 10);
                // 设置自动换行
                textArea.setLineWrap(true);
                textArea.setText("测试0000 R-" +n +"-"+ r);
                textArea.setFont(new Font("微软雅黑", Font.PLAIN, 40));
                textArea.setPreferredSize(new Dimension((mainWith - leftPanel_width)/2, (mainHeight -toolBar_height -200)/2));
                rightM[r].add(textArea);
                rightM[r].setVisible(false);

                tabbedPane[n].addTab("title-R-" +n +"-"+ r,  rightM[r]);
                tabbedPane[n].setSelectedIndex(r);
                tabbedPane[n].setAutoscrolls(true);
                r++;
            }
            tabbedPane[n].setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
            tabbedPane[n].setPreferredSize(new Dimension(mainWith - leftPanel_width,mainHeight - 200));

            rightCards.add(tabbedPane[n], "R"+n);
            n++;
        }


        leftPanel = new JPanel[5];
        leftCards.setLayout(cardLayout);
        leftCards.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        n = 0 ;
        int line = 5 % 2 > 0 ? 5/2 +1 : 5/2 ;
        while (n < 5){
            leftPanel[n] = new JPanel();
            leftPanel[n].setBorder(BorderFactory.createLineBorder(Color.RED));
            leftPanel[n].setLayout(new BoxLayout(leftPanel[n], BoxLayout.Y_AXIS));
            //leftPanel[n].setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
            //leftPanel[n].setLayout(new GridLayout(line, 2, 15 ,20));
            leftPanel[n].setMaximumSize(new Dimension(leftPanel_width, mainHeight - toolBar_height));
            //leftPanel[n].setMinimumSize(new Dimension(leftPanel_width, mainHeight-toolBar_height));

            // 创建一个垂直箱容器，放置上面 N 个水平箱（Box组合嵌套）
            Box vBox = Box.createVerticalBox();
            if (n<5){
                int x = 0 ;

                while (x<5) {

                    JButton button = new JButton();
                    button.setFont(new Font("微软雅黑", Font.PLAIN, 32));
                    button.setText("左按钮111-"+ n + "-" + x);
                    button.setToolTipText("左按钮-"+ n + "-" + x);
                    button.setMargin(new Insets(5,3,5,3));
                    button.setActionCommand("l-"+ n+x);
                    button.setAlignmentX(Component.CENTER_ALIGNMENT);
                    //button.setMargin(new Insets(10,10,10,10));
                    //button.setBorder(BorderFactory.createCompoundBorder());
                    //button.setPreferredSize(new Dimension(leftPanel_width/2,100));
                    int finalX = x;
                    int finalN1 = n;
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
            }
            leftPanel[n].add(vBox);
            leftPanel[n].setPreferredSize(new Dimension(leftPanel_width/2, mainHeight - toolBar_height));

            leftCards.add(leftPanel[n], "L"+n);
            n++;
        }


        n = 0 ;
        menuButtons = new JButton[5];
        MenuVo menuVn = null;
        while (n < 5){
            menuVn = menuVoList.get(n);
            menuButtons[n] = new JButton(menuVn.getMenuName());
            menuButtons[n].setFont(new Font("微软雅黑", Font.PLAIN, 38));
            //menuButtons[n].setIcon(menuVn.getImageIcon());
            menuButtons[n].setMargin(new Insets(0,0,10,0));
            menuButtons[n].setActionCommand(menuVn.getMenuCommand());
            menuButtons[n].setIcon(Constants.LOGO);
            menuButtons[n].setBorder(BorderFactory.createLineBorder(Color.GRAY));
            menuButtons[n].setBorderPainted(true);
            menuButtons[n].setPreferredSize(new Dimension(186,80));
            final int finalN = n;
            menuButtons[n].addActionListener((e) ->{
                log.info(e.getActionCommand());
                ((CardLayout)leftCards.getLayout()).show(leftCards,"L"+ finalN);
            });
            toolBar.add(menuButtons[n]);

            n++;
        }

        mainPanel = new JPanel();
        mainPanel.setMinimumSize(new Dimension(1280, 768));



        leftSplitPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftCards, rightCards);
        //leftSplitPanel.setLeftComponent(leftCards);
        //leftSplitPanel.setRightComponent(rightCards);
        leftSplitPanel.setDividerLocation(300);
        // 分隔条上显示快速 折叠/展开 两边组件的小按钮
        leftSplitPanel.setOneTouchExpandable(false);

        // 拖动分隔条时连续重绘组件
        //leftSplitPanel.setContinuousLayout(true);
        //leftSplitPanel.setSize(200,500);

        mainPanel.add(leftSplitPanel);
        //mainPanel.setSize(mainWith/4*3,mainHeight/8*7);

        topSplitPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT, toolBar, mainPanel);

        main.add(topSplitPanel);
        main.setPreferredSize(new Dimension(main.getWidth(), main.getHeight()));
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
