package com.neuedu.examsys.domain;

//课程类，用于查看学分专业等信息  7.30 9:20 zjy

public class Course {
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseId, String courseName, String courseMajor, String courseAcademy, float courseCredit) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseMajor = courseMajor;
		this.courseAcademy = courseAcademy;
		this.courseCredit = courseCredit;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseMajor() {
		return courseMajor;
	}
	public void setCourseMajor(String courseMajor) {
		this.courseMajor = courseMajor;
	}
	public String getCourseAcademy() {
		return courseAcademy;
	}
	public void setCourseAcademy(String courseAcademy) {
		this.courseAcademy = courseAcademy;
	}
	public float getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(float courseCredit) {
		this.courseCredit = courseCredit;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseMajor=" + courseMajor
				+ ", courseAcademy=" + courseAcademy + ", courseCredit=" + courseCredit + "]";
	}
	private String courseId;
	private String courseName;
	private String courseMajor;
	private String courseAcademy;
	private float courseCredit;
}
