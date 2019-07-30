package com.neuedu.examsys.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登陆拦截器，拦截未登录用户访问其他资源的请求，同时也拦截不匹配角色
 * 访问非匹配资源的请求，比如说学生访问老师的网页
 * @author jjd
 * @date 2019/7/29 16:28
 *
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	/**
	 * 在请求处理之前进行拦截
	 * 拦截以 administrator，student，teacher开头的网址
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*
		 * 拦截以上述开头的网址，判断是否登陆且角色是否匹配，不匹配返回
		 */
		System.out.println(request.getRequestURI());
//		HttpSession session = request.getSession();
//		String userId = (String) session.getAttribute("id");
//		String url = request.getRequestURI();
//		if (url.equals("/exsys/login_test.html")) {
//			return true;
//		}
//		//若用户ID为空，表名没有登陆，返回login页
//		if (userId == null) {
//			response.sendRedirect("login_test.html");
//			return false;
//		}
//		
//		
//		System.out.println(url);
//		System.out.println(session);
//		//判断所要访问界面是否符合角色权限，不符合返回login界面
//		if (url.contains("student") && !((String)session.getAttribute("role")).equals("STUDENT")) {
//			System.out.println("Detected illegal access to student");
//			response.sendRedirect("login.html");
//			return false;
//		} else if (url.contains("teacher") && !((String)session.getAttribute("role")).equals("TEACHER")) {
//			System.out.println("Detected illegal access to teacher");
//			response.sendRedirect("login.html");
//			return false;
//		} else if (url.contains("administrator") && !((String)session.getAttribute("role")).equals("ADMINISTRATOR")) {
//			System.out.println("Detected illegal access to administrator");
//			response.sendRedirect("login.html");
//			return false;
//		}
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
}
