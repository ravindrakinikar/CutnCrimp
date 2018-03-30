package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead_factory_tbl")
public class LeadFactory {

	@Id
	@Column(name = "lf_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lfNo;

	@Column(name = "es_no")
	private int esNo;

	@Column(name = "lead_no")
	private int leadNo;

	@Column(name = "fo_no")
	private int foNo;

	@Column(name = "batch_no")
	private int batchNo;

	@Column(name = "side_type")
	private String sideType;

	@Column(name = "machine_no")
	private int machineNo;

	@Column(name = "cut_quantity")
	private int cutQuantity;

	@Column(name = "status")
	private String status;

	public LeadFactory() {

	}

	public LeadFactory(int lfNo, int esNo, int leadNo, int foNo, int batchNo,
			String sideType, int machineNo, int cutQuantity, String status) {
		super();
		this.lfNo = lfNo;
		this.esNo = esNo;
		this.leadNo = leadNo;
		this.foNo = foNo;
		this.batchNo = batchNo;
		this.sideType = sideType;
		this.machineNo = machineNo;
		this.cutQuantity = cutQuantity;
		this.status = status;
	}

	public int getLfNo() {
		return lfNo;
	}

	public void setLfNo(int lfNo) {
		this.lfNo = lfNo;
	}

	public int getEsNo() {
		return esNo;
	}

	public void setEsNo(int esNo) {
		this.esNo = esNo;
	}

	public int getLeadNo() {
		return leadNo;
	}

	public void setLeadNo(int leadNo) {
		this.leadNo = leadNo;
	}

	public int getFoNo() {
		return foNo;
	}

	public void setFoNo(int foNo) {
		this.foNo = foNo;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public String getSideType() {
		return sideType;
	}

	public void setSideType(String sideType) {
		this.sideType = sideType;
	}

	public int getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(int machineNo) {
		this.machineNo = machineNo;
	}

	public int getCutQuantity() {
		return cutQuantity;
	}

	public void setCutQuantity(int cutQuantity) {
		this.cutQuantity = cutQuantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
