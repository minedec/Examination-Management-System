package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.ExamForAdminMapper;
import com.neuedu.examsys.domain.Exams;

@Service
public class ExamForAdminServiceImpl implements ExamForAdminService {
	
	@Autowired
	private ExamForAdminMapper EFA;
	
	@Override
	public List<Exams> selectAllExam() {
		return EFA.selectAllExam();
	}

	@Override
	public void insertExam(Exams e) {
		// TODO Auto-generated method stub
		EFA.insertExam(e);
	}

	@Override
	public void deleteExam(Integer id) {
		// TODO Auto-generated method stub
		EFA.deleteExam(id);
	}

	@Override
	public void updateExam(Exams e) {
		// TODO Auto-generated method stub
		EFA.updateExam(e);
	}

	@Override
	public List<Exams> selectExam(Integer id) {
		// TODO Auto-generated method stub
		return EFA.selectExam(id);
	}

}
