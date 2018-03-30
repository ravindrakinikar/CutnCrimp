package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "machine_tbl")
public class Machine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "machine_no")
	private int machineNo;

	@Column(name = "machine_name")
	private String machineName;

	public Machine() {

	}

	public Machine(int machineNo, String machineName) {
		super();
		this.machineNo = machineNo;
		this.machineName = machineName;
	}

	public int getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(int machineNo) {
		this.machineNo = machineNo;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

}
