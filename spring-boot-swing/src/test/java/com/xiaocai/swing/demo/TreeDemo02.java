package com.xiaocai.swing.demo;

import com.xiaocai.swing.common.utils.GlobalUtil;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;
import java.awt.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 11:34
 * @version: v1.0
 */
public class TreeDemo02 extends JFrame implements TreeSelectionListener {

    // 构造节点
    private DefaultMutableTreeNode root, node_1, node_2, node_1_1, node_1_2;
    // 构造树模型
    private DefaultTreeModel treeModel;
    // 构造树
    private JTree tree;

    public TreeDemo02(){
        GlobalUtil.InitGlobalFont(new Font("微软雅黑", Font.PLAIN, 40));
        this.setSize(800, 650);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getSize().width)/2;
        int y = (screenSize.height - this.getSize().height)/2;
        this.setLocation(x, y);

        root = new DefaultMutableTreeNode("根节点");
        node_1 = new DefaultMutableTreeNode("一级01");
        node_1_1 = new DefaultMutableTreeNode("二级01");
        node_1_2 = new DefaultMutableTreeNode("二级02");
        node_2 = new DefaultMutableTreeNode("一级02");

        treeModel = new DefaultTreeModel(root);
        treeModel.insertNodeInto(node_1, root, root.getChildCount());
        treeModel.insertNodeInto(node_2, root, root.getChildCount());
        treeModel.insertNodeInto(node_1_1, node_1, node_1.getChildCount());
        treeModel.insertNodeInto(node_1_2, node_1, node_1.getChildCount());

        tree = new JTree(treeModel);
        // 设置单选
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        DefaultTreeCellRenderer cellRenderer = (DefaultTreeCellRenderer)tree.getCellRenderer();
        cellRenderer.setTextNonSelectionColor(Color.black);
        cellRenderer.setTextSelectionColor(Color.blue);

        this.add(tree);

        this.setVisible(true);
    }

    public void valueChanged(TreeSelectionEvent e) {
        TreePath treePath = e.getNewLeadSelectionPath();// 例如[中国, 江苏省, 南京市]
        if (treePath != null) {
            // 返回路径上最底层的组件，对于树形结构，即叶子节点
            // this will return an instance of TreeNode.
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) treePath.getLastPathComponent();
            StringBuilder sb = new StringBuilder();
            sb.append("您选择的是：");
            sb.append(node);
            sb.append("\r\n");
            sb.append("路径为：");
            sb.append(treePath);
            JOptionPane.showMessageDialog(null, sb, "提示",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "您尚未选择节点！", "错误",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args){
        @SuppressWarnings("unused")
        TreeDemo02 test = new TreeDemo02();
    }
}
