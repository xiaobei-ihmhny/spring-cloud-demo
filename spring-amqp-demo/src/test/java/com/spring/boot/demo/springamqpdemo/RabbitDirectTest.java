package com.spring.boot.demo.springamqpdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author <a href="https://github.com/xiaobei-ihmhny">xiaobei-ihmhny</a>
 * @date 2020-07-03 15:10:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitDirectTest {

    @Autowired
    private SenderDemo senderDemo;

    @Test
    public void sendHelloTest() {
        senderDemo.sendStr();
    }

    @Test
    public void sendDirectTest() {
        senderDemo.sendObject();
    }

}