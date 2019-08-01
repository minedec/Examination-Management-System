package com.neuedu.examsys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neuedu.examsys.domain.AnsCollection;
import com.neuedu.examsys.domain.Exams;
import com.neuedu.examsys.domain.Question;
import com.neuedu.examsys.domain.QuestionType;
import com.neuedu.examsys.service.AnsCollectionService;
import com.neuedu.examsys.service.ExamForStudentService;
import com.neuedu.examsys.service.PaperQuestionService;

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
	@Autowired
	private PaperQuestionService pqService;
	@Autowired
	private AnsCollectionService acService;
	
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
	
	@GetMapping("/sessioninfo")
	@ResponseBody
	public Exams getSessionExamsInfo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("examId") == null) {
			return null;
		}
		return examForStuService.queryExamById((int)session.getAttribute("examId"));
	}
	
	@GetMapping("/questions")
	@ResponseBody
	public List<Question> getPaperQuestions(HttpServletRequest request, Integer paperId) {
		List<Question> ql = pqService.queryQuestions(paperId);
		if(ql.isEmpty()) {
			return null;
		}
		List<Question> tmp = new ArrayList<Question>();
		int single = 0;
		int multi = 0;
		int judge = 0;
		int fill = 0;
		int topic = 0;
		for(Question q : ql) {
			if(q.getType().equals(QuestionType.SINGLE)) {
				tmp.add(single, q);
				single++;
			} else if(q.getType().equals(QuestionType.MULTIPLE)) {
				tmp.add(single+multi, q);
				multi++;
			} else if(q.getType().equals(QuestionType.JUDGE)) {
				tmp.add(single+multi+judge, q);
				judge++;
			} else if(q.getType().equals(QuestionType.FILL)) {
				tmp.add(single+multi+judge+fill, q);
				fill++;
			} else if(q.getType().equals(QuestionType.TOPIC)) {
				tmp.add(single+multi+judge+fill+topic, q);
				topic++;
			}
		}
		return tmp;
	}
	
	@PostMapping("/insertans")
	@ResponseBody
	public boolean insertAns(@RequestBody List<AnsCollection> anslist) {
		for(AnsCollection a : anslist) {
			acService.insertAns(a);
		}
		return true;
	}
	
}
