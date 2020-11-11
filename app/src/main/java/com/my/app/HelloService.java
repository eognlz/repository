package com.my.app;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {

	@Override
	public String sayHello(String message) {
		
		return "Hello " +message ;
	}


}
