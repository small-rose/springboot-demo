package com.xiaocai.demo.java;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ LoadFileFromJar ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/8/18 17:37
 * @Version ： 1.0
 **/
public class LoadFileFromJar {

    /**
     * 从ClassPath中的Jar包读取某文件夹下的所有文件
     *
     * @author lihzh
     * @throws IOException
     * @data 2012-4-13 下午10:22:24
     */
    @Test
    public void testGetFilesFromJarInClassPathWithDirPath() throws IOException {
        String dirPath = "conf/";
        URL url = this.getClass().getClassLoader().getResource(dirPath);
        Assert.assertNotNull(url);
        String urlStr = url.toString();
        // 找到!/ 截断之前的字符串
        String jarPath = urlStr.substring(0, urlStr.indexOf("!/") + 2);
        URL jarURL = new URL(jarPath);
        JarURLConnection jarCon = (JarURLConnection) jarURL.openConnection();
        JarFile jarFile = jarCon.getJarFile();
        Enumeration<JarEntry> jarEntrys = jarFile.entries();
        Assert.assertTrue(jarEntrys.hasMoreElements());

        while (jarEntrys.hasMoreElements()) {
            JarEntry entry = jarEntrys.nextElement();
            // 简单的判断路径，如果想做到像Spring，Ant-Style格式的路径匹配需要用到正则。
            String name = entry.getName();
            if (name.startsWith(dirPath) && !entry.isDirectory()) {
                // 开始读取文件内容
                InputStream is = this.getClass().getClassLoader().getResourceAsStream(name);
                Assert.assertNotNull(is);
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                StringBuilder result = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    System.out.println("result" + result);
                }

            }
        }

    }
}
