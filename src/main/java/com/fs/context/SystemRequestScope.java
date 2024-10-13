package com.fs.context;

import java.util.HashMap;
import java.util.Map;

public class SystemRequestScope implements RequestScope<Map<String,Object>>{
	
	private Map<String,String> requestHeaders = new HashMap<String, String>();
	private Map<String,String> requestCookies = new HashMap<String, String>();
	private Map<String,Object> requestAttributes = new HashMap<String, Object>();
	
	private String remoteAddress;

	
	public Map<String, String> getRequestHeaders() {
		return requestHeaders;
	}

	public Map<String, String> getRequestCookies() {
		return requestCookies;
	}

	public Map<String, Object> getRequestAttributes() {
		return requestAttributes;
	}

	@Override
	public void put(String key, Object value) {
		requestAttributes.put(key, value);
		
	}

	@Override
	public void remove(String key) {
		requestAttributes.remove(key);
		
	}

	@Override
	public Map<String, Object> getSource() {
		return requestAttributes;
	}

	@Override
	public Object get(String key) {
		return requestAttributes.get(key);
	}

	public String getRemoteAddress() {
		return remoteAddress;
	}

	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}
	
	public void setCookieValue(String key, String value) {
		requestCookies.put(key, value);
		
	}
	
	public void setHeader(String key, String value) {
		requestHeaders.put(key, value);
		
	}
	
	

}
