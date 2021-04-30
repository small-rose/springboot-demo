package cn.xiaocai.demo.rabbitmq.producer.config.exchange.fanout;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-30 13:20
 **/
@Configuration
public class FanoutRabbitConfig {

    public static final String FANOUT_A = "fanout.A" ;
    public static final String FANOUT_B = "fanout.B" ;
    public static final String FANOUT_C = "fanout.C" ;

    /**
     *  创建三个队列 ：fanout.A   fanout.B  fanout.C
     *  将三个队列都绑定在交换机 fanoutExchange 上
     *  因为是扇型交换机, 路由键无需配置,配置也不起作用
     */
    @Bean
    public Queue queueA() {
        Map<String, Object> args = new HashMap<>();
        // set the queue with a dead letter feature
        args.put("x-queue-type", "classic");
        return new Queue(FANOUT_A, true,false, false, args);
    }

    @Bean
    public Queue queueB() {
        Map<String, Object> args = new HashMap<>();
        // set the queue with a dead letter feature
        args.put("x-queue-type", "classic");
        return new Queue(FANOUT_B, true,false, false, args);
    }

    @Bean
    public Queue queueC() {
        Map<String, Object> args = new HashMap<>();
        // set the queue with a dead letter feature
        args.put("x-queue-type", "classic");
        return new Queue(FANOUT_C, true,false, false, args);
    }

    /**
     *    fanoutExchange ,该名字要在rabbitMQ 控制台找得到
     * @return
     */
    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    /**
     * 将队列 和 交换机绑定
     * @return
     */
    @Bean
    Binding bindingExchangeA() {
        return BindingBuilder.bind(queueA()).to(fanoutExchange());
    }

    @Bean
    Binding bindingExchangeB() {
        return BindingBuilder.bind(queueB()).to(fanoutExchange());
    }

    @Bean
    Binding bindingExchangeC() {
        return BindingBuilder.bind(queueC()).to(fanoutExchange());
    }
}
