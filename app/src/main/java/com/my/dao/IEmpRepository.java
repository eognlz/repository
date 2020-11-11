package com.my.dao;


import java.util.List;
import java.util.Map;

import com.my.vo.EmpVO;
import com.my.vo.UserVO;

public interface IEmpRepository {
	int getEmpCount();
	int getEmpCount(int deptId);
	List<EmpVO> getEmpList();
	List<EmpVO> getEmpListt(int deptId);
	void updateEmp(EmpVO emp);
	void insertEmp(EmpVO emp);
	void deleteEmp(int empId);
	void deleteJobHistory(int empId);
	List<Map<String,Object>> getAllDeptId();
	List<Map<String,Object>> getAllJobId();
	List<Map<String,Object>> getAllManagerId();
	EmpVO getEmpInfo(int empId);
	List<EmpVO> getEmpSearch(String category, String search);
	void getUpdateManagers(int empId);
	void getUpdateManagerss(int empId);
//	void getManagerDept(int empId);
	int getidCheck(int empId);
	

	
	
	

}
