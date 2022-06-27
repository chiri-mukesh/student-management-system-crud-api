package com.rinfotek.iiserp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam_Details")
public class Exam {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer eId;
	@Column(name="Student_SR_No.", length = 5)
	private Integer studentSrNo;
	@Column(name="Exam_Type" ,length = 15)
	private String examType;
	@Column(name="Subject", length = 10)
	private String subject;
	@Column(name="Max_Marks", length = 3)
	private Integer maxMarks;
	@Column(name="Obtain_Marks", length = 3)
	private Integer obtainMarks;
	
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public Integer getStudentSrNo() {
		return studentSrNo;
	}
	public void setStudentSrNo(Integer studentSrNo) {
		this.studentSrNo = studentSrNo;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(Integer maxMarks) {
		this.maxMarks = maxMarks;
	}
	public Integer getObtainMarks() {
		return obtainMarks;
	}
	public void setObtainMarks(Integer obtainMarks) {
		this.obtainMarks = obtainMarks;
	}
	@Override
	public String toString() {
		return "eId=" + geteId() + ", studentSrNo=" + getStudentSrNo() + ", examType=" + getExamType() + ", subject=" + getSubject()
				+ ", maxMarks=" + getMaxMarks() + ", obtainMarks=" + getObtainMarks() ;
	}
	
	


}
