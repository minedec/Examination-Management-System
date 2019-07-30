package com.neuedu.examsys.domain;

//用来描述学生考试的类，包含分数，状态，结果等		7.30 10:20 zjy

public class Exam_Collection {
	private Integer Id;
	private String studentId;
	private Integer paperId;
	private Integer courseId;
	private Integer examId;
	private Integer score;
	private Status status;
	private Result result;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Integer getPaperId() {
		return paperId;
	}
	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getExamId() {
		return examId;
	}
	public void setExamId(Integer examId) {
		this.examId = examId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Exam_Collection [Id=" + Id + ", studentId=" + studentId + ", paperId=" + paperId + ", courseId="
				+ courseId + ", examId=" + examId + ", score=" + score + ", status=" + status + ", result=" + result
				+ "]";
	}
	public Exam_Collection(Integer id, String studentId, Integer paperId, Integer courseId, Integer examId,
			Integer score, Status status, Result result) {
		super();
		Id = id;
		this.studentId = studentId;
		this.paperId = paperId;
		this.courseId = courseId;
		this.examId = examId;
		this.score = score;
		this.status = status;
		this.result = result;
	}
	public Exam_Collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
