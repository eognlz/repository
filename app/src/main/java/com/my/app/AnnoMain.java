package com.my.app;

public class AnnoMain {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		MyContext con = new MyContext();
		MyData myData = con.getInstance(MyData.class);
		System.out.println(myData.name);
		System.out.println(myData.toSay);
		
		
	}

}
