package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.controller.base.BaseController;
import com.fs.pojo.Designation;
import com.fs.services.DesignationService;
import com.fs.services.base.Service;
import com.fs.to.DesignationTo;
@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/designation")
public class DesignationController extends  BaseController<DesignationTo, Designation>{
	
	@Autowired
	private DesignationService designationService;

	@Override
	protected Service<Designation> getService() {
		return designationService;
	}

	@Override
	protected Class getBusinessObject() {
		return DesignationTo.class;
	}

	@Override
	protected Class getDomainObject() {
		return Designation.class;
	}

}
