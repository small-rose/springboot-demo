package cn.xiaocai.demo.jsoup.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @program: springboot-redis
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 14:37
 **/
public class ConstantUtils {
    private static String[] agents = new String[] {

            "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0)",//
            "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.2)",//
            "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)",//
            "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT)",//
            "Mozilla/5.0 (Windows; U; Windows NT 5.2) Gecko/2008070208 Firefox/3.0.1",//
            "Mozilla/5.0 (Windows; U; Windows NT 5.1) Gecko/20070309 Firefox/2.0.0.3",//
            "Mozilla/5.0 (Windows; U; Windows NT 5.1) Gecko/20070803 Firefox/1.5.0.12",//
            "Opera/9.27 (Windows NT 5.2; U; zh-cn)",//
            "Opera/8.0 (Macintosh; PPC Mac OS X; U; en)",//
            "Mozilla/5.0 (Macintosh; PPC Mac OS X; U; en) Opera 8.0",//
            "Mozilla/5.0 (Windows; U; Windows NT 5.2) AppleWebKit/525.13 (KHTML, like Gecko) Version/3.1 Safari/525.13",//
            "Mozilla/5.0 (iPhone; U; CPU like Mac OS X) AppleWebKit/420.1 (KHTML, like Gecko) Version/3.0 Mobile/4A93 Safari/419.3",//
            "Mozilla/5.0 (Windows; U; Windows NT 5.2) AppleWebKit/525.13 (KHTML, like Gecko) Chrome/0.2.149.27 Safari/525.13" };

    private static Map<Integer, String> provinces;

    static {
        provinces = new HashMap<Integer, String>();
        provinces.put(1, "上海");
        provinces.put(2, "北京");
        provinces.put(3, "天津");
        provinces.put(4, "河北");
        provinces.put(5, "江苏");
        provinces.put(6, "浙江");
        provinces.put(7, "重庆");
        provinces.put(8, "内蒙古");
        provinces.put(9, "辽宁");
        provinces.put(10, "吉林");
        provinces.put(11, "黑龙江");
        provinces.put(12, "四川");
        provinces.put(13, "安徽");
        provinces.put(14, "福建");
        provinces.put(15, "江西");
        provinces.put(16, "山东");
        provinces.put(17, "河南");
        provinces.put(18, "湖北");
        provinces.put(19, "湖南");
        provinces.put(20, "广东");
        provinces.put(21, "广西");
        provinces.put(22, "海南");
        provinces.put(23, "贵州");
        provinces.put(24, "云南");
        provinces.put(25, "西藏");
        provinces.put(26, "陕西");
        provinces.put(27, "甘肃");
        provinces.put(28, "青海");
        provinces.put(29, "新疆");
        provinces.put(30, "宁夏");
        provinces.put(32, "山西");
    }

    /**
     * 获取省
     * @param id
     * @return
     */
    public static String getProvince(int id) {
        return provinces.get(id);
    }

    /**
     * 随机获取agent
     *
     * @return
     */
    public static String getAgent() {

        int m = new Random().nextInt(agents.length);
        return agents[m];
    }
}
