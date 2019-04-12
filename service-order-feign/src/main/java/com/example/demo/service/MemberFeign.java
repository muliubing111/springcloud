package com.example.demo.service;

import com.example.demo.service.impl.MemberFeignService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description: 会员服务接口Feign
 * @author: dfz
 * @create: 2018-11-10
 **/
@FeignClient(value = "service-member", fallback = MemberFeignService.class)
public interface MemberFeign {

    @RequestMapping("/getUserList")
    List<String> getOrderByUserList();
}
