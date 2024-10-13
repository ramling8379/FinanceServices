package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.Designation;
import com.fs.repos.DesignationRepo;
import com.fs.services.DesignationService;
import com.fs.services.base.impl.ServiceImpl;

@Service
public class DesignationServiceImpl extends ServiceImpl<Designation> implements DesignationService{

	@Autowired
	private DesignationRepo repo;
	
	@Override
	protected JpaRepository<Designation, Long> getRepo() {
		return repo;
	}

}
