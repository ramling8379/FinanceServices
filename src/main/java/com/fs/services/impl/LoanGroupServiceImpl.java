package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.LoanGroup;
import com.fs.repos.LoanGroupRepo;
import com.fs.services.LoanGroupService;
import com.fs.services.base.impl.ServiceImpl;

@Service
public class LoanGroupServiceImpl extends ServiceImpl<LoanGroup> implements LoanGroupService{

	@Autowired
	private LoanGroupRepo repo;
	
	@Override
	protected JpaRepository<LoanGroup, Long> getRepo() {
		return repo;
	}

}
