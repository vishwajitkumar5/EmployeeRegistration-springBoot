package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employeeName", nullable = false, unique = true, length = 45)
	private String employeeName;

	@Column(name = "employeefatherName", nullable = false, unique = true, length = 45)
	private String employeefatherName;

	@Column(name = "employeemotherName", nullable = false, unique = true, length = 45)
	private String employeemotherName;

	@Column(name = "address", nullable = false, unique = true, length = 45)
	private String address;

	@Column(name = "mobileNumber", nullable = false, unique = true, length = 45)
	private String mobileNumber;

	@Column(name = "password", nullable = false, unique = true, length = 45)
	private String password;

	@Column(name = "email", nullable = false, unique = true, length = 45)
	private String email;

	@Column(name = "whatsAppNumber", nullable = false, unique = true, length = 45)
	private String whatsAppNumber;

	@Column(name = "bloodgroup", nullable = false, unique = true, length = 45)
	private String bloodgroup;

	@Column(name = "position", nullable = false, unique = true, length = 45)
	private String position;

	@Column(name = "gender", nullable = false, unique = true, length = 45)
	private String gender;

	@Column(name = "maritalStatus", nullable = false, unique = true, length = 45)
	private String maritalStatus;

	@Column(name = "religion", nullable = false, unique = true, length = 45)
	private String religion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeefatherName() {
		return employeefatherName;
	}

	public void setEmployeefatherName(String employeefatherName) {
		this.employeefatherName = employeefatherName;
	}

	public String getEmployeemotherName() {
		return employeemotherName;
	}

	public void setEmployeemotherName(String employeemotherName) {
		this.employeemotherName = employeemotherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWhatsAppNumber() {
		return whatsAppNumber;
	}

	public void setWhatsAppNumber(String whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

}
