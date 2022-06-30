package com.xiaocai.demo.java.mapper;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.*;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ ObjectSetField ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/29 15:06
 * @Version ： 1.0
 **/
public class ObjectSetField {

    public static List<String> setList = new ArrayList<>();

    @Test
    public void test_21(){

    }
    
    public static Object getSetField(Class<?> clazz){
        setList.clear();
        Object obj = null;
        try {
            obj = clazz.newInstance();
        } catch (Exception e) {
            System.err.println("填充测试值对象初始化错误：" + e.getMessage());
            return null;
        }
        String className = obj.getClass().getSimpleName();
        String valName = StringUtils.lowerFirstCase(className);
        setList.add("        "+className +" "+valName +" = new "+className+"();");
        Field[] fields = clazz.getDeclaredFields();
        String value = "1";
        String fieldSetMethodName;
        Object fieldValue;
        for (Field field : fields) {
            try {
                field.setAccessible(true);

                fieldValue = parseType(value, field);
                if ("serialVersionUID".equals(field.getName())) {  //排除序列化ID
                    continue;
                }
                fieldSetMethodName = "set" + upperCase(field.getName());
                setList.add("        "+valName+".set"+ upperCase(field.getName())+"("+getDefaultValue(field.getType())+");");
                Method method = clazz.getDeclaredMethod(fieldSetMethodName, field.getType());
                method.invoke(obj, fieldValue);
            } catch (Exception e) {
                System.err.println("填充测试值错误：" + e.getMessage());
//            return null;
            }
        }

        return obj;

    }


    /**
     * 类型转换     *     * @param value 原始数据格式     * @param type 期待转换的类型     * @return 转换后的数据对象
     */
    private static <actualClazz> Object parseType(String value, Field field ) throws IllegalAccessException, InstantiationException {
        Class<?> type = field.getType();
        System.out.println(" field : " +field.getName());
        System.out.println(" type  :" +type.getName());
        if (type == String.class) {
            return value;
        } else if (type == Date.class) {
            return new Date();
        } else if (type == BigDecimal.class) {
            return new BigDecimal(value);
        } else if (type == int.class || type == Integer.class ) {
            return value == null ? 0 : Integer.parseInt(value);
        } else if (type == float.class || type == Float.class) {
            return value == null ? 0f : Float.parseFloat(value);
        } else if (type == long.class || type == Long.class) {
            return value == null ? 0L : Long.parseLong(value);
        } else if (type == double.class || type == Double.class) {
            return value == null ? 0D : Double.parseDouble(value);
        } else if (type == boolean.class || type == Boolean.class) {
            return Boolean.parseBoolean(value);
        } else if (type == byte.class || type == Byte.class) {
            return value == null || value.length() == 0 ? 0 : value.getBytes()[0];
        } else if (type == char.class || type == Character.class) {
            if (value == null || value.length() == 0) {
                return 0;
            }
            char[] chars = new char[1];
            value.getChars(0, 1, chars, 0);
            return chars[0];
        }        // 非基本类型,
        else if (type == Set.class || type == ArrayList.class || type == List.class) {
            Type genericType = field.getGenericType();
            Class<?>  actualClazz = null ;
            if (genericType instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) genericType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actType : actualTypeArguments){
                    //强转
                    actualClazz = (Class<?>) actType;
                }
            }else{
                actualClazz = field.getType();
            }
            actualClazz val = null;
            if (isCommonType(actualClazz)){
                val = (actualClazz) getDefaultValue(actualClazz);
            }
            // todo
            //return new ArrayList<actualClazz>(actualClazz.newInstance());
            if (type == Set.class){
                HashSet<actualClazz> set = new HashSet<>();
                set.add(val);
                return set ;
            }else if (type == List.class) {
                ArrayList<actualClazz> list = new ArrayList<actualClazz>();
                list.add((actualClazz) actualClazz.newInstance());
                return list ;
            }

        }else if (type == Date.class) {
            return new Date();
        }else if (type == Integer[].class) {
            return new Integer[]{3,2};

        }else if (type == Long[].class) {
            return new Long[]{3L,4L};
        }else if (type == Float[].class) {
            return new Float[]{3.1F,4.1F};
        }else if (type == Double[].class) {
            return new Double[]{3.2,4.2};
        }else if (type == String[].class) {
            return new String[]{"a","b"};
        }else if (type == java.sql.Date.class) {
            return new Date();
        }

        throw new IllegalStateException("argument not basic type! now type:" + type.getName());
    }



    private static Object getDefaultValue(Class<?> actualClazz)  {
        String typeName = actualClazz.getTypeName();
        System.out.println(" typeName " + typeName );
        if (typeName.contains("Integer") || typeName.contains("int")){
            return  "1";
        }else if (typeName.contains("float") || typeName.contains("Float")){
            return  "Float.valueOf(\"1.11\")";
        }else if (typeName.contains("long") || typeName.contains("Long")){
            return  "Long.valueOf(\"1L\")";
        }else if (typeName.contains("double") || typeName.contains("Double")){
            return  "Double.valueOf(\"1.22\")";
        }else if (typeName.contains("String")){
            return  "\"A\"";
        }else if (typeName.contains("BigDecimal")){
            return "new BigDecimal(\"1.00\")";
        }else if (typeName.contains("Date")){
            return "new Date())";
        }else if (typeName.contains("List")){
            return "Collections.singletonList(\"z\",\"x\",\"c\")";
        }else{
            //Object o = fillInstance(actualClazz);
            return null ;
        }
    }



    static List<String> comonList = Arrays.asList("int","Integer","long","Long","String","BigDecimal","Date");
    private static boolean isCommonType(Class actualClazzType) {
        String actualClazzTypeName = actualClazzType.getTypeName();
        for (String s : comonList) {
            if (actualClazzTypeName.contains(s)){
                return true;
            }
        }
        return false;
    }

    public static <T> T fillInstance(Class<T> clz) {
        T obj = null;
        try {
            obj = clz.newInstance();
        } catch (Exception e) {
            System.err.println("List填充测试值对象初始化错误：" + e.getMessage());
            return null;
        }

        Field[] fields = clz.getDeclaredFields();
        String value = "2";
        String fieldSetMethodName;
        Object fieldValue;
        for (Field field : fields) {
            try {
                field.setAccessible(true);

                fieldValue = parseType(value, field);
                //fieldValue = getDefaultValue(clz);
                if ("serialVersionUID".equals(field.getName())) {  //排除序列化ID
                    continue;
                }
                fieldSetMethodName = "set" + upperCase(field.getName());
                Method method = clz.getDeclaredMethod(fieldSetMethodName, field.getType());
                method.invoke(obj, fieldValue);
            } catch (Exception e) {
                System.err.println("List填充测试值错误：" + e.getMessage());
//            return null;
            }
        }

        return obj;
    }



    // 首字母变大写
    private static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
}
