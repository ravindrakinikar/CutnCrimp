package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wire_table")
public class Wire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "frequency")
	private String frequency;

	@Column(name = "h1")
	private int h1;
	@Column(name = "h2")
	private int h2;
	@Column(name = "h3")
	private int h3;
	@Column(name = "h4")
	private int h4;
	@Column(name = "h5")
	private int h5;

	@Column(name = "l1")
	private int l1;
	@Column(name = "l2")
	private int l2;
	@Column(name = "l3")
	private int l3;
	@Column(name = "l4")
	private int l4;
	@Column(name = "l5")
	private int l5;
	@Column(name = "avg_height")
	private int averageHeight;
	@Column(name = "avg_length")
	private int averageLength;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public int getH1() {
		return h1;
	}

	public void setH1(int h1) {
		this.h1 = h1;
	}

	public int getH2() {
		return h2;
	}

	public void setH2(int h2) {
		this.h2 = h2;
	}

	public int getH3() {
		return h3;
	}

	public void setH3(int h3) {
		this.h3 = h3;
	}

	public int getH4() {
		return h4;
	}

	public void setH4(int h4) {
		this.h4 = h4;
	}

	public int getH5() {
		return h5;
	}

	public void setH5(int h5) {
		this.h5 = h5;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3 = l3;
	}

	public int getL4() {
		return l4;
	}

	public void setL4(int l4) {
		this.l4 = l4;
	}

	public int getL5() {
		return l5;
	}

	public void setL5(int l5) {
		this.l5 = l5;
	}

	public int getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}

	public int getAverageLength() {
		return averageLength;
	}

	public void setAverageLength(int averageLength) {
		this.averageLength = averageLength;
	}
}
