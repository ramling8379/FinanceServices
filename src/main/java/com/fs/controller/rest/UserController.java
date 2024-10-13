package com.fs.controller.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.constants.RoleConstants;
import com.fs.context.FSContext;
import com.fs.controller.base.BaseController;
import com.fs.pojo.User;
import com.fs.services.UserService;
import com.fs.services.base.Service;
import com.fs.to.UserTo;
import com.fs.utils.DataBinderUtil;

@RestController
@RequestMapping("/user")
public class UserController extends  BaseController<UserTo, User>{
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private DataBinderUtil binder;
	
	@Override
	protected Service<User> getService() {
		return userService;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getBusinessObject() {
		return UserTo.class;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getDomainObject() {
		return User.class;
	}
	
	@SuppressWarnings({ "hiding", "rawtypes" })
	@Override
	public <UserTo> ResponseEntity<List> getAll(Map<String, String> map) {
		List<Object> list = new ArrayList<Object>();
		if(FSContext.getUser().getUserRoles().contains(RoleConstants.ADMINISTRATOR_ROLE)
				||FSContext.getUser().getUserRoles().contains(RoleConstants.MASTER_ROLE)) {
			return super.getAll(map);
		} else {
			list.add(binder.toBusiness(userService.findById(FSContext.getUser().getId()), getBusinessObject()));
			return new ResponseEntity<List>(list, HttpStatus.OK);
		}
		
	}

}
