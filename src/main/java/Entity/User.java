package com.ltts.Flightproject.model;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	 @Id
	private String email;
	private String name;
	private String gen;
	private String mobile;
	private String addr;
	private LocalDate dob;
	private String role;
	private String img;
	
	public User() {
		super();
	}

	public User(String email, String name, String gen, String mobile, String addr, LocalDate dob, String role,
			String img) {
		super();
		this.email = email;
		this.name = name;
		this.gen = gen;
		this.mobile = mobile;
		this.addr = addr;
		this.dob = dob;
		this.role = role;
		this.img = img;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", gen=" + gen + ", mobile=" + mobile + ", addr=" + addr
				+ ", dob=" + dob + ", role=" + role + ", img=" + img + "]";
	}
	
	
	

	
	
}
