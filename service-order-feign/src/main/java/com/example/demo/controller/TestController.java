package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TestController
 * @author: dfz
 * @create: 2019-04-12
 **/
@Slf4j
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getPost")
    public void getPort() {
        log.info("port=" + port);
    }
}
