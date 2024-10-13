package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.controller.base.BaseController;
import com.fs.pojo.ExpenseType;
import com.fs.services.ExpenseTypeService;
import com.fs.services.base.Service;
import com.fs.to.ExpenseTypeTo;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/expenseType")
public class ExpenseTypeController extends  BaseController<ExpenseTypeTo, ExpenseType>{
	
	@Autowired ExpenseTypeService service;

	@Override
	protected Service<ExpenseType> getService() {
		return service;
	}

	@Override
	protected Class getBusinessObject() {
		return ExpenseTypeTo.class;
	}

	@Override
	protected Class getDomainObject() {
		return ExpenseType.class;
	}

}
