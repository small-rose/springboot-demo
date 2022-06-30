package com.xiaocai.demo.java.mapper;

import com.xiaocai.demo.java.mapper.loader.MyClassloader;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class MybatisMapperTest {
    /**
     * 反射找对象的目录
     */
    static  String classPath = "D:\\idea-Work\\Localization\\cibp\\bp-web\\target\\classes\\";
    /**
     * 项目对应的启动类名 如：BPWebApplication
     */
    static  String appName = "BPWebApplication";
    /**
     * FillMode :
     *      - TestObjExp  使用 TestObjExp 填充属性
     *      - Setter   生成对象.set方法填充属性
     */
    static  String FillMode = "TestObjExp";

    @Test
    public  void main( ) {
        List<String> strings = Collections.singletonList("D:\\idea-Work\\Localization\\cibp\\bp-web\\target\\classes\\com\\fenet\\insurance\\mm\\mapper\\");
        //List<String> strings = Collections.singletonList("D:\\idea-Work\\Localization\\cibp\\bp-web\\target\\classes\\com\\fenet\\insurance\\mm\\mapper\\");
        initMapperTestUtil(strings  ,"target","test.generate");

        System.out.println("init mapperTest all over");
    }


    /**
     *
     * @param mapperPaths  mapper包对应的文件路径的集合 如：D:\work\work_project\cm-service\cm-service\src\main\java\com\fenet\insurance\batchBuckle\dao
     * @param mapperTestPath  mapper单元测试类的输出文件路径 如：D:\work\work_project\cm-service\cm-service\src\test\java\com\fenet\insurance\mapper\
     * @param testPackagePath  mapper单元测试类的 package 路径 如：com.fenet.insurance.mapper
     */
    public static void initMapperTestUtil(List<String> mapperPaths,String mapperTestPath,String testPackagePath) {
        if (mapperPaths.size() > 0 && mapperPaths != null){
            for (String mapperPath : mapperPaths) {
                //对应的mapper文件路径
                File file = new File(mapperPath);
                for(File f:file.listFiles()){
                    if (f.isDirectory()){
                        continue;  //部分dao 还有实现类的文件夹，在此不需要
                    }
                    //Mapper接口名称
                    String className = f.getName().replaceAll("\\.class","");

                    if (!className.equalsIgnoreCase("MmUsablemoneyTdMapper")){
                        continue;
                    }
                    System.out.println(" className " + className);
                    Class claz = LoadClass(classPath, className);
                    classlist.stream().forEach(clz -> {
                        Method[] declaredMethods = clz.getDeclaredMethods();
                        System.out.println( className +" : 合计有 " + declaredMethods.length +" 个方法");
                        for (Method m : declaredMethods) {
                            String methodName = m.getName();
                            System.out.println("methodName: \t " + methodName);
                            Class<?>[] parameterTypes = m.getParameterTypes();
                            Arrays.stream(parameterTypes).forEach(p -> {
                                System.out.println("parameterType: ");
                                System.out.println("  type \t " + p.getTypeName());
                                System.out.println("  name \t " + p.getSimpleName());

                            });
                            Class<?> returnType = m.getReturnType();
                            if (returnType.getTypeName().contains("List")) {
                                System.out.println(returnType);
                            }
                            System.out.println("returnType: \t " + returnType.getTypeName());
                            System.out.println("=================end ================");
                        }


                    });
                    generate( claz, mapperPath, mapperTestPath ,testPackagePath, className);
                    classlist.clear();

                }
            }
        }

    }
    static List<Class> classlist = new ArrayList<>();

    private static  Class LoadClass(String absolutePath, String className) {

        Class clazz = MyClassloader.getCLass(absolutePath, className);
        System.out.println(clazz);


        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods){
            Map<String, Object> params = new HashMap<>();
            String methodName = method.getName();
            params.put("methodName", methodName);
            Class<?>[] parameterTypes = method.getParameterTypes();
            params.put("parameterTypes", parameterTypes);
            Class<?> returnType = method.getReturnType();
            params.put("returnType", returnType);
        }

        classlist.add(clazz);
        return clazz;
    }


    static  List<String> updateList = Arrays.asList("insert","update","delete");
    /**
     *
     * @param mapperPath  mapper包对应的文件路径的集合 如：D:\work\work_project\cm-service\cm-service\src\main\java\com\fenet\insurance\batchBuckle\dao
     * @param mapperTestPath  mapper单元测试类的输出文件路径 如：D:\work\work_project\cm-service\cm-service\src\test\java\com\fenet\insurance\mapper\
     * @param testPackagePath  mapper单元测试类的 package 路径 如：com.fenet.insurance.mapper
     * @param myclassName
     */
    public static void generate(Class clazz, String mapperPath,String mapperTestPath,String testPackagePath,String myclassName) {

                List<String> importLsit = new ArrayList<>(20);
                //对应的mapper文件路径
                File file = new File(mapperPath);
                System.out.println(" 生成路径是 ：" + file.getAbsolutePath());
                for(File f:file.listFiles()){
                    if (f.isDirectory()){
                        continue;  //部分dao 还有实现类的文件夹，在此不需要
                    }
                    //Mapper接口名称
                    String className = f.getName().replaceAll("\\.class","");
                    if(!className.equalsIgnoreCase(myclassName)){
                        //保证反射的类和生成的测试文件一一对应
                        continue;
                    }

                    BufferedReader reader = StringUtils.getBufferedReader(f.getPath());
                    //输出mapper 单元测试类的路径
                    String pathStr = mapperTestPath+"\\"+f.getName();
                    //String pathStr = "D:\\work\\test\\"+f.getName();
                    BufferedWriter writer = StringUtils.getBufferedWriter(pathStr.replaceAll("\\.class","Test.java"));


                    List<String> list = new ArrayList();
                    //mapper测试类包名,需自定义
                    list.add("package "+testPackagePath+";");
                    list.add("");
                    //测试类中需导入的包,需自定义
                    importLsit.add("import org.junit.Test;");
                    importLsit.add("import org.junit.runner.RunWith;");
                    importLsit.add("import org.springframework.boot.test.context.SpringBootTest;");
                    importLsit.add("import org.springframework.beans.factory.annotation.Autowired;");
                    importLsit.add("import org.springframework.test.context.junit4.SpringRunner;");
                    importLsit.add("import org.springframework.transaction.annotation.Transactional;");
                    importLsit.add("import com.fenet.insurance.test.TestObjExp;");

                    // 解析方法签名，为使用到的类动态导包
                    Method[] declaredMethods = clazz.getDeclaredMethods();
                    for (Method  m : declaredMethods){
                        Deprecated annotation = m.getAnnotation(Deprecated.class);
                        if ( annotation!=null){
                            continue;
                        }

                        Class<?>[] parameterTypes = m.getParameterTypes();
                        for (Class<?> clz : parameterTypes) {
                            if (clz.getTypeName().contains("List") || clz.getTypeName().contains("Page")){
                                Type[] genericReturnType = m.getGenericParameterTypes();
                                String actualClazzTypeName = "";
                                for (Type type : genericReturnType){
                                    //获取实际参数名
                                    String paramstypeName = type.getTypeName();
                                     //判断是否参数化类型
                                    if (type instanceof ParameterizedType){
                                        ParameterizedType parameterizedType = (ParameterizedType) type;
                                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                        for (Type actType : actualTypeArguments){
                                            //强转
                                            Class<?>  actualClazz = (Class<?>) actType;
                                            //实际的参数类型
                                            actualClazzTypeName = actualClazz.getTypeName();

                                         }
                                    }else{
                                        actualClazzTypeName = clz.getTypeName();
                                    }
                                    String importTmp = "import " + actualClazzTypeName +";";
                                    if (!importLsit.contains(importTmp)){
                                        importLsit.add(importTmp);
                                    }
                                }
                            }

                        }
                        Class<?> returnType = m.getReturnType();
                        if (returnType.getTypeName().contains("Page")){
                            //返回一个type
                            Type genericReturnType = m.getGenericReturnType();
                            //获取实际返回的参数名
                            String typeName = genericReturnType.getTypeName();
                            //判断是否参数化类型
                            if (genericReturnType instanceof ParameterizedType){
                                ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
                                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                for (Type type : actualTypeArguments){
                                    //强转
                                    Class<?>  actualClazz = (Class<?>) type;
                                    //实际的参数类型

                                    typeName = actualClazz.getTypeName();
                                }
                            }
                            String importTmp = "import " + typeName +";";
                            if (!importLsit.contains(importTmp)){
                                importLsit.add(importTmp);
                            }
                        }
                    }
                    for (String s : importLsit) {
                        list.add(s);
                    }
                    importLsit.clear();

                    list.add("import java.util.*;");
                    list.add("");
                    list.add("");
                    //测试类中需导入的注解,需自定义
                    list.add("@SpringBootTest(classes = "+appName+".class)");
                    list.add("@RunWith(SpringRunner.class)");

                    list.add("@Transactional");
                    list.add("public class "+className+"Test  {");
                    list.add(" ");
                    list.add("    @Autowired");
                    String ltName = StringUtils.lowerFirstCase(className);
                    list.add("    private "+className+" "+ltName+";");
                    list.add(" ");

                    try {

                        System.out.println( className +" : 合计有 " + declaredMethods.length +" 个方法");

                        for (Method  m : declaredMethods){
                            String paramStr = "";
                            List<String> paramList = new ArrayList<>();
                            String methodName =  m.getName();
                            System.out.println("methodName: \t " +methodName);

                            Class<?>[] parameterTypes = m.getParameterTypes();
                            for (Class<?> clz : parameterTypes) {

                                System.out.println("parameterType: " );
                                System.out.println("  type \t " +clz.getTypeName());
                                System.out.println("  name \t " +clz.getSimpleName());
                                if (clz.getTypeName().contains("List") || clz.getTypeName().contains("Page")){
                                    Type[] genericReturnType = m.getGenericParameterTypes();
                                    String actualClazzTypeName = "";
                                    String actualClazzName = "";
                                    for (Type type : genericReturnType){
                                        //获取实际参数名
                                        String paramstypeName = type.getTypeName();
                                        System.out.println(methodName + " 实际方法参数 " +paramstypeName);
                                        //判断是否参数化类型
                                        if (type instanceof ParameterizedType){
                                            ParameterizedType parameterizedType = (ParameterizedType) type;
                                            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                            for (Type actType : actualTypeArguments){
                                                //强转
                                                Class<?>  actualClazz = (Class<?>) actType;
                                                //实际的参数类型
                                                actualClazzTypeName = actualClazz.getTypeName();
                                                actualClazzName = actualClazz.getSimpleName();
                                                System.out.println(methodName + " 方法参数类型是参数化类型，真实类型是： " +actualClazzTypeName);
                                            }
                                        }else{
                                             actualClazzTypeName = clz.getTypeName();
                                            System.out.println("方法参数类型是 ：" +actualClazzTypeName);
                                        }

                                    }
                                    if (clz.getTypeName().contains("List")){
                                        if (isCommonTYpe(actualClazzTypeName)){
                                            if (actualClazzTypeName.contains("String")){
                                                paramStr += "Collections.singletonList(\"a1\",\"a2\",\"a3\")";
                                            }else{
                                                paramStr += "Collections.singletonList(1,2,3)";
                                            }
                                        }else{
                                            paramStr += "Collections.singletonList(TestObjExp.get("+actualClazzTypeName+".class))";
                                        }

                                    }else if(clz.getTypeName().contains("Page")){
                                        paramList.add("        Page<"+actualClazzName+"> page = new Page<>(1,10);");
                                        paramList.add("");
                                        paramStr += "page";
                                    }

                                }else{
                                    if (isCommonTYpe(clz.getTypeName())){
                                        paramStr += getDefaultValue(clz.getTypeName());
                                    }else{
                                        if (clz.getSimpleName().equalsIgnoreCase("Map")){
                                            System.err.println("警告  !!!!!!!! " +className+ "."+ methodName + " 参数是Map,请手工修改");
                                            paramStr += "TestObjExp.get("+clz.getSimpleName()+".class)";
                                        }else {
                                            if ("TestObjExp".equalsIgnoreCase(FillMode)){
                                                // TestObjExp 填充参数
                                                paramStr += "TestObjExp.get("+clz.getSimpleName()+".class)";
                                            }else{
                                                // setter 方法填充对象参数
                                                Object setField =  ObjectSetField.getSetField(clz);
                                                paramList.addAll(ObjectSetField.setList);
                                                String tmp = setField.getClass().getSimpleName();
                                                String valName = StringUtils.lowerFirstCase(tmp);
                                                paramStr += valName;
                                            }
                                        }
                                    }
                                }

                                paramStr += ", ";
                            }
                            paramStr = paramStr.substring(0, paramStr.length()-2);
                            paramStr = "(".concat(paramStr).concat(");");

                            String returnStr = "";
                            Class<?> returnType = m.getReturnType();
                            String retuerName = returnType.getSimpleName();
                            if (returnType.getTypeName().contains("List") || returnType.getTypeName().contains("Page")){
                                //返回一个type
                                Type genericReturnType = m.getGenericReturnType();
                                //获取实际返回的参数名
                                String typeName = genericReturnType.getTypeName();
                                System.out.println(methodName + " 实际返回参数 " +typeName);
                                //判断是否参数化类型
                                if (genericReturnType instanceof ParameterizedType){
                                    ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
                                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                    for (Type type : actualTypeArguments){
                                        //强转
                                        Class<?>  actualClazz = (Class<?>) type;
                                        //实际的参数类型
                                        String retuerType = actualClazz.getTypeName();
                                        retuerName = actualClazz.getSimpleName();
                                        System.out.println(methodName + " 返回参数类型是参数化类型，真实类型是： " +retuerType);
                                    }
                                }
                            }
                            if (returnType.getTypeName().contains("List")){
                                returnStr += "List<"+retuerName+"> ";
                            }else if(returnType.getTypeName().contains("Page")){
                                returnStr += "Page<"+retuerName+"> ";
                            }else{
                                returnStr += retuerName+" ";
                            }

                           //每个接口方法对应的测试用例
                            list.add("    ");
                            list.add("    @Test");
                            if (isRollBack(methodName)) {
                                list.add("    @RollBack");
                            } else {
                                list.add("    @Transactional");
                            }
                            list.add("    public void test" + methodName + "() {");
                            list.add(" ");
                            for (String field : paramList){
                                list.add(field);
                            }
                            paramList.clear();

                            if (returnType.getTypeName().equals("void")) {
                                list.add("        " + ltName + "." + methodName + paramStr);
                            } else {
                                list.add("        "+returnStr+" result = " + ltName + "." + methodName + paramStr);
                            }
                            list.add("        System.out.println(\"测试方法 "+ ltName + "." + methodName+" 执行成功！\");");
                            list.add("    }");
                            list.add("    ");
                        }
                        list.add("}");
                        // 根据排名索引读取并写入文件
                        for (String line:list) {
                            writer.write(line + "\r\n");
                        }
                        writer.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("出错的类名："+className);
                    } finally {
                        if (reader != null) {
                            try {
                                reader.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (writer != null) {
                            try {
                                writer.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }


        }
        System.out.println("init mapperTest all over");
    }

    private static String getDefaultValue(String typeName) {
        System.out.println(" typeName " + typeName );
        if (typeName.contains("Integer") || typeName.contains("int")){
            return  "1";
        }else if (typeName.contains("long") || typeName.contains("Long")){
            return  "1L";
        }else if (typeName.contains("String")){
            return  "\"1\"";
        }else if (typeName.contains("BigDecimal")){
            return "new BigDecimal(\"1.00\")";
        }else if (typeName.contains("Date")){
            return "new Date())";
        }else{
            return null;
        }
    }

    static List<String> commonList = Arrays.asList("int","Integer","long","Long","String","BigDecimal","Date");
    private static boolean isCommonTYpe(String actualClazzTypeName) {
        for (String s : commonList) {
            if (actualClazzTypeName.contains(s)){
                return true;
            }
        }
        return false;
    }


    private static boolean isRollBack(String methodName){
        for (String s : updateList) {
            if (methodName.contains(s)){
                return true;
            }
        }
        return false;
    }
}
