package com.xiaocai.demo.java.mapper.loader;

import java.io.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ MyClassloader ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/27 13:53
 * @Version ： 1.0
 **/
public class MyClassloader  extends ClassLoader {

    private String path;
    private String classloaderName; //自定义类加载器的名字

    public MyClassloader(String path, String classloaderName) {
        this.path = path;
        this.classloaderName = classloaderName;
    }

    //寻找类文件
    @Override
    protected Class<?> findClass(String name)  {
        byte[] b = loadClassData(name);
        return defineClass(name,b,0,b.length);
    }

    public byte[] loadClassData(String name){
        String loadclassPath = path + name.replace(".","/") +".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            System.out.println("LoadClass path ：" + loadclassPath);
            in = new FileInputStream(new File(loadclassPath));
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1){
                out.write(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }

    public static <T> Class<T>  getCLass(String path ,String className) {

        Class  c = null;
        try {
            String loaderClas =  "com.fenet.insurance.mm.mapper."+className;
            MyClassloader myClassloader = new MyClassloader( path,"myclassloader");
             c = myClassloader.findClass(loaderClas);
            //System.out.println(c.getClassLoader());
            //System.out.println(c.getClassLoader().getParent());
            //System.out.println(c.getClassLoader().getParent().getParent());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return  c;
        }
    }
}
