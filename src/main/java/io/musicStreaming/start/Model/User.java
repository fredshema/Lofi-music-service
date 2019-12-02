package io.musicStreaming.start.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id @GeneratedValue
	private int ID;
	@Column(nullable = false)
	private String name;
	private String userName;
	@Column(nullable = false)
	private String plan;
	@Column(nullable = false)
	private String imageUrl;
	private String email;
	private String password;
	@Column(nullable = false)
	private String phoneNumber;
	private Date signupDate;
	@Column(nullable = false)
	private String sessionToken;
	
	public User() {}
	
	public User(int iD, String name, String userName, String plan, String imageUrl, String email, String password,
			String phoneNumber, Date signupDate, String sessionToken) {
		super();
		ID = iD;
		this.name = name;
		this.userName = userName;
		this.plan = plan;
		this.imageUrl = imageUrl;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.signupDate = signupDate;
		this.sessionToken = sessionToken;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getSignupDate() {
		return signupDate;
	}
	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
	}
	public String getSessionToken() {
		return sessionToken;
	}
	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}
	
}
