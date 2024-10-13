package com.fs.pojo.base;

import com.fs.pojo.Firm;

public interface FirmAware extends Trackable{

	public static final String FIRM_ID = "firmId";
	public abstract Long getFirmId();
	public abstract void setFirmId(Long firmId);
	public abstract void setFirm(Firm firm);
	public abstract Firm getFirm();
}
