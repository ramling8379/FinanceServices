package com.fs.pojo.base.impl;

import static javax.persistence.TemporalType.TIMESTAMP;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fs.pojo.base.Trackable;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class TrackableImpl implements Trackable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2938369090392744029L;
	@LastModifiedDate
    @Temporal(TIMESTAMP)
	private Date modifiedTimeStamp;
	@CreatedDate
	@Temporal(TIMESTAMP)
	private Date createdTimeStamp;
	@LastModifiedBy
	private String modifiedBy;
	@CreatedBy
	private String createdBy;
	@Column(name = "DeleteStatus", nullable = false, columnDefinition = "boolean default false")
	private Boolean deleteStatus = Boolean.FALSE;
	@Version
	@Column(name = "Version")
	private Long version;

	@Column(name = "ModifiedTimeStamp", nullable = false)
	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	
	@Column(name = "CreatedTimeStamp", nullable = false, updatable = false)
	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		if(this.createdTimeStamp==null) {
			this.createdTimeStamp = createdTimeStamp;
		}
	}

	@Column(name = "ModifiedBy", nullable = false)
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "CreatedBy", nullable = false, updatable = false)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		if(this.createdBy ==null) {
			this.createdBy = createdBy;
		}
	}

	public Boolean getDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(Boolean deleteStatus) {
		if (deleteStatus == null) {
			this.deleteStatus = Boolean.FALSE;
		}else {
			this.deleteStatus =deleteStatus;
		}
	}
	
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
