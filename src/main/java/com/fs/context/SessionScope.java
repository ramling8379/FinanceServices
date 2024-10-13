package com.fs.context;

import java.io.Serializable;

import com.fs.pojo.Firm;
import com.fs.pojo.User;

public interface SessionScope<T> extends Scope<Serializable> {
	public T getSource();
	public String getSessionId();
	
	@Override
	public Serializable get(String key);
	
	public Long getFirmId();
	public Long getUserId();
	public String getLoginName();
	public Firm getFirm();
	public User getUser();
	
	public static final String FIRM_ID="FIRM.ID";
	public static final String USER_ID="USER.ID";
	public static final String USER="USER";
	public static final String LOGIN_NAME="LOGIN.NAME";
	public static final String FIRM="FIRM";
}
