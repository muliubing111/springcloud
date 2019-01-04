package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: ${description}
 * @author: dfz
 * @create: 2018-11-10
 **/
@RestController
public class OrderFeignController {

    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping(value = "aaa")
    public List<String> getUserList() {
       return memberFeign.getOrderByUserList();

    }
}
