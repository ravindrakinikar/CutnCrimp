package com.cnc.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_shift_tbl")
public class EmployeeShift {

	@Id
	@Column(name = "es_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int esNo;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "emp_no")
	private int empNo;

	@Column(name = "shift_no")
	private int shiftNo;

	public int getEsNo() {
		return esNo;
	}

	public void setEsNo(int esNo) {
		this.esNo = esNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getShiftNo() {
		return shiftNo;
	}

	public void setShiftNo(int shiftNo) {
		this.shiftNo = shiftNo;
	}

	public EmployeeShift() {

	}

	public EmployeeShift(int esNo, Date startDate, Date endDate, int empNo,
			int shiftNo) {
		super();
		this.esNo = esNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.empNo = empNo;
		this.shiftNo = shiftNo;
	}

}
