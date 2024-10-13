package com.fs.context;

import javax.servlet.http.HttpServletRequest;

public class HttpRequestScope implements RequestScope<HttpServletRequest>{

	private final HttpServletRequest request;
	
	public HttpRequestScope(HttpServletRequest request) {
		this.request=request;
	}
	
	public String getHeader(String name) {
		return request.getHeader(name);
	}
	
	@Override
	public void put(String key, Object value) {
		request.setAttribute(key, value );
	}

	@Override
	public void remove(String key) {
		request.removeAttribute(key);
	}

	@Override
	public HttpServletRequest getSource() {
		return request;
	}

	@Override
	public Object get(String key) {
		return request.getAttribute(key);
	}
}
