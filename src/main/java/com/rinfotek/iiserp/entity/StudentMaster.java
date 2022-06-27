package com.rinfotek.iiserp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Student_Master")
public class StudentMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer sId;// id same

	@Column(name = "SR_No.", length = 5)
//	@Size(min = 3, max = 5)
	private Integer srNo;

	@Column(name = "Roll_No", length = 10)
	private Integer rollNo;

	@Column(name = "Name", length = 25)
	private String name;

	@Column(name = "Current_Class", length = 8)
	private String currentClass;

	@Column(name = "Section", length = 5)
	private String section;

	@Column(name = "Session", length = 8)
	private String session;

//	@OneToMany(targetEntity = Exam.class, cascade = CascadeType.ALL)//when one entity
	@OneToMany( cascade = CascadeType.ALL)//when multipule entity
	@JoinColumn(name = "sid_fk", referencedColumnName = "id")
	private List<Fee> fees;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid_fk", referencedColumnName = "id")
	private List<AnnualFees> annualfees;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid_fk", referencedColumnName = "id")
	private List<Attendance> attendances;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid_fk", referencedColumnName = "id")
	private List<DAndGActivity> activitys;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid_fk", referencedColumnName = "id")
	private List<Exam> exams;
//	private List<AnnualFees> annualfees;
//	private List<Attendance> attendances;
//	private List<DAndGActivity> activitys;
//	private List<Exam> exams;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public List<Fee> getFees() {
		return fees;
	}

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}
	

	public List<AnnualFees> getAnnualfees() {
		return annualfees;
	}

	public void setAnnualfees(List<AnnualFees> annualfees) {
		this.annualfees = annualfees;
	}

	public List<Attendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}

	public List<DAndGActivity> getActivitys() {
		return activitys;
	}

	public void setActivitys(List<DAndGActivity> activitys) {
		this.activitys = activitys;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	
	@Override
	public String toString() {
		return "sId=" + getsId() + ", srNo=" + getSrNo() + ", rollNo=" + getRollNo() + ", name=" + getName()
				+ ", currentClass=" + getCurrentClass() + ", section=" + getSection() + ", session=" + getSession()
				+ ", fees=" + getFees() +"annual fees="+getAnnualfees()+"attendances="+getAttendances()+"activitys="+getActivitys()+"exam="+ getExams();
	}

	

}
