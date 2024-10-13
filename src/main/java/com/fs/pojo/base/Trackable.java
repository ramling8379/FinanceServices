package com.fs.pojo.base;

import java.util.Date;

public interface Trackable {
	
	public static final String CREATEDBY="createdBy";
	public static final String CREATED_TIMESTAMP="createdTimeStamp";
	public static final String MODIFYIEDBY="modifiedBy";
	public static final String MODIFIED_TIMESTAMP="modifiedTimeStamp";
	public static final String DELETE_STATUS="deleteStatus";
	public static final String VERSION="version";
	
	public abstract String getCreatedBy();
	public abstract void setCreatedBy(String createdBy);
	
	public abstract String getModifiedBy();
	public abstract void setModifiedBy(String modifiedBy);
	
	public abstract Date getModifiedTimeStamp();
	public abstract void setModifiedTimeStamp(Date modifiedTimeStamp);
	
	public abstract Date getCreatedTimeStamp();
	public abstract void setCreatedTimeStamp(Date createdTimeStamp);
	
	public abstract Boolean getDeleteStatus();
	public abstract void setDeleteStatus(Boolean deleteStatus);
	
	public abstract Long getVersion();
	public abstract void setVersion(Long version);

}
