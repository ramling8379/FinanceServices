package com.fs.context;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class HttpServletFSContext extends FSContext{

	private String sessionId;
	private HttpServletRequest request;
	private Lock contextLock = new ReentrantLock();
	private HttpSessionScope sessionScope = null;
	
	public HttpServletFSContext(HttpServletRequest request) {
		super(new HttpRequestScope(request));
		this.request=request;
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public SessionScope<?> getSession(boolean create) {
		HttpSession session = request.getSession(create);
		if (sessionScope == null) {
			sessionScope = new HttpSessionScope(session);
		}
		sessionScope.setSession(session);

		if (null == session) {
			this.sessionId = null;
		}

		if (null != session && (null == sessionId || false == session.equals(session.getId()))) {
			this.sessionId = session.getId();
		}
		return null == session ? null : sessionScope;
	}

	@Override
	public void invalidateSession() {
		HttpSession session= request.getSession(false);
		if(session != null) {
			
			try {
				contextLock.lock();
				session.invalidate();
				
			} finally {
				contextLock.unlock();
			}
			this.sessionId=null;
		}
	}
	
	public static void newInstance(HttpServletRequest reqestObj) {
		new HttpServletFSContext(reqestObj);
	}

}
