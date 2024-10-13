package com.fs.to;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleTo {
	
	@JsonProperty("roleId")
	@JsonAlias("id")
	private Long id;
	
	@JsonProperty("name")
	private String name;
	
	/*
	 * @JsonProperty("menus") private List<MenusTo> menus;
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public List<MenusTo> getMenus() { return menus; }
	 * 
	 * public void setMenus(List<MenusTo> menus) { this.menus = menus; }
	 */
}
