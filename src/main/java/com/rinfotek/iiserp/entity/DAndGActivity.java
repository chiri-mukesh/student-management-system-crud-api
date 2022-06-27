package com.rinfotek.iiserp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dg_activity")
public class DAndGActivity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dId;
	@Column(name = "Student_SR_No.", length = 5)
	private Integer studentSrNo;

	@Column(name = "Activity_Type", length = 15)
	private String activityType;

	@Column(name = "Description", length =15 )
	private String description;

	@Column(name = "Date", length = 10)
	private String date;

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public Integer getStudentSrNo() {
		return studentSrNo;
	}

	public void setStudentSrNo(Integer studentSrNo) {
		this.studentSrNo = studentSrNo;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "studentSrNo=" + getStudentSrNo() + ", activityType=" + getActivityType() + ", description="
				+ getDescription() + ", date=" + getDate();
	}

	
	
}
