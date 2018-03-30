package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shift_tbl")
public class Shift {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shift_no")
	private int shiftNo;

	@Column(name = "shift_desc")
	private String shiftDescription;

	public int getShiftNo() {
		return shiftNo;
	}

	public void setShiftNo(int shiftNo) {
		this.shiftNo = shiftNo;
	}

	public String getShiftDescription() {
		return shiftDescription;
	}

	public void setShiftDescription(String shiftDescription) {
		this.shiftDescription = shiftDescription;
	}

	

}
