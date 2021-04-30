package cn.xiaocai.demo.rabbitmq.producer.mq.topic;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 13:47
 **/
@Component
@Slf4j
//@AllArgsConstructor
public class TopicSendMessage {
    @Resource
    private RabbitTemplate rabbitTemplate;

    private AtomicReference<Integer> mCount = new AtomicReference<>(1);
    private AtomicReference<Integer> wCount = new AtomicReference<>(1);

   // @Scheduled(cron = "0/4 * * * * ?")
    public String sendTopicMessage1() {

        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "message: M A N is paying " + mCount.get();
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> manMap = new HashMap<>();
        manMap.put("messageId", messageId);
        manMap.put("messageData", messageData);
        manMap.put("createTime", createTime);
        rabbitTemplate.convertAndSend("topicExchange", "topic.pay", manMap);

        mCount.compareAndSet(mCount.get(), mCount.get()+1);
        return "ok";
    }

  //  @Scheduled(cron = "0/5 * * * * ?")
    public String sendTopicMessage2() {

        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "message: woman is eating " +  + wCount.get();
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> womanMap = new HashMap<>();
        womanMap.put("messageId", messageId);
        womanMap.put("messageData", messageData);
        womanMap.put("createTime", createTime);
        rabbitTemplate.convertAndSend("topicExchange", "topic.eat", womanMap);
        wCount.compareAndSet(wCount.get(), wCount.get()+1);
        return "ok";
    }
}
