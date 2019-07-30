package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Student;

/**
 * 学生数据服务层
 * @author jjd
 *
 */
public interface StudentService {
	
	/**
	 * 插入学生记录
	 * @param s 新的学生对象
	 */
	void insertStudent(Student s);
	
	/**
	 * 查询所有学生
	 * @return 学生列表
	 */
	List<Student> queryStudent();
	
	/**
	 * 寻找学生记录
	 * @param id 学生ID
	 * @return 学生对象
	 */
	Student selectStudent(String id);
	
	/**
	 * 删除学生信息
	 * @param id 学生ID
	 */
	void deleteStudent(String id);
	
	/**
	 * 更新学生信息
	 * @param s 学生
	 */
	void updateStudent(Student s);
}
