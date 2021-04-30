package cn.xiaocai.demo.rabbitmq.producer.mq.direct;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: bp-paystation-client
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 09:37
 **/
@Component
@Slf4j
@AllArgsConstructor
public class DirectSendMessage {
    /**
     *   使用RabbitTemplate,这提供了接收/发送等等方法
     */
    private final RabbitTemplate rabbitTemplate;

    private static int x = 0 ;

    @Scheduled(cron = "0/6 * * * * ?")
    public void sendMsg(){
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "test message "+(x++)+", hello!";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String,Object> map = new HashMap<>();
        map.put("messageId", messageId);
        map.put("messageData", messageData);
        map.put("createTime", createTime);
        //将消息携带绑定键值：TestDirectRouting 发送到交换机TestDirectExchange
        rabbitTemplate.convertAndSend("TestDirectExchange", "TestDirectRouting", map);
        log.info("--DirectSendMessage--"+createTime);
    }
}
