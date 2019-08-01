package com.neuedu.examsys.controller;
import java.sql.Timestamp;
/*import java.sql.Date;*/
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.Option;
import com.neuedu.examsys.domain.Question;
import com.neuedu.examsys.service.OptionService;
import com.neuedu.examsys.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {

	private Question q = new Question();
	
	@Autowired
	private QuestionService qservice;
	@Autowired
	private OptionService oservice;
	
	@RequestMapping(value = "/insert")
	@ResponseBody
	public String insertQuestion(@RequestBody Question question){
		
		Timestamp t = new Timestamp (new Date ().getTime());
		/*QuestionType qt = null;
		Difficulty df = null;
		
		Question q = new Question(1,"终于成功了",qt.SINGLE, 5,"微积分",df.EASY, "数学",t,"yRXX");*/
		question.setDatetime(t);
		System.out.println(question.toString());
		qservice.insert(question);
		System.out.println(qservice.queryId(question));
		q.setQuestionId(qservice.queryId(question));
		return "teacher_questionbase_test.html";
	}
	
	@RequestMapping(value = "/selectAll")
	@ResponseBody
	public List<Question> selectQuestion(){
		System.out.println("get");
		return qservice.select();
	}
	
	@RequestMapping(value = "/insertOption")
	@ResponseBody
	public String insertOption(@RequestBody Option option){
		System.out.println("insert option");
		option.setOptionId(q.getQuestionId());
		oservice.insertOption(option);
		return "teacher_questionbase_test.html";
	}
	
	@RequestMapping("/options")
	@ResponseBody
	public List<Option> queryOptionByQuestionId(int questionId) {
		return oservice.selectOptionByquestionId(questionId);
	}
	
	@GetMapping("/getoption")
	@ResponseBody
	public Option queryOptionByOptionId(Integer optionId) {
		return oservice.selectOptionByOptionId(optionId);
	}
	
	
}
