package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fs.pojo.Role;
import com.fs.repos.RoleRepo;
import com.fs.services.RoleService;
import com.fs.services.base.impl.ServiceImpl;
@Service
public class RoleServiceImpl extends ServiceImpl<Role> implements RoleService{

	@Autowired
	private RoleRepo repo;
	
	@Override
	protected JpaRepository<Role, Long> getRepo() {
		return repo;
	}

}
