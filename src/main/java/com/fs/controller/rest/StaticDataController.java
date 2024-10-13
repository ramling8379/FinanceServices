package com.fs.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fs.pojo.StateCity;
import com.fs.repos.StateCityRepo;

@Controller
@RequestMapping("/staticData")
public class StaticDataController {

	@Autowired
	private StateCityRepo repo;

	@RequestMapping(path = "/getStateAndCities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StateCity> getStatesAndCities() {
		return repo.findAll();
	}

}
