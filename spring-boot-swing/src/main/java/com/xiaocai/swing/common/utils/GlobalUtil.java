package com.xiaocai.swing.common.utils;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.Enumeration;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 11:18
 * @version: v1.0
 */
public class GlobalUtil {

    /**
     * 统一设置字体，父界面设置之后，所有由父界面进入的子界面都不需要再次设置字体
     */
    public static void InitGlobalFont(Font font) {
        FontUIResource fontRes = new FontUIResource(font);
        // 打印字体信息
        System.out.println("fontRes:" + fontRes);
        for (Enumeration<Object> keys = UIManager.getDefaults().keys(); keys.hasMoreElements();) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);

            if (value instanceof FontUIResource) {
                // 打印默认的所有有关字体的信息
                //System.out.println("key:" + key + "value:" + value);
                UIManager.put(key, fontRes);
                // 打印更改后的相关信息
                //System.out.println("key:" + key + "value:" + UIManager.get(key));
            }

        }
    }
}
