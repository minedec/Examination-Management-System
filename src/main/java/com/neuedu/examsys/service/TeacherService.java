package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Teacher;

/**
 * 教师数据服务层
 * @author jjd
 *
 */
public interface TeacherService {
	
	/**
	 * 插入教师记录
	 * @param s 新的教师对象
	 */
	void insertTeacher(Teacher s);
	
	/**
	 * 查询所有教师
	 * @return 教师列表
	 */
	List<Teacher> queryTeacher();
	
	/**
	 * 寻找教师记录
	 * @param id 教师ID
	 * @return 教师对象
	 */
	Teacher selectTeacher(String id);
	
	/**
	 * 删除教师信息
	 * @param id 教师ID
	 */
	void deleteTeacher(String id);
	
	/**
	 * 更新教师信息
	 * @param s 教师
	 */
	void updateTeacher(Teacher s);
}
