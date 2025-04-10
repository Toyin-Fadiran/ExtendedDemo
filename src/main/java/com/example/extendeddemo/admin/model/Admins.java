package com.example.extendeddemo.admin.model;

import java.util.Date;

public class Admins {

	private Integer adminId;
	private String email;
	private String password;
	private String fullName;
	private Integer loginType;
	private Date addedOn;

	public Admins(Integer adminId, String email, String password, String fullName, Integer loginType, Date addedOn) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.loginType = loginType;
		this.addedOn = addedOn;
	}

	public Admins() {
		super();
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getLoginType() {
		return loginType;
	}

	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	@Override
	public String toString() {
		return "Admins [adminId=" + adminId + ", email=" + email + ", password=" + password + ", fullName=" + fullName
				+ ", loginType=" + loginType + ", addedOn=" + addedOn + "]";
	}

}
