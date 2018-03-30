package com.cnc.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="model_tbl")
public class Model {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonView(View.Model.class)
	@Column(name="model_no")
	private int id;
	
	@Column(name="model_name")
	@JsonView(View.Model.class)
	private String name;
	
	@Column(name="model_desc")
	@JsonView(View.Model.class)
	private String desc;
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@OneToMany(mappedBy="model",cascade=CascadeType.ALL)
	@JsonView(View.Lead.class)
	private List<Lead> lead;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Lead> getLead() {
		return lead;
	}

	public void setLead(List<Lead> lead) {
		this.lead = lead;
	}

	
	
	
	
	
}
