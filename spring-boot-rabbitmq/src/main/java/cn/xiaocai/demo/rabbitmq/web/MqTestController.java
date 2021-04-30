package cn.xiaocai.demo.rabbitmq.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 13:17
 **/
@RestController
@Slf4j
public class MqTestController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("send/{message}")
    public String sendMsg(@PathVariable("message") String message){
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "test message , hello!";
        messageData  =  message!=null ? message : messageData;
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String,Object> map = new HashMap<>();
        map.put("messageId", messageId);
        map.put("messageData", messageData);
        map.put("createTime", createTime);
        //将消息携带绑定键值：TestDirectRouting 发送到交换机TestDirectExchange
        rabbitTemplate.convertAndSend("TestDirectExchange", "TestDirectRouting", map);
        log.info("--DirectSendMessage--"+LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));

        return "send ok";
    }
}
