package com.fs.aop.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAdvice {

	Logger log = LoggerFactory.getLogger(LoggingAdvice.class);
	
	@Pointcut(value="execution(* com.fs.controller.*.*.*(..) )")
	public void fsPointcut() {
		
	}

	@Around("fsPointcut()") 
	public Object fsLogger(ProceedingJoinPoint joinpoint) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		String methodName = joinpoint.getSignature().getName();
		String className = joinpoint.getTarget().getClass().toString();
		Object[] arr = joinpoint.getArgs();
		//To Do Configure logging on off
		log.info("method invoked " + className + " : " + methodName + "() " + " arguments : "
				+ mapper.writeValueAsString(arr));
		Object returnObject = joinpoint.proceed();
		log.info(className + " : " + methodName + "() " + " Response : " + mapper.writeValueAsString(returnObject));
		return returnObject;
	}
}
