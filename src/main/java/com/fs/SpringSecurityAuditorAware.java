package com.fs;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

import com.fs.context.FSContext;

public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		if(FSContext.getFirm()!=null) {
			return Optional.ofNullable(FSContext.getFirm().getName()+"|"+FSContext.getLoginName()).filter(s -> !s.isEmpty());
		} else  {
			return Optional.of("ADMIN");
		}
	}
	
}