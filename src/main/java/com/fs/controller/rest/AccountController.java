package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.controller.base.BaseController;
import com.fs.pojo.Account;
import com.fs.services.AccountService;
import com.fs.services.base.Service;
import com.fs.to.AccountTo;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/account")
public class AccountController extends  BaseController<AccountTo, Account>{

	@Autowired
	private AccountService service;

	@Override
	protected Service<Account> getService() {
		return service;
	}

	@Override
	protected Class getBusinessObject() {
		return AccountTo.class;
	}

	@Override
	protected Class getDomainObject() {
		return Account.class;
	}

}
