package com.neuedu.examsys.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.Exams;
import com.neuedu.examsys.domain.Student;
import com.neuedu.examsys.service.ExamForStudentService;
import com.neuedu.examsys.service.StudentService;

/**
 * 学生端控制器，控制学生前端访问
 * @author jjd
 *
 */

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private ExamForStudentService examForStuService;
	
	@PostMapping("/info")
	@ResponseBody
	public Student getStudentInfo(String studentId) {
		return studentService.selectStudent(studentId);
	}
	
	@GetMapping("/sessioninfo")
	@ResponseBody
	public Student getSessionStudentInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return studentService.selectStudent((String)session.getAttribute("id"));
	}
	
	@PostMapping("/modifyinfo")
	@ResponseBody
	public void modifyStudentPersonalInfo(
			String studentId,
			String studentEmail,
			String studentPhone,
			String studentAddress) {
		System.out.println("Reveice modify student info rquest..., from " + studentId);
		Student s = studentService.selectStudent(studentId);
		s.setStudentEmail(studentEmail);
		s.setStudentPhone(studentPhone);
		s.setStudentAddress(studentAddress);
		studentService.updateStudent(s);
	}
	
	@GetMapping("/querycourse")
	@ResponseBody
	public Map<String, List<Exams>> queryCourse(String studentId) {
		System.out.println(examForStuService.queryExamsAfterNow(studentId));
		System.out.println(examForStuService.queryExamsBeforeNow(studentId));
		Map<String, List<Exams>> courseMap = new HashMap<String, List<Exams>>();
		courseMap.put("after", examForStuService.queryExamsAfterNow(studentId));
		courseMap.put("before", examForStuService.queryExamsBeforeNow(studentId));
		return courseMap;
	}
}
