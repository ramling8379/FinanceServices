package com.fs.controller.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fs.constants.FSExceptionConstants;
import com.fs.context.FSContext;
import com.fs.pojo.Firm;
import com.fs.pojo.base.FirmAware;
import com.fs.pojo.base.Trackable;
import com.fs.services.base.Service;
import com.fs.utils.DataBinderUtil;
import com.fs.utils.QueryParamUtil;
@Validated
public abstract class BaseController<B, D> {

	protected abstract Service<D> getService();
	
	@SuppressWarnings("rawtypes")
	protected abstract Class getBusinessObject();
	
	@SuppressWarnings("rawtypes")
	protected abstract Class getDomainObject();
	
	@Autowired
	private DataBinderUtil binder;
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public <T> ResponseEntity<List> getAll(@RequestParam Map<String, String> map) {
		List<Object> list = new ArrayList<Object>();
		List<D> domainList = getService().findAll(QueryParamUtil.getExampleObject(getDomainObject(), map));
		if (!domainList.isEmpty()) {
			for (D d : domainList) {
				list.add(binder.toBusiness(d, getBusinessObject()));
			}
		}

		return new ResponseEntity<List>(list, HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(path = "/getPageList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Page> getAllPages(@RequestParam Map<String, String> map) {
			Page<D> sortedList = getService().getPageList(QueryParamUtil.getExampleObject(getDomainObject(), map),
					QueryParamUtil.getPageable(map));
		return new ResponseEntity<Page>(sortedList, HttpStatus.OK);
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody B object){
		Object result = binder.toDomain(object, getDomainObject());
		D d = (D) result;
		QueryParamUtil.setFirmData(d);
		getService().save(d);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findById(@PathVariable Long id){
		Object obj = getService().findById(id);
		Object result = binder.toBusiness(obj, getBusinessObject());
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> update(@Valid @RequestBody B object, @PathVariable Long id){
		D d = getService().findById(id);
		if (firmValidation(d)) {
			throw new AccessDeniedException(FSExceptionConstants.DONT_HAVE_PERMISSION);
		} else {
			BeanUtils.copyProperties(object, d);
			QueryParamUtil.setFirmData(d);
			getService().save(d);
		}
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@SuppressWarnings({ "rawtypes"})
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity delete(@PathVariable Long id){
		D d = getService().findById(id);
		if (firmValidation(d)) {
			throw new AccessDeniedException(FSExceptionConstants.DONT_HAVE_PERMISSION);
		} else {
			if(d instanceof Trackable) {
				Trackable trackable = (Trackable) d;
				trackable.setDeleteStatus(Boolean.TRUE);
				getService().save(d);
			} else {
				getService().delete(d);
			}
		}
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(path = "/getGlobal", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public <T> ResponseEntity<List> getGlobal(@RequestParam Map<String, String> map) {
		List<D> domainList = new ArrayList<>();
		List<Object> list = new ArrayList<Object>();
		
		List<Example> examples = QueryParamUtil.getFirmExamples(getDomainObject());
		for (Example example : examples) {
			List<D> result = getService().findAll(example);
			if (!result.isEmpty()) {
				domainList.addAll(result);
			}
		}
		
		if (!domainList.isEmpty()) {
			for (D d : domainList) {
				list.add(binder.toBusiness(d, getBusinessObject()));
			}
		}

		return new ResponseEntity<List>(list, HttpStatus.OK);
	}
	
	private Boolean firmValidation(D d) {
		if (d instanceof FirmAware) {
			FirmAware obj = (FirmAware) d;
			return !FSContext.getFirmId().equals(obj.getFirmId());
		} else if(d instanceof Firm) {
			Firm firm = (Firm) d;
			if (FSContext.getFirmId().equals(1l)) {
				return Boolean.FALSE;
			} else {
				return !FSContext.getFirmId().equals(firm.getId());
			}
		} else {
			return Boolean.FALSE;
		}
	}
	
}