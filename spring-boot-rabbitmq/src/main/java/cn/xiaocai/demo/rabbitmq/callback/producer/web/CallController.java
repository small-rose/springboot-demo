package cn.xiaocai.demo.rabbitmq.callback.producer.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @program: springboot-demo
 * @description
 * @function:
 *    （1）消息推送到server，但是在server里找不到交换机
 *    （2）消息推送到server，找到交换机了，但是没找到队列
 *    （3）消息推送到sever，交换机和队列啥都没找到  跟（1）类似
 *    （4）消息推送成功 --> 这种情况触发的是 ConfirmCallback 回调函数。  可以直接使用定时任务进行测试 如: FanoutSendMessage
 * @author: zzy
 * @create: 2021-04-30 15:12
 **/
@RestController
@Slf4j
public class CallController {

    @Resource
    private RabbitTemplate rabbitTemplate;

    /**
     * （1）消息推送到server，但是在server里找不到交换机
     * 把消息推送到名为‘non-existent-exchange’的交换机上（这个交换机是没有创建没有配置的）
     *
     *  结论： （1）这种情况触发的是 ConfirmCallback 回调函数。
     *          （3）和（1）情况回调是一致的.触发的是 ConfirmCallback 回调函数。
     * @return
     */
    @GetMapping("/TestCallBack1")
    public String TestCallBack1() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "message: non-existent-exchange test message ";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> map = new HashMap<>();
        map.put("messageId", messageId);
        map.put("messageData", messageData);
        map.put("createTime", createTime);
        rabbitTemplate.convertAndSend("non-existent-exchange", "TestDirectRouting", map);
        return "TestCallBack1 SUCCESS";
    }

    /**
     * （2）消息推送到server，找到交换机了，但是没找到队列
     * 这种情况就是需要新增一个交换机，但是不给这个交换机绑定队列， 在 CallBackRabbitConfig 里面新增一个直连交换机，名叫‘lonelyDirectExchange’，但没给它做任何绑定配置操作：
     * 然后测试 把消息推送到名为‘lonelyDirectExchange’的交换机上（这个交换机是没有任何队列配置的）：
     *
     * 消息是推送成功到服务器了的，所以ConfirmCallback对消息确认情况是true；
     * 而在RetrunCallback回调函数的打印参数里面可以看到，消息是推送到了交换机成功了，但是在路由分发给队列的时候，找不到队列，所以报了错误 NO_ROUTE 。
     *
     * 结论： （2）这种情况触发的是 ConfirmCallback和RetrunCallback两个回调函数。
     * @return
     */
    @GetMapping("/TestCallBack2")
    public String TestCallBack2() {
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "message: lonelyDirectExchange test message ";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String, Object> map = new HashMap<>();
        map.put("messageId", messageId);
        map.put("messageData", messageData);
        map.put("createTime", createTime);
        rabbitTemplate.convertAndSend("lonelyDirectExchange", "TestDirectRouting", map);
        return "ok";
    }
}
