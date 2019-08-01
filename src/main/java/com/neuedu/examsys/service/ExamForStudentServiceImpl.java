package com.neuedu.examsys.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

	@Override
	public int queryExanDuration(int examId) {
		return efsm.queryExanDuration(examId);
	}

	@Override
	public Exams queryExamById(int examId) {
		return efsm.queryExamById(examId);
	}

	@Override
	public boolean checkInTheTimeZone(int examId) {
		Exams ex = efsm.queryExamById(examId);
		Date startDate = new Date();   
		Date endDate = new Date();
		Date now = new Date();
        //注意format的格式要与日期String的格式相匹配   
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
        try {   
            startDate = sdf.parse(ex.getExamDatetime());
            endDate = sdf.parse(ex.getExamEndtime());
            if ((now.compareTo(startDate) == 0 || now.after(startDate))
            		&& now.before(endDate)) {
            	return true;
            }
        } catch (Exception e) {   
            e.printStackTrace();   
        }  
		return false;
	}
	
	

}
