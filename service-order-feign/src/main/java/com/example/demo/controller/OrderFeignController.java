package com.example.demo.controller;

import com.example.demo.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 订单服务Controller
 * @author: dfz
 * @create: 2018-11-10
 **/
@RestController
public class OrderFeignController {

    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping(value = "/getUserList")
    public List<String> getUserList() {
        return memberFeign.getOrderByUserList();

    }
}
