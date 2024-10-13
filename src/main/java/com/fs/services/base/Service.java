package com.fs.services.base;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Service<T> {
	
	List<T> findAll(Example<T> example);
	
	T findById(Long id);
	
	T save(T object);
	
	List<T> saveAll(List<T> list);
	
	void delete(T entity);
	
	void deleteAll(List<T> entites);

	Page<T> getPageList(Example<T> example, Pageable pageable);
}
