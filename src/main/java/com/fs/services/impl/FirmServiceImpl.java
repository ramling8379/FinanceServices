package com.fs.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fs.pojo.Firm;
import com.fs.repos.FirmRepo;
import com.fs.services.FirmService;
import com.fs.services.UserService;
import com.fs.services.base.impl.ServiceImpl;
@Service
public class FirmServiceImpl extends ServiceImpl<Firm> implements FirmService{

	@Autowired
	protected FirmRepo firmRepo;
	
	@Autowired
	protected UserService userService;

	@Override
	protected JpaRepository<Firm, Long> getRepo() {
		return firmRepo;
	}
	
	@Override
	@Transactional
	public Firm save(Firm firm) {
		firm.setIsActive(Boolean.TRUE);
		super.save(firm);
		userService.createUserForNewFirm(firm);
		return firm;
	}
	
}
