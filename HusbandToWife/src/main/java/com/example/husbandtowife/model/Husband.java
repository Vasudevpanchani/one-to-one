package com.example.husbandtowife.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "husband_table")
public class Husband {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "h_id")
	private long hId;

	@Column(name = "h_name")
	private String hName;

	@Column(name = "h_age")
	private int hAge;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "wife_id")
	@JsonIgnore
	private Wife wife;

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public long gethId() {
		return hId;
	}

	public void sethId(long hId) {
		this.hId = hId;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public int gethAge() {
		return hAge;
	}

	public void sethAge(int hAge) {
		this.hAge = hAge;
	}

	@Override
	public String toString() {
		return "Husband [hId=" + hId + ", hName=" + hName + ", hAge=" + hAge + ", wife=" + wife + "]";
	}

}
