package com.fs.exception.handler;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fs.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class FSExceptionHandler extends ResponseEntityExceptionHandler{
	Logger log = LoggerFactory.getLogger(FSExceptionHandler.class);
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<Object> objectNotFoundExceptionHandler(ObjectNotFoundException ex, WebRequest request) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", ex.getMessage());
		log.error(ex.getMessage());
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(TransactionSystemException.class)
	public ResponseEntity<Object> validationExceptionHandler(TransactionSystemException ex, WebRequest request) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		log.error(ex.getMessage(), ex);
		ConstraintViolationException constraints = (ConstraintViolationException) ex.getCause().getCause();
		List<String> messages = new ArrayList<>();
		for(ConstraintViolation<?> vio : constraints.getConstraintViolations() ) {
			messages.add(vio.getMessage());
		}
		body.put("validations", messages);
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> globalExceptionHandler(Exception ex, WebRequest request) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", "Internal Server Error. Please contact system administratior");
		log.error(ex.getMessage(), ex);
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = AccessDeniedException.class)
	public ResponseEntity<Object> handleAccessDeniedException(HttpServletResponse response) throws IOException {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", "You do not have permissions");
		return new ResponseEntity<>(body, HttpStatus.FORBIDDEN);
	}
}
