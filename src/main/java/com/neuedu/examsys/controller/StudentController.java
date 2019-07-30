package com.neuedu.examsys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.Student;
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
	
	@PostMapping("/info")
	@ResponseBody
	public Student getStudentInfo(String studentId) {
		return studentService.selectStudent(studentId);
	}
}
