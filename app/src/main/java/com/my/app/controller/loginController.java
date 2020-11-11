package com.my.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.my.app.service.IUserService;
import com.my.vo.UserVO;

@Controller
public class loginController {
	
	@Autowired
	IUserService userservice;

	@Autowired
	BCryptPasswordEncoder bpe;
	
	@PostMapping(value="/user/login.do")
	public String login(String userId, String userPw, Model model, HttpSession session) {
		String dbpw = userservice.getPassword(userId);
		System.out.println("dbpw 머냐 : "+dbpw);
		System.out.println(userPw);
		System.out.println("비교값 : "+(dbpw != null ));
		System.out.println("비교값2: "+(bpe.matches(userPw, dbpw)));
		if(dbpw != null & bpe.matches(userPw, dbpw)) {
			UserVO vo = userservice.getInfo(userId);
			session.setAttribute("user", vo);
			session.setAttribute("userid", userId);
			return "redirect:/emp";
		}else {
			model.addAttribute("message", "아이디 또는 비번이 잘못되었습니다.");
			return "user/login";
		}
	}
	
}
