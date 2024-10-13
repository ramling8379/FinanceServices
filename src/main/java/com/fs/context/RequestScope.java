package com.fs.context;

public interface RequestScope<T> extends Scope<Object> {
	public T getSource();
	
	@Override
	public Object get(String key);
}
