package com.example.husbandtowife.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "wife_table")
public class Wife {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "w_id")
	private Long wId;

	@Column(name = "w_name")
	private String wName;

	@Column(name = "w_age")
	private int wAge;

	@OneToOne(mappedBy = "wife")
	private Husband husband;

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	public Long getwId() {
		return wId;
	}

	public void setwId(Long wId) {
		this.wId = wId;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public int getwAge() {
		return wAge;
	}

	public void setwAge(int wAge) {
		this.wAge = wAge;
	}

	@Override
	public String toString() {
		return "Wife [wId=" + wId + ", wName=" + wName + ", wAge=" + wAge + ", husband=" + husband + "]";
	}

}
