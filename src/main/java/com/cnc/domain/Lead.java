package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "lead_tbl")
public class Lead {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(View.Lead.class)
	@Column(name = "lead_no")
	private int id;

	@Column(name = "gauge")
	@JsonView(View.Lead.class)
	private String gauge;
	
	@Column(name = "side_type")
	@JsonView(View.Lead.class)
	private String side_type;
	
	@Column(name = "color")
	@JsonView(View.Lead.class)
	private String color;
	
	@Column(name = "strands")
	@JsonView(View.Lead.class)
	private String strands;
	
	@Column(name = "strip_length")
	@JsonView(View.Lead.class)
	private String strip_length;
	
	@Column(name = "crimp_height")
	@JsonView(View.Lead.class)
	private String crimp_height;
	
	@Column(name = "crimp_width")
	@JsonView(View.Lead.class)
	private String crimp_width;
	
	@Column(name = "wire_length")
	@JsonView(View.Lead.class)
	private String wire_length;
	
	@Column(name = "pull_force")
	@JsonView(View.Lead.class)
	private String pull_force;
	
	@Column(name = "coro_dia")
	@JsonView(View.Lead.class)
	private String coro_dia;
	
	@Column(name = "wayback")
	@JsonView(View.Lead.class)
	private String wayback;
	
	@Column(name = "terminal_no")
	@JsonView(View.Lead.class)
	private int factoryNumber;
	
	@Column(name = "batch_no")
	@JsonView(View.Lead.class)
	private int batchNumber;
	
	@ManyToOne
	@JoinColumn(name="model_no")
	private Model model;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getGauge() {
		return gauge;
	}

	public void setGauge(String gauge) {
		this.gauge = gauge;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	public String getSide_type() {
		return side_type;
	}

	public void setSide_type(String side_type) {
		this.side_type = side_type;
	}

	public String getStrands() {
		return strands;
	}

	public void setStrands(String strands) {
		this.strands = strands;
	}

	public String getStrip_length() {
		return strip_length;
	}

	public void setStrip_length(String strip_length) {
		this.strip_length = strip_length;
	}

	public String getCrimp_height() {
		return crimp_height;
	}

	public void setCrimp_height(String crimp_height) {
		this.crimp_height = crimp_height;
	}

	public String getCrimp_width() {
		return crimp_width;
	}

	public void setCrimp_width(String crimp_width) {
		this.crimp_width = crimp_width;
	}

	public String getWire_length() {
		return wire_length;
	}

	public void setWire_length(String wire_length) {
		this.wire_length = wire_length;
	}

	public String getPull_force() {
		return pull_force;
	}

	public void setPull_force(String pull_force) {
		this.pull_force = pull_force;
	}

	public String getCoro_dia() {
		return coro_dia;
	}

	public void setCoro_dia(String coro_dia) {
		this.coro_dia = coro_dia;
	}

	public String getWayback() {
		return wayback;
	}

	public void setWayback(String wayback) {
		this.wayback = wayback;
	}

	public int getFactoryNumber() {
		return factoryNumber;
	}

	public void setFactoryNumber(int factoryNumber) {
		this.factoryNumber = factoryNumber;
	}

	public int getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(int batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	

}
