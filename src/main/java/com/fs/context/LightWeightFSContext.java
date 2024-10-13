package com.fs.context;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LightWeightFSContext extends FSContext {

	private Lock contextLock = new ReentrantLock();
	private SystemSessionScope sessionScope = new SystemSessionScope();
	
	public LightWeightFSContext (RequestScope<?> request) {
		super(request == null ? new SystemRequestScope() : request);
	}
	@Override
	public SystemSessionScope getSession(boolean create) {
		if(create) {
			String newSessionId = SystemSessionScope.generatedSessionId();
			sessionScope.setSessionId(newSessionId);
		}
		return sessionScope;
	}

	@Override
	public void invalidateSession() {
	
		try {
			contextLock.lock();
			sessionScope.getSource().clear();
			sessionScope.setSessionId(null);
			
		} finally {
			contextLock.unlock();
		}
		
	}
	public static void newInstance(SystemRequestScope reqestObj) {
		new LightWeightFSContext(reqestObj);
	}


}
