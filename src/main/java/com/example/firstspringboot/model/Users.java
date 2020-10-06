package com.example.firstspringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class Users {
	
	@Column(name = "PASSWORD")
	private String passWord;
	
	@Id
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "TARGET_PER_DAY")
	private int targetPerDay;
	
	@Column(name = "TARGET_PER_WEEK")
	private int targetPerWeek;
	
	@Column(name = "TARGET_PER_MONTH")
	private int targetPerMonth;

	public Users() {

	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

	public Users(String userName, String firstName, String lastName, int targetPerDay,
			int targetPerWeek, int targetPerMonth) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.targetPerDay = targetPerDay;
		this.targetPerWeek = targetPerWeek;
		this.targetPerMonth = targetPerMonth;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getTargetPerDay() {
		return targetPerDay;
	}

	public void setTargetPerDay(int targetPerDay) {
		this.targetPerDay = targetPerDay;
	}

	public int getTargetPerWeek() {
		return targetPerWeek;
	}

	public void setTargetPerWeek(int targetPerWeek) {
		this.targetPerWeek = targetPerWeek;
	}

	public int getTargetPerMonth() {
		return targetPerMonth;
	}

	public void setTargetPerMonth(int targetPerMonth) {
		this.targetPerMonth = targetPerMonth;
	}

}
