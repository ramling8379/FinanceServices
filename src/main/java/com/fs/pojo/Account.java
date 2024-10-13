package com.fs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fs.pojo.base.impl.FirmAwareImpl;

@Entity
@Table(name="FSACCOUNT", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Account extends FirmAwareImpl{

	private static final long serialVersionUID = 366299965603L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "type", nullable = false, unique = false)
	private Integer type;

	@Column(name = "Code", nullable = false, unique = false)
	private String code;
	
	@Column(name = "PreviousCode", nullable = true, unique = false)
	private String previousCode;
	
	@Column(name = "HolderName", nullable = false, unique = false)
	private String holderName;
	
	@Column(name = "MiddleName", nullable = false, unique = false)
	private String middleName;
	
	@Column(name = "MotherName", nullable = false, unique = false)
	private String motherName;
	
	@Column(name = "MobileNumber", nullable = false, unique = false)
	private String mobileNumber;
	
	@Column(name = "AlternateMobileNumber", nullable = true, unique = false)
	private String alternateMobileNumber;
	
	@Column(name = "AadharNumber", nullable = false, unique = false)
	private String aadharNumber;
	
	@Column(name = "PanNumber", nullable = true, unique = false)
	private String panNumber;
	
	@Column(name = "VoterId", nullable = true, unique = false)
	private String voterId;
	
	@Column(name = "RationCard", nullable = true, unique = false)
	private String rationCard;
	
	@Column(name = "DrivingLicense", nullable = true, unique = false)
	private String drivingLicense;
	
	@Column(name = "LocationId", nullable = false, unique = false)
	private Long locationId;
	
	@Column(name = "Address", nullable = false, unique = false)
	private String address;
	
	@Column(name = "FileNumber", nullable = true, unique = false)
	private String fileNumber;
	
	@Column(name = "HolderPhoto", nullable = true, unique = false)
	private byte[] holderPhoto;
	
	@Column(name = "Gurantor1", nullable = true, unique = false)
	private String gurantor1;
	
	@Column(name = "Guranto2", nullable = true, unique = false)
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
