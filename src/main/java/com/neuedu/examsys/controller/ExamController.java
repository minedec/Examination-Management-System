package com.neuedu.examsys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.Exams;
import com.neuedu.examsys.service.ExamForStudentService;

/**
 * 
 * @author jjd
 *
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
	
	@Autowired
	private ExamForStudentService examForStuService;
	
	@GetMapping("/checkTime")
	@ResponseBody
	public boolean getStudentInfo(HttpServletRequest request, int examId) {
		if (examForStuService.checkInTheTimeZone(examId)) {
			request.getSession().setAttribute("examId", examId);
			return true;
		} else {
			return false;
		}
	}
	
	@GetMapping("/info")
	@ResponseBody
	public Exams getSessionExamsInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("examId") == null) {
			return null;
		}
		return examForStuService.queryExamById((int)session.getAttribute("examId"));
	}
	
}
