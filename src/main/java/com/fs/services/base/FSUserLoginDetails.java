package com.fs.services.base;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fs.pojo.Role;
import com.fs.pojo.User;

public class FSUserLoginDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8605138666500556897L;
	private String userName;
	private String password;
	User loginUser;
	
	public FSUserLoginDetails(User loginUser) {
		this.userName=loginUser.getLoginName();
		this.password=loginUser.getPassword();
		this.loginUser = loginUser;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<Role> roles = loginUser.getRoles();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();

		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
