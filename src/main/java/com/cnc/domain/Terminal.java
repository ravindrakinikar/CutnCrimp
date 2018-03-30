package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "terminal_tbl")
public class Terminal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "terminal_no")
	private int terminalId;
	@Column(name = "terminal_name")
	private String terminalName;

	public Terminal() {

	}

	public Terminal(int terminalId, String terminalName) {
		super();
		this.terminalId = terminalId;
		this.terminalName = terminalName;
	}

	public int getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

}
