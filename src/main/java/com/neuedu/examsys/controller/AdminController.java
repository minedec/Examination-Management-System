package com.neuedu.examsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.Exams;
import com.neuedu.examsys.domain.Student;
import com.neuedu.examsys.domain.Teacher;
import com.neuedu.examsys.service.ExamForAdminService;
import com.neuedu.examsys.service.StudentService;
import com.neuedu.examsys.service.TeacherService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private ExamForAdminService EFA;
	
	@PostMapping(value = "/addstudent")
	@ResponseBody	
	public String addStudent(@RequestBody Student s){
		if(s.getStudentSex().equals("male")) s.setStudentSex("male");
		if(s.getStudentSex().equals("female")) s.setStudentSex("female");
		studentService.insertStudent(s);
		return "";
	}
	@PostMapping(value = "/addteacher")
	@ResponseBody	
	public String addTeacher(@RequestBody Teacher t){
		if(t.getTeacherSex().equals("male")) t.setTeacherSex("male");
		if(t.getTeacherSex().equals("female")) t.setTeacherSex("female");
		teacherService.insertTeacher(t);
		return "";
	}
	@RequestMapping(value="/exam/selectAll")
	@ResponseBody
	public List<Exams> selectAllExam(){
		List<Exams> ee = EFA.selectAllExam();
		return ee;
	}
	@PostMapping(value = "/exam/addexam")
	@ResponseBody	
	public void addExam(@RequestBody Exams e){
		EFA.insertExam(e);
	}
}
