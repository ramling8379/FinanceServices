package com.fs.context;

public interface Scope<T> {

	public T get(String key);
	public void put(String key,T value);
	public void remove(String key);
}
