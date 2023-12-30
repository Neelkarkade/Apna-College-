package com.webapp.entity;

import javax.persistence.*;

@Entity
@Table(name="registration")
public class Registration {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="name",length = 45)
	private String name;
		
	@Column(name ="city",length = 45)
	private String city;

	@Column(name ="email",unique = true,  length = 128)
	private String email;

	@Column(name = "mobile")
	private long mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
   
}
