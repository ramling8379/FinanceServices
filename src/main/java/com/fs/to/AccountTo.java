package com.fs.to;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fs.to.base.BaseTo;

public class AccountTo extends BaseTo{
	
	@JsonProperty("accountId")
	@JsonAlias("id")
	private Long id;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("type")
	private Integer type;
	
	@JsonProperty("previousCode")
	private String previousCode;
	
	@JsonProperty("holderName")
	private String holderName;
	
	@JsonProperty("middleName")
	private String middleName;
	
	@JsonProperty("motherName")
	private String motherName;
	
	@JsonProperty("mobileNumber")
	private String mobileNumber;
	
	@JsonProperty("alternateMobileNumber")
	private String alternateMobileNumber;
	
	@JsonProperty("aadharNumber")
	private String aadharNumber;
	
	@JsonProperty("panNumber")
	private String panNumber;
	
	@JsonProperty("voterId")
	private String voterId;
	
	@JsonProperty("rationCard")
	private String rationCard;
	
	@JsonProperty("drivingLicense")
	private String drivingLicense;
	
	@JsonProperty("locationId")
	private Long locationId;
	
	@JsonProperty("address")
	private String address;
	
	@JsonProperty("fileNumber")
	private String fileNumber;
	
	@JsonProperty("holderPhoto")
	private byte[] holderPhoto;
	
	@JsonProperty("gurantor1")
	private String gurantor1;

	@JsonProperty("gurantor2")
	private String gurantor2;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPreviousCode() {
		return previousCode;
	}

	public void setPreviousCode(String previousCode) {
		this.previousCode = previousCode;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}

	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getRationCard() {
		return rationCard;
	}

	public void setRationCard(String rationCard) {
		this.rationCard = rationCard;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}

	public byte[] getHolderPhoto() {
		return holderPhoto;
	}

	public void setHolderPhoto(byte[] holderPhoto) {
		this.holderPhoto = holderPhoto;
	}

	public String getGurantor1() {
		return gurantor1;
	}

	public void setGurantor1(String gurantor1) {
		this.gurantor1 = gurantor1;
	}

	public String getGurantor2() {
		return gurantor2;
	}

	public void setGurantor2(String gurantor2) {
		this.gurantor2 = gurantor2;
	}
}
