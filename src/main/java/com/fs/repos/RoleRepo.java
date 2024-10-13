package com.fs.repos;

import org.springframework.stereotype.Repository;

import com.fs.pojo.Role;
import com.fs.repos.base.BaseRepo;
@Repository

public interface RoleRepo extends BaseRepo<Role, Long>{
	
	public Role findByName(String roleName);

}
