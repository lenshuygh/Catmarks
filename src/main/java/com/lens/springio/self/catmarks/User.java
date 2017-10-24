package com.lens.springio.self.catmarks;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
	@OneToMany(mappedBy = "user")
	private Set<Cat> cats = new HashSet<>();
	
	@Id
	@GeneratedValue
	private long id;
	
	public String userName;
	@JsonIgnore
	public String password;
	
	public User(String userName,String password){
		this.userName = userName;
		this.password = password;
	}
	
	public User(){
		
	}

	public Set<Cat> getCats(){
		return cats;
	}
	
	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	
}
