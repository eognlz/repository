package com.my.app.controller;

import java.io.IOException;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.my.app.service.IUserService;
import com.my.app.service.UserService;
import com.my.vo.UserVO;

import oracle.jdbc.proxy.annotation.Methods;
import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	IUserService userservice;

	@GetMapping(value="/login")
	public void userlogin() {}

//	@RequestMapping(value="/login.do")
//	public String login(@ModelAttribute("vo") @Valid UserVO vo, 
//			@RequestParam MultipartFile file, Model model, String userId, String userPw) {
////		System.out.println("로그인 됫나?11111");
////		if(userservice.getIdCheck(userId) == true) {
////			if(userservice.getPassword(userId)) {
////				model.addAttribute("mypage",userservice.getInfo(userId));
////				System.out.println("로그인 됫나?22222");
////			}
////		}
//		return "user/mypage";
//	}
	
	
	
	@GetMapping(value="/join")
	public void userJoin() {}

	@PostMapping(value="/join")//RedirectAttributes 유효성 검증 위해 필요
	public String insertUser(@RequestParam MultipartFile file, UserVO vo, RedirectAttributes redirectAttributes) { 
		if(file != null & !file.isEmpty()) {
			try {
				vo.setUserPic(file.getBytes());
				vo.setPictureSize(file.getSize());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		userservice.inserJoin(vo);
		redirectAttributes.addAttribute("message","회원가입 완료");
		return "redirect:/user/login";
	}

	@PostMapping(value="/usercheck")
	@ResponseBody
	public String usercheck(String userId) {
		System.out.println("유저아이디: "+userId);
		return userservice.getUserCheck(userId)==0? "true" : null;
	}


}
