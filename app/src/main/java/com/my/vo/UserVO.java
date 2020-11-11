package com.my.vo;

public class UserVO {
	private String userId;
	private String userPw;
	private String userName;
	private String userTel;
	private byte[] userPic;	//picture
	private long pictureSize; //picture_size
	
//	public UserVO(String userId, String userPw, String userName, String userTel, byte[] userPic, long pictureSize) {
//		super();
//		this.userId = userId;
//		this.userPw = userPw;
//		this.userName = userName;
//		this.userTel = userTel;
//		this.userPic = userPic;
//		this.pictureSize = pictureSize;
//	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public byte[] getUserPic() {
		return userPic;
	}

	public void setUserPic(byte[] userPic) {
		this.userPic = userPic;
	}

	public long getPictureSize() {
		return pictureSize;
	}

	public void setPictureSize(long pictureSize) {
		this.pictureSize = pictureSize;
	}
	
	
	
}
