package com.fs.utils;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.fs.context.SystemRequestScope;

public class LoginUtils {

	public static SystemRequestScope getRequestScope(HttpServletRequest request) {
		SystemRequestScope req=new SystemRequestScope();
		Enumeration<String> attributeNames = request.getAttributeNames();
		
		if(attributeNames != null) {
			while (attributeNames.hasMoreElements()) {
			    String name = attributeNames.nextElement();
			    req.put(name, request.getAttribute(name));
			}
		}
		// This is for future use to log request IP - address req.setRemoteAddress(remoteAddress);
		
		Cookie[] cookies = request.getCookies();
		
		if(null != cookies && cookies.length>0) {
			for (Cookie cookie : cookies) {
				req.setCookieValue(cookie.getName(), cookie.getValue());
			}
		}
		
		Enumeration<String> headers = request.getHeaderNames();

		if (headers != null) {
			while (headers.hasMoreElements()) {
				
				String headerKey = attributeNames.nextElement();
				Enumeration<String> headerValues = request.getHeaders(headerKey);
				if (headerValues != null) {
					req.setHeader(headerKey, headerValues.nextElement());
				}
			}
		}
		return req;
		
	}
}
