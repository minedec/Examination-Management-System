package com.neuedu.examsys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.Student;
import com.neuedu.examsys.service.LoginService;
import com.neuedu.examsys.service.StudentService;

/**
 * 登陆控制器，负责登陆和信息请求等任务
 * 包括了登陆账号判定，前端请求Session中保存的ID等
 * @author jjd
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request, String accountId, String accountPwd) {
		System.out.println("controller receive:" + accountId);
		try {
			
			if(loginService.getRole(accountId, accountPwd) == null) {	
				return "false";
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("id", accountId);
				session.setAttribute("role", loginService.getRole(accountId, accountPwd).name());
				return "true";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "false";
	}
	
	@GetMapping("/session")
	@ResponseBody
	public String getSession(HttpServletRequest request) {
		System.out.println("Received get session requset, from " + request.getSession().getAttribute("id"));
		HttpSession session = request.getSession();
		return (String)session.getAttribute("id");
	}
	
}
