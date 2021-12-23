package cn.xiaocai.demo.tkbase.web.common.base;

import com.esotericsoftware.reflectasm.MethodAccess;
import org.springframework.objenesis.Objenesis;
import org.springframework.objenesis.ObjenesisStd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Bean2MapUtil {
    /**
     * 高性能java实例化工具
     */
    private final static Objenesis objenesis = new ObjenesisStd(true);
    private final static StringBuilder stringBuilder=new StringBuilder();
    /**
     * 缓存reflectASM的反射字节集
     */
    private final static ConcurrentHashMap<Class,MethodAccess> CONCURRENT_HASH_MAP=new ConcurrentHashMap<Class,MethodAccess>(16);

    /**
     * map转java bean工具类
     * @param map
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T>   T  map2Bean(Map<String,Object> map, Class<T> clazz){
        T instance = objenesis.newInstance(clazz);
        MethodAccess methodAccess = CONCURRENT_HASH_MAP.get(clazz);
        if(methodAccess==null){
            methodAccess=MethodAccess.get(clazz);
            CONCURRENT_HASH_MAP.putIfAbsent(clazz,methodAccess);
        }

        for(Map.Entry<String,Object> entry:map.entrySet()){
            String setMethodName = getSetMethodName(entry.getKey());
            int index = methodAccess.getIndex(setMethodName,entry.getValue().getClass());
            methodAccess.invoke(instance,index,entry.getValue());
        }
        return  instance;
    }

    /**
     *
     * @Title: fristToUpperCase
     * @Description: 首字母变大写
     * @param @param str
     * @param @return 设定参数
     * @return String 返回类型
     * @since  1.0.0
     * @author dbw
     * @throws
     */
    private static String  fristToUpperCase(String str){
        return  str.substring(0,1).toUpperCase()+str.substring(1,str.length());
    }


    /**
     * 通过字段获取方法名字
     * @param filedName
     * @return
     */
    private static String getSetMethodName(String filedName){
        stringBuilder.setLength(0);
        return stringBuilder.append("set").append(fristToUpperCase(filedName)).toString();
    }
}
