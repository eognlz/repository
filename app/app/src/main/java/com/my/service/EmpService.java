package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.dao.EmpRepository;
import com.my.vo.EmpVO;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRepository;
	
	public EmpVO selectEmployee(int empId) {
		return empRepository.selectEmployee(empId);
	}
	
	public List<EmpVO> selectAllEmployees(){
		return empRepository.selectAllEmployees();
	}
}
