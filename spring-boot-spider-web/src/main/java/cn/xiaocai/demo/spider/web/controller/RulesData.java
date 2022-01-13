package cn.xiaocai.demo.spider.web.controller;

import cn.xiaocai.demo.spider.door.baserules.BaseWebRule;
import cn.xiaocai.demo.spider.web.vo.Rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ RulesData ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/1 0:06
 * @Version ： 1.0
 **/
public class RulesData {

    protected static final List<Rules> appdataList = new ArrayList<Rules>(10);
    protected static List<Rules> customList = new ArrayList<Rules>();
    protected static List<Rules> totalList = new ArrayList<Rules>();

    protected static Integer custmTotal = 0;

    protected static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    protected static List<BaseWebRule> taskList = new ArrayList<BaseWebRule>(1);
}
