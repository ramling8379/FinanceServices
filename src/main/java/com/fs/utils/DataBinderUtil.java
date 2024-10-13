package com.fs.utils;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fs.pojo.base.FirmAware;
import com.fs.to.base.BaseTo;

@Service
public class DataBinderUtil {
	
	ObjectMapper objectMapper = new ObjectMapper().configure(
			DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object toBusiness(Object domain, Class businessClass) {
		Object toObject = objectMapper.convertValue(domain, businessClass);
		if (toObject instanceof BaseTo) {
			BaseTo obj = (BaseTo) toObject;
			if (domain instanceof FirmAware) {
				FirmAware firmObject = (FirmAware) domain;
				obj.setFirmId(firmObject.getFirmId());
				return obj;
			}
		}
		return toObject;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Object toDomain(Object business, Class domainClass) {
		return objectMapper.convertValue(business, domainClass);
	}

}
