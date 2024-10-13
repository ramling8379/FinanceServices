package com.fs.services;

import java.util.List;

import com.fs.pojo.Firm;
import com.fs.pojo.User;
import com.fs.services.base.Service;

public interface UserService extends Service<User>{

	User getUserByLoginName(String loginName);
	User getUserByLoginNameAndPassword(String loginName, String passwrod);
	List<User> getUserByFirmId(Long firmId);
	void createUserForNewFirm(Firm firm);

}
