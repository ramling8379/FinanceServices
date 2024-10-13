package com.fs.services.base;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fs.pojo.User;
import com.fs.repos.UserRepo;

@Service
public class FSUserLoginDetailsService implements UserDetailsService {
	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String loginName) {
		Optional<User> loginUser = userRepo.findByLoginName(loginName);
		if (!loginUser.isPresent()) {
			throw new UsernameNotFoundException("User Not found with given login name " + loginName);
		}
//		 return new org.springframework.security.core.userdetails.User(
//		          user.getEmail(), user.getPassword(), user.isEnabled(), true, true, 
//		          true, getAuthorities(user.getRoles()));
		return new FSUserLoginDetails(loginUser.get());
	}
}