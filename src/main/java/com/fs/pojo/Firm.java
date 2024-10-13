package com.fs.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fs.pojo.base.impl.TrackableImpl;
@Entity
@Table(name = "FSFIRM", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Firm extends TrackableImpl {
	/**
	* 
	*/
	private static final long serialVersionUID = 4258662000826957318L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Name", nullable = false, unique = false)
	private String name;

	@Column(name = "MobileNumber", nullable = false, unique = false)
	private String mobileNumber;

	@Column(name = "EmailId", nullable = false, unique = false)
	private String emailId;

	@Column(name = "City", nullable = false, unique = false)
	private String city;
	
	@Column(name = "District",nullable = false, unique = false)
	private String district;

	@Column(name = "State", nullable = false, unique = false)
	private String state;

	@Column(name = "Address", nullable = false, unique = false)
	private String address;

	@Column(name = "RegistrationId", nullable = true, unique = false)
	private String registrationId;

	@Column(name = "Pancard", nullable = true, unique = false)
	private String pancard;

	@Column(name = "RegistrationDate", nullable = true, unique = false)
	private Date registrationDate;

	@Column(name = "ReNewDueDate", nullable = true, unique = false)
	private Date reNewDueDate;

	@Column(name = "MyReferralCode", nullable = true, unique = false)
	private String myReferralCode;

	@Column(name = "ReferredBy", nullable = true, unique = false)
	private String referredBy;

	@Column(name = "IsActive", nullable = true, unique = false)
	private Boolean isActive = true;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getReNewDueDate() {
		return reNewDueDate;
	}

	public void setReNewDueDate(Date reNewDueDate) {
		this.reNewDueDate = reNewDueDate;
	}

	public String getMyReferralCode() {
		return myReferralCode;
	}

	public void setMyReferralCode(String myReferralCode) {
		this.myReferralCode = myReferralCode;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
}
