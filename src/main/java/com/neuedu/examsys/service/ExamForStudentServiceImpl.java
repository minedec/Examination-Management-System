package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.ExamForStudentMapper;
import com.neuedu.examsys.domain.Exams;

@Service
public class ExamForStudentServiceImpl implements ExamForStudentService {

	@Autowired
	private ExamForStudentMapper efsm;
	
	@Override
	public List<Exams> queryExamsAfterNow(String studentId) {
		return efsm.queryExamsAfterNow(studentId);
	}

	@Override
	public List<Exams> queryExamsBeforeNow(String studentId) {
		return efsm.queryExamsBeforeNow(studentId);
	}

}
