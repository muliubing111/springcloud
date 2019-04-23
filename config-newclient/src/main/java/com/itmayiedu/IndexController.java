package com.itmayiedu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {
	@Value("${age}")
	String age;

	//使用手动刷新,加RefreshScope注解,@Value参数 不能是name/userName之类的,怀疑是关键字(此时加注解启动后调接口返回空)
	@RequestMapping("/getAge")
	private String getAge() {
		return age;
	}
}
