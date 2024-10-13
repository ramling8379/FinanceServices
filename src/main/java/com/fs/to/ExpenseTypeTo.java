package com.fs.to;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fs.to.base.BaseTo;

public class ExpenseTypeTo extends BaseTo{
	
	@NotNull(message="ExpenseType should not be null.")
	@NotEmpty(message="ExpenseType should not be empty.")
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("expenseTypeId")
	@JsonAlias("id")
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
