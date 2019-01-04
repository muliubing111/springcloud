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
public class OrderController {
    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/getMemberList")
    public List<String> getMemberList() {
        return memberService.getOrderByUserList();
    }
}
