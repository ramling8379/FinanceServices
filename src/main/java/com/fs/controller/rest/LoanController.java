package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.controller.base.BaseController;
import com.fs.pojo.Loan;
import com.fs.services.LoanService;
import com.fs.services.base.Service;
import com.fs.to.LoanTo;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/loan")
public class LoanController extends BaseController<LoanTo, Loan>{
	
	@Autowired
	private LoanService service;

	@Override
	protected Service<Loan> getService() {
		return service;
	}

	@Override
	protected Class getBusinessObject() {
		return LoanTo.class;
	}

	@Override
	protected Class getDomainObject() {
		return Loan.class;
	}

}
