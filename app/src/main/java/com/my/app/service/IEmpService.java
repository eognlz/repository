package com.my.app.service;


import java.util.List;
import java.util.Map;

import com.my.vo.EmpVO;
import com.my.vo.UserVO;

public interface IEmpService {

	
	
	int getEmpCount();
	int getEmpCount(int deptId);
	List<EmpVO> getEmpList();
	List<EmpVO> getEmpListt(int deptId);
	EmpVO getEmpInfo(int empId);
	void updateEmp(EmpVO emp);
	void insertEmp(EmpVO emp);
	void deleteEmp(int empId);
	void deleteJobHistory(int empId);
	List<Map<String,Object>> getAllDeptId();
	List<Map<String,Object>> getAllJobId();
	List<Map<String,Object>> getAllManagerId();
	List<EmpVO> getEmpSearch(String category,String search);
//	List<EmpVO> getEmpSearch(String name);
//	void getManagerID(int empId);
//	List<JobVO> getAllJobId();
	int getidCheck(int empId);
	
	
	


}
