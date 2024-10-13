package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.controller.base.BaseController;
import com.fs.pojo.BankAccount;
import com.fs.services.BankAccountService;
import com.fs.services.base.Service;
import com.fs.to.BankAccountTo;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/bankaccounts")
public class BankAccountController extends  BaseController<BankAccountTo, BankAccount>{

	@Autowired
	private BankAccountService service;
	@Override
	protected Service<BankAccount> getService() {
		return service;
	}

	@Override
	protected Class getBusinessObject() {
		return BankAccountTo.class;
	}

	@Override
	protected Class getDomainObject() {
		return BankAccount.class;
	}

}
