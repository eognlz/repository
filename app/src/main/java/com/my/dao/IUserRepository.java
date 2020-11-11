package com.my.dao;

import com.my.vo.UserVO;

public interface IUserRepository {

	void inserJoin(UserVO vo);
	String getPassword(String userId);
	UserVO getMypage(UserVO vo);
	
	UserVO getInfo(String userId);
	boolean getIdCheck(String userId);
	int getUserCheck(String userId);
}
