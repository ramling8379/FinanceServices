package com.fs.services.base.impl;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fs.exceptions.ObjectNotFoundException;
import com.fs.services.base.Service;

public abstract class ServiceImpl<T> implements Service<T>{

protected abstract JpaRepository<T, Long> getRepo();
	
	@Override
	public List<T> findAll(Example<T> example) {
 		return getRepo().findAll(example);
	}
	
	@Override
	public  Page<T> getPageList(Example<T> example, Pageable pageable) {
 		return getRepo().findAll(example, pageable);
	}
	
	@Override
	public T findById(Long id) {
		//TODO: Move below hard coded message in properties file
		return getRepo().findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Object not found for given id :" + id));
	}

	@Override
	public T save(T object) {
		updateObject(object);
		return getRepo().save(object);
	}

	@Override
	public List<T> saveAll(List<T> entites) {
		return getRepo().saveAll(entites);
	}
	
	@Override
	public void delete(T entity) {
		getRepo().delete(entity);
	}
	
	@Override
	public void deleteAll(List<T> entites) {
		getRepo().deleteAll(entites);
	}

	protected void updateObject(T entity){
	}

}
