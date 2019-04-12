package com.example.demo.service.impl;

import com.example.demo.service.MemberFeign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 会员服务实现类Feign
 * @author: dfz
 * @create: 2018-11-10
 **/
@Service
public class MemberFeignService implements MemberFeign {


    @Override
    public List<String> getOrderByUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list...Feign");
        return listUser;
    }
}
