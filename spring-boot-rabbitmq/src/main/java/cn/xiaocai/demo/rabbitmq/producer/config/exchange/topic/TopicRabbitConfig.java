package cn.xiaocai.demo.rabbitmq.producer.config.exchange.topic;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description    exclusive consumer 功能是如何保证消息有序和防止脑裂的 https://blog.csdn.net/cadem/article/details/70157494
 * @function:
 * @author: zzy
 * @create: 2021-04-30 13:21
 **/
@Configuration
public class TopicRabbitConfig {

    /**
     *     绑定键
     */
    public final static String man = "topic.pay";
    public final static String woman = "topic.eat";

    @Bean
    public Queue firstQueue() {
        Map<String, Object> args = new HashMap<>();
        // set the queue with a dead letter feature
        args.put("x-queue-type", "classic");
        return new Queue(TopicRabbitConfig.man ,true, false,false, args);
    }

    @Bean
    public Queue secondQueue() {
        Map<String, Object> args = new HashMap<>();
        // set the queue with a dead letter feature
        args.put("x-queue-type", "classic");
        return new Queue(TopicRabbitConfig.woman, true, false,false, args);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }

    /**
    * 将firstQueue和topicExchange绑定,而且绑定的键值为topic.man
    * 这样只要是消息携带的路由键是topic.man,才会分发到该队列
    */
    @Bean
    Binding bindingExchangeMessage() {
        return BindingBuilder.bind(firstQueue()).to(exchange()).with(man);
    }
    /**
    * 将secondQueue和topicExchange绑定,而且绑定的键值为用上通配路由键规则topic.#
    *  这样只要是消息携带的路由键是以topic.开头,都会分发到该队列
    *  */
    @Bean
    Binding bindingExchangeMessage2() {
        return BindingBuilder.bind(secondQueue()).to(exchange()).with("topic.#");
    }
}
