package com.fs.to;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fs.to.base.BaseTo;
@JsonIgnoreProperties(value = {"confirmPassword"})
public class UserTo extends BaseTo{

	@JsonProperty("loginName")
	private String loginName;
	
	@JsonProperty("password")
	private String password;

	@JsonProperty("confirmPassword")
	private String confirmPassword;
	
	@JsonProperty("firstName")
	private String firstName;
	
	@JsonProperty("middleName")
	private String middleName;
	
	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("mobileNumber")
	private String mobileNumber;
	
	@JsonProperty("emailId")
	private String emailId;
	
	@JsonProperty("aadhar")
	private String aadhar;
	
	@JsonProperty("state")
	private String state;
	
	@JsonProperty("district")
	private String district;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("dateOfBirth")
	private Date dateOfBirth;
	
	@JsonProperty("dateOfJoining")
	private Date dateOfJoining;
	
	@JsonProperty("ctc")
	private BigDecimal ctc;
	
	@JsonProperty("bloodGroup")
	private String bloodGroup;
	
	@JsonProperty("userProfileImg")
	private byte[] userProfileImg;
	
	@JsonProperty("userCode")
	private String userCode;
	
	@JsonProperty("designation")
	private DesignationTo designation;
	
	@JsonProperty("roles")
	private List<RoleTo> roles;
	
	@JsonProperty("userId")
	@JsonAlias("id")
	private Long id;
	
	@JsonProperty("lastLogin")
	private Date lastLogin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public BigDecimal getCtc() {
		return ctc;
	}

	public void setCtc(BigDecimal ctc) {
		this.ctc = ctc;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public byte[] getUserProfileImg() {
		return userProfileImg;
	}

	public void setUserProfileImg(byte[] userProfileImg) {
		this.userProfileImg = userProfileImg;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public DesignationTo getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationTo designation) {
		this.designation = designation;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public List<RoleTo> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleTo> roles) {
		this.roles = roles;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
}
