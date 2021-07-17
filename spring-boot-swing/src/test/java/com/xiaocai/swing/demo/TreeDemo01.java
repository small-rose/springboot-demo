package com.xiaocai.swing.demo;

import com.xiaocai.swing.common.utils.GlobalUtil;

import javax.swing.*;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 11:13
 * @version: v1.0
 */
public class TreeDemo01 {

    public static void main(String[] args) {
        GlobalUtil.InitGlobalFont(new Font("微软雅黑", Font.PLAIN, 40));
        JTree tree = new JTree(new TestModel());
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(tree));
        frame.pack();
        frame.setPreferredSize(new Dimension(1000,800));
        frame.setVisible(true);
    }
}


class TestModel implements TreeModel {

    Element data;

    TestModel() {
        data = new Element("data");
        data.add(new Element("One"));
        data.add(new Element("Two"));
        data.add(new Element("Three"));
        data.add(new Element("Four"));
        data.add(new Element("Five"));
    }
    @Override
    public Object getRoot() {
        return data;
    }

    @Override
    public Object getChild(Object parent, int index) {

        System.out.println("GetChild from " + parent + " @ " + index);

        if (parent instanceof Element) {
            Element p = (Element) parent;
            Object child = p.getChildAt(index);

            System.out.println("child = " + child);
            return child;
        }
        return null;
    }

    @Override
    public int getChildCount(Object parent) {
        if (parent instanceof Element) {
            Element e = (Element) parent;
            System.out.println("childCount = " + parent + "; " + e.getChildCount());
            return e.getChildCount();
        }
        return 0;
    }
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        if (parent instanceof Element && child instanceof Element) {
            Element e = (Element) parent;
            System.out.println("indexOf " + child + " in " + parent + " is "
                    + e.getIndex((Element) child));
            return e.getIndex((Element) child);
        }
        return -1;
    }
    @Override
    public boolean isLeaf(Object node) {
        if (node instanceof Element) {
            Element e = (Element) node;
            System.out.println("isLeaf " + e + "; " + (e.getChildCount() == 0));
            return e.getChildCount() == 0;
        }
        return true;
    }
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
    }
    @Override
    public void addTreeModelListener(TreeModelListener l) {
    }
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
    }
}

class Element implements TreeNode {
    java.util.List<Element> nodes;
    Element parent;
    String name;
    public Element(String n) {
        nodes = new ArrayList<>(25);
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }
    protected void setParent(Element parent) {
        this.parent = parent;
    }
    public void add(Element node) {
        node.setParent(this);
        nodes.add(node);
    }
    public void remove(Element node) {
        node.setParent(null);
        nodes.remove(node);
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        return nodes.get(childIndex);
    }

    @Override
    public int getChildCount() {
        return nodes.size();
    }

    @Override
    public TreeNode getParent() {
        return parent;
    }

    @Override
    public int getIndex(TreeNode node) {
        return nodes.indexOf(node);
    }

    @Override
    public boolean getAllowsChildren() {
        return true;
    }

    @Override
    public boolean isLeaf() {
        return nodes.isEmpty();
    }

    @Override
    public Enumeration children() {
        return Collections.enumeration(nodes);
    }
}