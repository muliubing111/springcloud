package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: ${description}
 * @author: dfz
 * @create: 2018-11-10
 **/
@Component
public class MemberFeignService implements MemberFeign {


    @Override
    public List<String> getOrderByUserList() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list...Feign");
        return listUser;
    }
}
