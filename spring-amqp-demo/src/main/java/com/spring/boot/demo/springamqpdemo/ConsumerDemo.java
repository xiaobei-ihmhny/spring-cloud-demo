package com.spring.boot.demo.springamqpdemo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author <a href="https://github.com/xiaobei-ihmhny">xiaobei-ihmhny</a>
 * @date 2020-07-03 14:30:30
 */
@Component
public class ConsumerDemo {

    @RabbitListener(queues = "queueName")
    public void processStr(String data) {
        System.out.printf("====data: %s",data);
//        int i = 1/0;
    }

    /*@RabbitListener(queues = "queueName")
    public void processObj(User user) {
        System.out.printf("====data: %s",user);
        int i = 1 / 0;
    }*/
}