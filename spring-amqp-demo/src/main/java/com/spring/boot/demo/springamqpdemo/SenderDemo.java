package com.spring.boot.demo.springamqpdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author <a href="https://github.com/xiaobei-ihmhny">xiaobei-ihmhny</a>
 * @date 2020-07-03 14:28:28
 */
@Component
public class SenderDemo {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendStr() {
        rabbitTemplate.convertAndSend(
                "exchangeName", "routingKey", "hello, rabbitmq~");
    }

    public void sendObject() {
        User user = new User("xiaobei","123456");
        rabbitTemplate.convertAndSend("exchangeName", "routingKey", user);
    }
}