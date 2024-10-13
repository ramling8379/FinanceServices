package com.fs.context;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

import com.fs.pojo.Firm;
import com.fs.pojo.User;

public class HttpSessionScope  implements SessionScope<HttpSession>{

	
	private HttpSession session;
	
	public HttpSessionScope(HttpSession session) {
		this.session=session;
	}
	
	@Override
	public void put(String key, Serializable value) {
		session.setAttribute(key, value);
	}

	@Override
	public void remove(String key) {
		session.removeAttribute(key);
		
	}

	@Override
	public HttpSession getSource() {
		return session;
	}

	@Override
	public String getSessionId() {
		return session == null ? null : session.getId();
	}

	@Override
	public Serializable get(String key) {
		return (Serializable) session.getAttribute(key);
	}
	
	public void setSession(HttpSession session) {
		this.session=session;
	}

	@Override
	public Long getFirmId() {
		return (Long) session.getAttribute(FIRM_ID);
	}
	@Override
	public Long getUserId() {
		return (Long) session.getAttribute(USER_ID);
	}
	@Override
	public String getLoginName() {
		return (String) session.getAttribute(LOGIN_NAME);
	}

	@Override
	public Firm getFirm() {
		return (Firm) session.getAttribute(FIRM);
	}

	@Override
	public User getUser() {
		return (User) session.getAttribute(USER);
	}

}
