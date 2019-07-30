package com.neuedu.examsys.controller;
/*import java.sql.Date;*/
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.sql.Timestamp;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.examsys.dao.*;
import com.neuedu.examsys.domain.Difficulty;
import com.neuedu.examsys.domain.Question;
import com.neuedu.examsys.domain.QuestionType;
import com.neuedu.examsys.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService qservice;
	
	
	@RequestMapping(value = "/insert")
	public String insertQuestion(Question question){
		
		Timestamp t = new Timestamp (new Date ().getTime());
		QuestionType qt = null;
		Difficulty df = null;
		
		Question q = new Question(1,"试一试",qt.SINGLE, 5,"微积分",df.EASY, "数学",t,"yRXX");
		
		qservice.insert(q);
		return "../success.html";
	}
	
	@RequestMapping(value = "/selectAll")
	public List<Question> selectQuestion(){
		return qservice.select();
	}
	
}
