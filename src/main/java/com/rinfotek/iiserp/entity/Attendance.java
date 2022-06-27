package com.rinfotek.iiserp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Attendance")
public class Attendance  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aId;
	
	@Column(name="Student_SR_No.", length = 5)
	private Integer studentSrNo;
	
	@Column(name="Month_Year", length = 10)
	private String monthYr;
	
	@Column(name="Total_Classes_Held", length = 3)
	private Integer totalClassesHeld;
	
	@Column(name="Class_Attend", length = 3)
	private Integer classAttend;
	
	@Column(name="Approved_Leaves", length = 3)
	private Integer approvedLeaves;
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public Integer getStudentSrNo() {
		return studentSrNo;
	}
	public void setStudentSrNo(Integer studentSrNo) {
		this.studentSrNo = studentSrNo;
	}
	public String getMonthYr() {
		return monthYr;
	}
	public void setMonthYr(String monthYr) {
		this.monthYr = monthYr;
	}
	public Integer getTotalClassesHeld() {
		return totalClassesHeld;
	}
	public void setTotalClassesHeld(Integer totalClassesHeld) {
		this.totalClassesHeld = totalClassesHeld;
	}
	public Integer getClassAttend() {
		return classAttend;
	}
	public void setClassAttend(Integer classAttend) {
		this.classAttend = classAttend;
	}
	public Integer getApprovedLeaves() {
		return approvedLeaves;
	}
	public void setApprovedLeaves(Integer approvedLeaves) {
		this.approvedLeaves = approvedLeaves;
	}
	@Override
	public String toString() {
		return "aId=" + getaId() + ", studentSrNo=" + getStudentSrNo() + ", monthYr=" + getMonthYr()
				+ ", totalClassesHeld=" + getTotalClassesHeld() + ", classAttend=" + getClassAttend() + ", approvedLeaves="
				+ getApprovedLeaves();
	}
	
	

}
