package com.xiaocai.swing.ui.progress;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;



import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-15 09:19
 **/
@Component
public class ProgressBeanPostProcessor implements BeanPostProcessor, ApplicationListener<ContextRefreshedEvent> {

    //所有bean的总数随项目增加而增加
    private Integer total = 18;

    private AtomicInteger count = new AtomicInteger(0);

    private final static Subject<Integer> beans = BehaviorSubject.create();


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        count.incrementAndGet();
        beans.onNext(count.get()*100/total);
        return bean;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent applicationEvent) {
        //最终应该设置的total值
        System.out.println("total:");
        System.out.println(count.get());
        beans.onComplete();
    }

    public static Observable<Integer> observe() {
        return beans;
    }
}
