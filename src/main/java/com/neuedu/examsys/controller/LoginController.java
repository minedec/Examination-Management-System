package com.neuedu.examsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	@ResponseBody
	public String login(String accountId, String accountPwd) {
		System.out.println("controller receive:" + accountId);
		try {
			if(loginService.getRole(accountId, accountPwd) == null) {	
				return "false";
			} else {
				return "true";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "false";
	}
}
