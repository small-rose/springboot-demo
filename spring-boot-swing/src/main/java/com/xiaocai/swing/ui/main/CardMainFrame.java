package com.xiaocai.swing.ui.main;

import com.xiaocai.swing.common.utils.GlobalUtil;
import com.xiaocai.swing.common.vo.MenuVo;
import com.xiaocai.swing.ui.content.*;
import org.springframework.core.io.ClassPathResource;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 14:18
 * @version: v1.0
 */
public class CardMainFrame  extends JFrame {

    private ToolBarPanel toolBar;

    private JSplitPane topPanel ;

    private JPanel mainPanel;

    private JSplitPane leftPanel ;

    private LeftCardPanel leftCards ;

    private RightCardPanel rightCards ;

    private static MenuVo[] level_1 =
            { new MenuVo(100,"工具",new ImageIcon("images/blue.png"), "cmd1"),
              new MenuVo(200,"代码",new ImageIcon("icon/meihong.png"), "cmd2"),
              new MenuVo(300,"速记",new ImageIcon("icon/zise.png"), "cmd3"),
            };
    private static MenuVo[] Level_2_1 = {
                    new MenuVo(101,"工具1",new ImageIcon("icon/logo-3.png"), "cmd-t-1"),
                    new MenuVo(101,"工具2",new ImageIcon("icon/logo-3.png"), "cmd-t-2"),
                    new MenuVo(102,"工具3",new ImageIcon("icon/logo-3.png"), "cmd-t-3"),
                    new MenuVo(103,"工具4",new ImageIcon("icon/logo-3.png"), "cmd4-t-"),
                    new MenuVo(104,"工具5",new ImageIcon("icon/logo-3.png"), "cmd-t-5"),
                    new MenuVo(105,"工具6",new ImageIcon("icon/logo-3.png"), "cmd-t-6")
            };
    private static MenuVo[] Level_2_2 = {
                    new MenuVo(201,"代码1",new ImageIcon("icon/logo-3.png"), "cmd-c-1"),
                    new MenuVo(202,"代码2",new ImageIcon("icon/logo-3.png"), "cmd-c-2"),
                    new MenuVo(203,"代码3",new ImageIcon("icon/logo-3.png"), "cmd-c-3"),
                    new MenuVo(204,"代码4",new ImageIcon("icon/logo-3.png"), "cmd-c-4"),
                    new MenuVo(205,"代码5",new ImageIcon("icon/logo-3.png"), "cmd-c-5"),
                    new MenuVo(206,"代码6",new ImageIcon("icon/logo-3.png"), "cmd-c-6")
            };

    private static MenuVo[] Level_2_3 = {
                    new MenuVo(301,"速记2",new ImageIcon("icon/logo-3.png"), "cmd-n-2"),
                    new MenuVo(302,"速记3",new ImageIcon("icon/logo-3.png"), "cmd-n-3"),
                    new MenuVo(303,"速记4",new ImageIcon("icon/logo-3.png"), "cmd-n-4"),
                    new MenuVo(304,"速记5",new ImageIcon("icon/logo-3.png"), "cmd-n-5"),
                    new MenuVo(305,"速记6",new ImageIcon("icon/logo-3.png"), "cmd-n-6")
            };

    private static Map<Integer, MenuVo[]> data = new HashMap<>();

    public CardMainFrame() {

        data.put(100, Level_2_1);
        data.put(200, Level_2_2);
        data.put(300, Level_2_3);

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
        GlobalUtil.InitGlobalFont(new Font("微软雅黑", Font.PLAIN, 40)); // 统一设置字体
        //======== this ========
        setMinimumSize(new Dimension(1200, 780));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        final int mainWith = (int )width;
        final int mainHeight = (int )height;

        // 右侧的卡片容器
        rightCards = new RightCardPanel(level_1.length);
        rightCards.setRightPanel_height(mainHeight -100);
        rightCards.init();



        //  左侧的卡片容器
        leftCards = new LeftCardPanel(level_1.length);
        leftCards.setLeftPanel_width(240);
        leftCards.setLeftPanel_height(mainHeight - 100);
        leftCards.init();


        int x = 0 ;
        // 左侧的卡片内容
        LeftPanel content = null;
        while (x < level_1.length){
            MenuVo[] menuVos = data.get(level_1[x].getId());

            content = new LeftPanel(menuVos);
            content.setWidth(240);
            content.setHeight(800);
            content.init(x, leftCards, rightCards);


            for (int r=0 ; r < menuVos.length; r++){
                NetPanel netPanel = new NetPanel();
                netPanel.init();
                netPanel.setPreferredSize(new Dimension(mainWith - 240, mainHeight- 100));
                rightCards.addTabContent(x, netPanel);
            }


            leftCards.addContent(x , content);
            x++ ;
        }

        toolBar = new ToolBarPanel(level_1);
        toolBar.setMainWith(mainWith);
        toolBar.setToolBar_height(100);
        toolBar.init(leftCards);


        leftPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftCards, rightCards);
        leftPanel.setDividerLocation(245);
        leftPanel.setPreferredSize(new Dimension(245, mainHeight-110));

        mainPanel = new JPanel();
        mainPanel.add(leftPanel);

        topPanel = new JSplitPane(JSplitPane.VERTICAL_SPLIT, toolBar, mainPanel);
        topPanel.setDividerLocation(105);

        add(topPanel);

        pack();
        setPreferredSize(new Dimension(getWidth(), getHeight()));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
