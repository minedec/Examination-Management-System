package com.neuedu.examsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.Course;
import com.neuedu.examsys.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/getname")
	@ResponseBody
	public String queryCourseName(String id) {
		List<Course> cl = courseService.selectCourse(id);
		if (!cl.isEmpty()) {
			return cl.get(0).getCourseName();
		}
		return null;
	}
	
}