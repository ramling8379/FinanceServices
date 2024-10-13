package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.Location;
import com.fs.repos.LocationRepo;
import com.fs.services.LocationService;
import com.fs.services.base.impl.ServiceImpl;

@Service
public class LocationServiceImpl extends ServiceImpl<Location> implements LocationService{

	@Autowired
	protected LocationRepo locationRepo;
	
	@Override
	protected JpaRepository<Location, Long> getRepo() {
		return locationRepo;
	}
	

}
