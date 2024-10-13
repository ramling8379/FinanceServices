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
import com.fs.pojo.Firm;
import com.fs.services.FirmService;
import com.fs.services.base.Service;
import com.fs.to.FirmTo;
import com.fs.utils.DataBinderUtil;
@RestController
@RequestMapping("/firm")
public class FirmController extends  BaseController<FirmTo, Firm>{
	
	@Autowired
	private FirmService service;
	
	@Autowired
	private DataBinderUtil binder;

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getBusinessObject() {
		return FirmTo.class;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	protected Class getDomainObject() {
		return Firm.class;
	}

	@Override
	protected Service<Firm> getService() {
		return service;
	}
	
	@SuppressWarnings({ "hiding", "rawtypes" })
//	@PreAuthorize("hasAuthority('Administrator', 'Master')")
	@Override
	public <FirmTo> ResponseEntity<List> getAll(Map<String, String> map) {
		List<Object> list = new ArrayList<Object>();
		if (FSContext.getUser() != null && FSContext.getUser().getUserRoles().contains(RoleConstants.MASTER_ROLE)) {
			return super.getAll(map);
		} else {
			list.add(binder.toBusiness(service.findById(FSContext.getUser().getFirmId()), getBusinessObject()));
			return new ResponseEntity<List>(list, HttpStatus.OK);
		}
	}
}
