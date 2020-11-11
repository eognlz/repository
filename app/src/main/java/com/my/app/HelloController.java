package com.my.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

	@Autowired
	@Qualifier("helloService")//빈 이름 기준
	IHelloService helloService;
	
//	public HelloController(IHelloService helloService) {
//		this.helloService = helloService;
//	}
	
	public void sayHello(String message) {
		System.out.println(helloService.sayHello(message));
	}
	
}
