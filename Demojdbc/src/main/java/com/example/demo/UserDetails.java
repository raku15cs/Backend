package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
			@Id
			private int id;
			private String name;
			private int age;
			private String city;
			private String password;
			
			
	
	public UserDetails() {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
				this.city = city;
				this.password = password;
			}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
