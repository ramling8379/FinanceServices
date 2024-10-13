package com.fs.to.base;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseTo {

	@JsonProperty("modifiedTimeStamp")
	private Date modifiedTimeStamp;
	
	@JsonProperty("createdTimeStamp")
	private Date createdTimeStamp;
	
	@JsonProperty("modifiedBy")
	private String modifiedBy;
	
	@JsonProperty("createdBy")
	private String createdBy;
	
	@JsonProperty("deleteStatus")
	private Boolean deleteStatus;
	
	@JsonProperty("firmId")
	private Long firmId;
	

	public Boolean getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Long getFirmId() {
		return firmId;
	}

	public void setFirmId(Long firmId) {
		this.firmId = firmId;
	}
}
