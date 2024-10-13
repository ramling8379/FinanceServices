package com.fs.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "FSROLE", uniqueConstraints = @UniqueConstraint(columnNames = { "name", "id"}))
public class Role implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6817801229782697802L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Name")
	private String name;
	
	/*
	 * @ManyToMany(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "roles_menus", joinColumns = @JoinColumn(name = "role_id",
	 * referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name =
	 * "menus_id", referencedColumnName = "id")) private List<Menus> menus;
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
	 * public List<Menus> getMenus() { return menus; }
	 * 
	 * public void setMenus(List<Menus> menus) { this.menus = menus; }
	 */
	
	

}
