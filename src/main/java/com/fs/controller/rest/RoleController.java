package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.controller.base.BaseController;
import com.fs.pojo.Role;
import com.fs.services.RoleService;
import com.fs.services.base.Service;
import com.fs.to.RoleTo;

@SuppressWarnings("rawtypes")
@RestController
@RequestMapping("/role")
public class RoleController extends  BaseController<RoleTo, Role>{
	
	@Autowired
	private RoleService roleService;

	@Override
	protected Service<Role> getService() {
		return roleService;
	}

	@Override
	protected Class getBusinessObject() {
		return RoleTo.class;
	}

	@Override
	protected Class getDomainObject() {
		return Role.class;
	}

}
