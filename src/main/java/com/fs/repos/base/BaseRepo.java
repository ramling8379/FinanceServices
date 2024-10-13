package com.fs.repos.base;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
@SuppressWarnings("hiding")
@NoRepositoryBean
public interface BaseRepo<T, Long> extends JpaRepository<T , Long> {
	
	@Override
	default List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
