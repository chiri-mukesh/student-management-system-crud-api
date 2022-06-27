package com.rinfotek.iiserp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AnnualFees")
public class AnnualFees {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aId;

	@Column(name="Student_SR_No.", length = 5)
	private Integer studentSrNo;
	@Column(name="Fee_Type", length = 15)
	private String feeType;
	@Column(name="Fee", length = 5)
	private Integer fees;
	@Column(name="Fee_Paid", length = 5)
	private Integer feePaid;
	@Column(name="D_O_P", length = 10)
	private String dateOfPayment;
	
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
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	public Integer getFeePaid() {
		return feePaid;
	}
	public void setFeePaid(Integer feePaid) {
		this.feePaid = feePaid;
	}
	public String getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	
	@Override
	public String toString() {
		return "fId=" + getaId() + ", studentSrNo=" + getStudentSrNo() + ", feeType=" + getFeeType() 
				+ ", fees=" + getFees() + ", feePaid=" + getFeePaid() + ", dateOfPayment=" + getDateOfPayment();
	}
	
}
