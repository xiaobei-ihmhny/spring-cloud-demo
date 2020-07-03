package com.spring.boot.demo.springamqpdemo;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="https://github.com/xiaobei-ihmhny">xiaobei-ihmhny</a>
 * @date 2020-07-03 14:17:17
 */
@Configuration
public class RabbitMqConfig {

    /**
     * 创建队列
     * @return
     */
    @Bean
    public Queue testQueue() {
        return new Queue("queueName");
    }

    /**
     * 创建交换机
     * @return
     */
    @Bean
    public DirectExchange testExchange() {
        return new DirectExchange("exchangeName");
    }

    /**
     * 将队列与交换机绑定在一起
     * @param queue
     * @param exchange
     * @return
     */
    @Bean
    public Binding testBinding(Queue queue, DirectExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("routingKey");
    }




}