package com.xiaocai.demo.java.reflect.demo;


import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;


public class TestObjExp {
//    public static Object get(Class var1) {
//        PodamFactory factory = new PodamFactoryImpl();
//        return factory.manufacturePojo(var1);
//    }

    public static void main(String[] args) {
        Ta obj = get(Ta.class);
        System.out.println(obj.getList());
    }

    @Test
    public  void main() {
        Ta obj = get(Ta.class);
        System.out.println(obj.getList());
    }

    public static <T> T get(Class<T> clz) {
        T obj = null;
        try {
            obj = clz.newInstance();
        } catch (Exception e) {
            System.out.println("填充测试值对象初始化错误：" + e.getMessage());
            return null;
        }

        Field[] fields = clz.getDeclaredFields();
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
                Method method = clz.getDeclaredMethod(fieldSetMethodName, field.getType());
                method.invoke(obj, fieldValue);
            } catch (Exception e) {
                System.out.println("填充测试值错误：" + e.getMessage());
//            return null;
            }
        }

        return obj;

    }    // 首字母变大写

    private static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
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
        } else if (type == int.class) {
            return value == null ? 0 : Integer.parseInt(value);
        } else if (type == float.class) {
            return value == null ? 0f : Float.parseFloat(value);
        } else if (type == long.class) {
            return value == null ? 0L : Long.parseLong(value);
        } else if (type == double.class) {
            return value == null ? 0D : Double.parseDouble(value);
        } else if (type == boolean.class) {
            return Boolean.parseBoolean(value);
        } else if (type == byte.class) {
            return value == null || value.length() == 0 ? 0 : value.getBytes()[0];
        } else if (type == char.class) {
            if (value == null || value.length() == 0) {
                return 0;
            }
            char[] chars = new char[1];
            value.getChars(0, 1, chars, 0);
            return chars[0];
        }        // 非基本类型,
/*        if (StringUtils.isEmpty(value)) {
            return null;
        }
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }*/

        if (type == Integer.class ) {
            return Integer.valueOf(value);
        } else if (type == Long.class) {
            return Long.valueOf(value);
        } else if (type == Float.class) {
            return Float.valueOf(value);
        } else if (type == Double.class) {
            return Double.valueOf(value);
        } else if (type == Boolean.class) {
            return Boolean.valueOf(value);
        } else if (type == Byte.class) {
            return value.getBytes()[0];
        } else if (type == Character.class) {
            char[] chars = new char[1];
            value.getChars(0, 1, chars, 0);
            return chars[0];
        }  else if (type == Set.class) {
            return null;
        } else if (type == ArrayList.class) {
            Type genericType = field.getGenericType();
            Class<?>  actualClazz = null ;
            if (genericType instanceof ParameterizedType ){
                ParameterizedType parameterizedType = (ParameterizedType) genericType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (Type actType : actualTypeArguments){
                    //强转
                    actualClazz = (Class<?>) actType;
                }
            }else{
                actualClazz = field.getType();
            }
            // todo
            //return new ArrayList<actualClazz>(actualClazz.newInstance());
            ArrayList<actualClazz> list = new ArrayList<actualClazz>();
            list.add((actualClazz) actualClazz.newInstance());
            return list ;
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

}
