package com.fs.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fs.controller.base.BaseController;
import com.fs.pojo.Location;
import com.fs.services.LocationService;
import com.fs.services.base.Service;
import com.fs.to.LocationTo;
@Controller
@RequestMapping("/location")
public class LocationController extends BaseController<LocationTo, Location>{

	@Autowired
	private LocationService locationService;
	
	@Override
	protected Service<Location> getService() {
		return locationService;
	}

	@Override
	protected Class<LocationTo> getBusinessObject() {
		return LocationTo.class;
	}

	@Override
	protected Class<Location> getDomainObject() {
		return Location.class;
	}

}
