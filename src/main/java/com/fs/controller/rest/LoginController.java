package com.fs.controller.rest;

import com.fs.utils.PasswordEncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fs.constants.FSExceptionConstants;
import com.fs.context.FSContext;
import com.fs.pojo.User;
import com.fs.services.UserService;
import com.fs.services.base.FSUserLoginDetailsService;
import com.fs.to.AuthonticatedUserTo;
import com.fs.to.UserTo;
import com.fs.utils.DataBinderUtil;
import com.fs.utils.JwtUtil;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private FSUserLoginDetailsService loginDetailService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private DataBinderUtil binder;

	@Autowired
	private PasswordEncryptionService passwordEncryptionService;
	
	
	@SuppressWarnings("rawtypes")
	@Autowired
	private FindByIndexNameSessionRepository sessionRepository;

	@SuppressWarnings("unchecked")
	@PostMapping
	@RequestMapping(value = "/logout")
	public ResponseEntity<Object> logout(@RequestBody UserTo userInfo) throws Exception {

		sessionRepository
				.findByIndexNameAndIndexValue(FindByIndexNameSessionRepository.PRINCIPAL_NAME_INDEX_NAME, userInfo.getLoginName())
				.keySet().forEach(session -> sessionRepository.deleteById((String) session));
		
		/*
		 * sessionRepository
		 * .findByIndexNameAndIndexValue(FindByIndexNameSessionRepository.
		 * PRINCIPAL_NAME_INDEX_NAME, "") .keySet().forEach(session ->
		 * sessionRepository.deleteById((String) session));
		 */
		
		return new ResponseEntity<Object>("Logout successfully", HttpStatus.OK);
	}
	
	@PostMapping
	@RequestMapping(value = "/authenticate")
	public ResponseEntity<Object> createAuthToken(@RequestBody UserTo userInfo) throws Exception {
		User user = null;
		try {
			user = userService.getUserByLoginName(userInfo.getLoginName());
			if (!(user != null && passwordEncryptionService.matches(userInfo.getPassword(), user.getPassword()))) {
				return ResponseEntity.status(401).body("Invalid credentials");
			}
		} catch (BadCredentialsException e) {
			return new ResponseEntity<Object>(FSExceptionConstants.UN_AUTHORIZED_USER, HttpStatus.UNAUTHORIZED);
		}
		
		if (user == null || (user.getFirm() != null && (Boolean.FALSE.equals(user.getFirm().getIsActive())
				|| Boolean.TRUE.equals(user.getFirm().getDeleteStatus())))) {
			return new ResponseEntity<Object>(new String(FSExceptionConstants.UN_AUTHORIZED_USER), HttpStatus.UNAUTHORIZED);
		} 
		final UserDetails userDetails = loginDetailService.loadUserByUsername(userInfo.getLoginName());
		AuthonticatedUserTo userTo = (AuthonticatedUserTo) binder.toBusiness(user, AuthonticatedUserTo.class);
		String key=jwtUtil.generateToken(userDetails);
		FSContext.createAuthenticatedSession(user);
		//user.setLastLogin(new Date());
		//userService.save(user);
		userTo.setFirmId(FSContext.getFirmId());
		return new ResponseEntity<Object>(new LoginWithKey(key,userTo), HttpStatus.OK);
	}


	class LoginWithKey {
		private String aceess_key;
		private AuthonticatedUserTo userTo;
		
		LoginWithKey(String aceess_key, AuthonticatedUserTo userTo){
			this.aceess_key=aceess_key;
			this.userTo=userTo;
		}
		public String getAceess_key() {
			return aceess_key;
		}
		public void setAceess_key(String aceess_key) {
			this.aceess_key = aceess_key;
		}
		public AuthonticatedUserTo getUserDto() {
			return userTo;
		}
		public void setUserDto(AuthonticatedUserTo userTo) {
			this.userTo = userTo;
		}
	}


}
