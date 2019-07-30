package com.neuedu.examsys.test;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.examsys.dao.AccountMapper;
import com.neuedu.examsys.dao.AnsCollectionMapper;
import com.neuedu.examsys.domain.Account;
import com.neuedu.examsys.domain.AnsCollection;
import com.neuedu.examsys.domain.Role;

public class AccountAndAnsCollectionTest {

	public static void main(String[] args) throws Exception{
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		AccountMapper sm = session.getMapper(AccountMapper.class);
//		AnsCollectionMapper am = session.getMapper(AnsCollectionMapper.class);
//		Student s = new Student();
//		List<Student> ss = new ArrayList<>();
//		s.setStudentId("SE1173710226");
//		s.setStudentEmail("123@123.com");
//		s.setStudentMajor("radio");
//		s.setStudentAcademy("computer");
//		s.setStudentName("何");
//		s.setStudentPhone("123456789");
//		s.setStudentSex("male");
//		s.setStudentClass("1737102");
//		s.setStudentAddress("江夏");
//		s.setStudentNation("汉");
//		s.setStudentIdentity("12010419981027");
		//System.out.println(sm.queryAccountById("1"));
		//System.out.println(sm.queryAccountByRole(Role.TEACHER));
		//sm.deleteAccount("10");
//		Account a = new Account();
//		a.setId("11");
//		a.setPwd("");
//		a.setRole(Role.TEACHER);
//		try {
//			sm.insertAccount(a);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		sm.modifyAccountPwdById("11", "110");
		sm.modifyAccountRoleById("11", Role.STUDENT);
//		AnsCollection ac = new AnsCollection();
//		ac.setStudentId("1");
//		ac.setExamId(3);
//		ac.setPaperId(3);
//		ac.setPaperId(3);
//		ac.setQuestionId(3);
//		ac.setScore(5);
//		ac.setOption("A");
//		ac.setIsCorrect("true");
//		ac.setDateTime("2019-12-30 10:20:15");
//		//am.insertAns(ac);
//		System.out.println(am.queryScores(ac));
		
		session.commit();
		session.close();
	}

}
