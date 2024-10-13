package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.Loan;
import com.fs.repos.LoanRepo;
import com.fs.services.LoanService;
import com.fs.services.base.impl.ServiceImpl;

@Service
public class LoanServiceImpl extends ServiceImpl<Loan> implements LoanService{
	
	@Autowired
	private LoanRepo repo;

	@Override
	protected JpaRepository<Loan, Long> getRepo() {
		return repo;
	}

}
