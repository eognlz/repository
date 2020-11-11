package com.my.main;



import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.my.service.EmpService;
import com.my.vo.EmpVO;


public class EmpMain {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext con = new GenericXmlApplicationContext("app_config.xml");
		EmpService empService = con.getBean(EmpService.class);
		System.out.println(empService.selectEmployee(100));
		List<EmpVO> empList = empService.selectAllEmployees();
		
		for(EmpVO emp : empList) {
			System.out.println(emp);
		}
		
	}

}
