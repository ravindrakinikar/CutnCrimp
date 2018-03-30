package com.cnc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lead_actuals1_tbl")
public class LeadActualsOne {

	@Id
	@Column(name = "la1_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laOneNo;
	@Column(name = "lf_no")
	private int lfNo;
	@Column(name = "crimp_height_1")
	private String crimpHeight1;
	@Column(name = "crimp_height_2")
	private String crimpHeight2;
	@Column(name = "crimp_height_3")
	private String crimpHeight3;
	@Column(name = "crimp_height_4")
	private String crimpHeight4;
	@Column(name = "crimp_height_5")
	private String crimpHeight5;
	@Column(name = "wire_length_1")
	private String wireLength1;
	@Column(name = "wire_length_2")
	private String wireLength2;
	@Column(name = "wire_length_3")
	private String wireLength3;
	@Column(name = "wire_length_4")
	private String wireLength4;
	@Column(name = "wire_length_5")
	private String wireLength5;

	public LeadActualsOne() {

	}

	public LeadActualsOne(int laOneNo, int lfNo, String crimpHeight1,
			String crimpHeight2, String crimpHeight3, String crimpHeight4,
			String crimpHeight5, String wireLength1, String wireLength2,
			String wireLength3, String wireLength4, String wireLength5) {
		super();
		this.laOneNo = laOneNo;
		this.lfNo = lfNo;
		this.crimpHeight1 = crimpHeight1;
		this.crimpHeight2 = crimpHeight2;
		this.crimpHeight3 = crimpHeight3;
		this.crimpHeight4 = crimpHeight4;
		this.crimpHeight5 = crimpHeight5;
		this.wireLength1 = wireLength1;
		this.wireLength2 = wireLength2;
		this.wireLength3 = wireLength3;
		this.wireLength4 = wireLength4;
		this.wireLength5 = wireLength5;
	}

	public int getLaOneNo() {
		return laOneNo;
	}

	public void setLaOneNo(int laOneNo) {
		this.laOneNo = laOneNo;
	}

	public int getLfNo() {
		return lfNo;
	}

	public void setLfNo(int lfNo) {
		this.lfNo = lfNo;
	}

	public String getCrimpHeight1() {
		return crimpHeight1;
	}

	public void setCrimpHeight1(String crimpHeight1) {
		this.crimpHeight1 = crimpHeight1;
	}

	public String getCrimpHeight2() {
		return crimpHeight2;
	}

	public void setCrimpHeight2(String crimpHeight2) {
		this.crimpHeight2 = crimpHeight2;
	}

	public String getCrimpHeight3() {
		return crimpHeight3;
	}

	public void setCrimpHeight3(String crimpHeight3) {
		this.crimpHeight3 = crimpHeight3;
	}

	public String getCrimpHeight4() {
		return crimpHeight4;
	}

	public void setCrimpHeight4(String crimpHeight4) {
		this.crimpHeight4 = crimpHeight4;
	}

	public String getCrimpHeight5() {
		return crimpHeight5;
	}

	public void setCrimpHeight5(String crimpHeight5) {
		this.crimpHeight5 = crimpHeight5;
	}

	public String getWireLength1() {
		return wireLength1;
	}

	public void setWireLength1(String wireLength1) {
		this.wireLength1 = wireLength1;
	}

	public String getWireLength2() {
		return wireLength2;
	}

	public void setWireLength2(String wireLength2) {
		this.wireLength2 = wireLength2;
	}

	public String getWireLength3() {
		return wireLength3;
	}

	public void setWireLength3(String wireLength3) {
		this.wireLength3 = wireLength3;
	}

	public String getWireLength4() {
		return wireLength4;
	}

	public void setWireLength4(String wireLength4) {
		this.wireLength4 = wireLength4;
	}

	public String getWireLength5() {
		return wireLength5;
	}

	public void setWireLength5(String wireLength5) {
		this.wireLength5 = wireLength5;
	}

}
