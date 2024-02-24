package com.userManagement.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userEmail;
	@Column(name = "create-date",updatable = false)
	private LocalDate createDate;
	@Column(name = "update-date",insertable = false)
	private LocalDate updateDate;
	@Column(name = "isActive-Switch")
	private Character isActive;
	
	public User(Integer userId, String userName, String userEmail, LocalDate createDate, LocalDate updateDate,
			Character isActive) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.isActive = isActive;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	public Character getIsActive() {
		return isActive;
	}
	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", isActive=" + isActive + "]";
	}
	

}
