package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.ExpenseType;
import com.fs.repos.ExpenseTypeRepo;
import com.fs.services.ExpenseTypeService;
import com.fs.services.base.impl.ServiceImpl;

@Service
public class ExpenseTypeServiceImpl extends ServiceImpl<ExpenseType> implements ExpenseTypeService{

	@Autowired
	private ExpenseTypeRepo repo;
	
	@Override
	protected JpaRepository<ExpenseType, Long> getRepo() {
		return repo;
	}

}
