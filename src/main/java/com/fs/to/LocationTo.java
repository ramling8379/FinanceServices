package com.fs.to;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fs.to.base.BaseTo;
@Validated
public class LocationTo extends BaseTo{
	
	@JsonProperty("locationId")
	@JsonAlias("id")
	private Long id;

	@JsonProperty("state")
	private String state;

	@JsonProperty("district")
	private String district;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("name")
	private String name;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
}
