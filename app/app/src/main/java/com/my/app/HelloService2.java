package com.my.app;

import org.springframework.stereotype.Service;

@Service
public class HelloService2  implements IHelloService{
	
	
	public String sayHello(String message) {
		
		return "Helloo " +message ;
	}
}
