package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description: ${description}
 * @author: dfz
 * @create: 2018-11-10
 **/
@FeignClient(value = "service-member", fallback = MemberFeignService.class)
public interface MemberFeign {

    @RequestMapping("/getUserList")
    List<String> getOrderByUserList();
}
