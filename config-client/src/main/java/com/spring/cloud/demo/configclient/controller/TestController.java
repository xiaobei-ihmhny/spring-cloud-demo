package com.spring.cloud.demo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="https://github.com/xiaobei-ihmhny">xiaobei-ihmhny</a>
 * @date 2020/4/18 18:28
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${appname}")
    private String appname;

    @GetMapping("/appname")
    public String getUserName() {
        return this.appname;
    }
}
