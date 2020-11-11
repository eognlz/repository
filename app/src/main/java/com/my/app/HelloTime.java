package com.my.app;

import org.springframework.stereotype.Component;

@Component
public class HelloTime {

	public void timeLog() {
		System.out.println(new java.util.Date());
	}
	
}
