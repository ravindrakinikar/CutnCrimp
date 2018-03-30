package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead_actuals2_tbl")
public class LeadActualsTwo {

	@Id
	@Column(name = "la2_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laTwoNo;
	@Column(name = "lf_no")
	private int lfNo;
	@Column(name = "strip_length")
	private String stripLength;
	@Column(name = "crimp_width")
	private String crimpWidth;
	@Column(name = "pull_force")
	private String pullForce;
	@Column(name = "appearance")
	private String appearance;

	public LeadActualsTwo() {

	}

	public LeadActualsTwo(int laTwoNo, int lfNo, String stripLength,
			String crimpWidth, String pullForce, String appearance) {
		super();
		this.laTwoNo = laTwoNo;
		this.lfNo = lfNo;
		this.stripLength = stripLength;
		this.crimpWidth = crimpWidth;
		this.pullForce = pullForce;
		this.appearance = appearance;
	}

	public int getLaTwoNo() {
		return laTwoNo;
	}

	public void setLaTwoNo(int laTwoNo) {
		this.laTwoNo = laTwoNo;
	}

	public int getLfNo() {
		return lfNo;
	}

	public void setLfNo(int lfNo) {
		this.lfNo = lfNo;
	}

	public String getStripLength() {
		return stripLength;
	}

	public void setStripLength(String stripLength) {
		this.stripLength = stripLength;
	}

	public String getCrimpWidth() {
		return crimpWidth;
	}

	public void setCrimpWidth(String crimpWidth) {
		this.crimpWidth = crimpWidth;
	}

	public String getPullForce() {
		return pullForce;
	}

	public void setPullForce(String pullForce) {
		this.pullForce = pullForce;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

}
