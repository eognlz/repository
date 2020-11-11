package com.my.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
//		HelloController controller = new HelloController();
//		controller.sayHello("ddd");
		
		AbstractApplicationContext con = 
				new GenericXmlApplicationContext("app_config.xml");
		HelloController controller = con.getBean(HelloController.class);
		controller.sayHello("www");
		con.close();
	}

}
