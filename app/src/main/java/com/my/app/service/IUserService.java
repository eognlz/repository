package com.my.app.service;

import com.my.vo.UserVO;

public interface IUserService {

	void inserJoin(UserVO vo);
	String getPassword(String userId);
	UserVO getMypage(UserVO vo);

	UserVO getInfo(String userId);
	boolean getIdCheck(String userId);
	int getUserCheck(String userId);
}
