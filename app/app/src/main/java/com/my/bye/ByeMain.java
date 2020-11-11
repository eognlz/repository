package com.my.bye;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ByeMain {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext con = 
				new GenericXmlApplicationContext("app_config.xml");
		ByeController controller = con.getBean(ByeController.class);
		
		controller.sayBye("ㅇㅇ");
		con.close();
		
	}

}
