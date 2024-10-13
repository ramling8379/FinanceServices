package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.controller.base.BaseController;
import com.fs.pojo.LoanGroup;
import com.fs.services.LoanGroupService;
import com.fs.services.base.Service;
import com.fs.to.LoanGroupTo;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/loanGroup")
public class LoanGroupController extends BaseController<LoanGroupTo, LoanGroup>{

	@Autowired
	private LoanGroupService service;
	
	@Override
	protected Service<LoanGroup> getService() {
		return service;
	}

	@Override
	protected Class getBusinessObject() {
		return LoanGroupTo.class;
	}

	@Override
	protected Class getDomainObject() {
		return LoanGroup.class;
	}

}
