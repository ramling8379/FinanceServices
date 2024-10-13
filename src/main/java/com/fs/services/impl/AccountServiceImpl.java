package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.Account;
import com.fs.repos.AccountRepo;
import com.fs.services.AccountService;
import com.fs.services.base.impl.ServiceImpl;
@Service
public class AccountServiceImpl extends ServiceImpl<Account> implements AccountService{

	@Autowired 
	private AccountRepo repo;
	
	@Override
	protected JpaRepository<Account, Long> getRepo() {
		return repo;
	}

}
