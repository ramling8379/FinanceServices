package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.BankAccount;
import com.fs.repos.BankAccountRepo;
import com.fs.services.BankAccountService;
import com.fs.services.base.impl.ServiceImpl;
@Service
public class BankAccountServiceImpl extends ServiceImpl<BankAccount> implements BankAccountService{

	@Autowired
	private BankAccountRepo repo;
	
	@Override
	protected JpaRepository<BankAccount, Long> getRepo() {
		return repo;
	}

}
