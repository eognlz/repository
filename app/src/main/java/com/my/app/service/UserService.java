package com.my.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.my.dao.IUserRepository;
import com.my.vo.UserVO;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	BCryptPasswordEncoder bqe;//페스워드 암호화 
	
	@Override
	public void inserJoin(UserVO vo) {
		vo.setUserPw(bqe.encode(vo.getUserPw()));
		userRepository.inserJoin(vo);
	}

	@Override
	public UserVO getInfo(String userId) {
		return userRepository.getInfo(userId);
	}

	@Override
	public boolean getIdCheck(String userId) {
		
		  return userRepository.getIdCheck(userId);
		  
	}

	@Override
	public String getPassword(String userId) {
		return userRepository.getPassword(userId);
	}
	
	@Override
	public UserVO getMypage(UserVO vo) {
		return null;
	}

	@Override
	public int getUserCheck(String userId) {
		return userRepository.getUserCheck(userId);
	}


}
