package com.lens.springio.self.catmarks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cat {
	
	@JsonIgnore
	@ManyToOne
	private User user;
	
	@Id
	@GeneratedValue
	private long id;
	
	public Cat(){
		
	}
	
	public String name;
	public int age;
	public String sex;
	public String description;

	public Cat(User user, String name, int age, String sex, String description) {
		this.user = user;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.description = description;
	}

	public long getId(){
		return id;
	}
	
	public User getUser() {
		return user;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public String getDescription() {
		return description;
	}
	
	
	
}
