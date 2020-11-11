package com.my.app.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.my.dao.IEmpRepository;
import com.my.vo.EmpVO;
import com.my.vo.UserVO;
@Service
public class EmpService implements IEmpService {

	@Autowired
	@Qualifier("IEmpRepository")
	IEmpRepository empRepository;
	
	@Override
	public int getEmpCount() {
	return empRepository.getEmpCount();
	}
	@Override
	public int getEmpCount(int deptId) {
	return empRepository.getEmpCount(deptId);
	}
	@Override
	public List<EmpVO> getEmpList() {
	return empRepository.getEmpList();
	}
	@Override
	public EmpVO getEmpInfo(int empId) {
	return empRepository.getEmpInfo(empId);
	}
	@Override
	public void updateEmp(EmpVO emp) {
	empRepository.deleteJobHistory(emp.getEmployeeId());
	empRepository.updateEmp(emp);
	}
	@Override
	public void insertEmp(EmpVO emp) {
	empRepository.insertEmp(emp);
	}
	@Override
	public void deleteEmp(int empId) {
	empRepository.deleteJobHistory(empId);
	empRepository.getUpdateManagers(empId);
	empRepository.getUpdateManagerss(empId);
	empRepository.deleteEmp(empId);
	}
	@Override
	public void deleteJobHistory(int empId) {
	empRepository.deleteJobHistory(empId);
	}
	@Override
	public List<Map<String, Object>> getAllDeptId() {
		return empRepository.getAllDeptId();
	}
	@Override
	public List<Map<String, Object>> getAllJobId() {
		return empRepository.getAllJobId();
	}
	@Override
	public List<Map<String, Object>> getAllManagerId() {
		return empRepository.getAllManagerId();
	}
	@Override
	public List<EmpVO> getEmpListt(int deptId) {
		return empRepository.getEmpListt(deptId);
	}
	@Override
	public List<EmpVO> getEmpSearch(String category, String search) {
		return empRepository.getEmpSearch(category,search);
	}
//	@Override
//	public void getManagerID(int empId) {
//		empRepository.getManagerDept(empId);
//	}
	@Override
	public int getidCheck(int empId) {
		return empRepository.getidCheck(empId);
	}
	
	
	
	
	


}
