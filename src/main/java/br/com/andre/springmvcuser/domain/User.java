package br.com.andre.springmvcuser.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {

	private Integer id;
	private String username;
	private String password;
	private boolean is_enabled;
	private Date register_date;
	private String name;
	private String surname;
	private String email;
	private String phone;

	
	
	public User() {
		super();
	}
	
	public User(String username, String password, boolean is_enabled, Date register_date, String name,
			String surname, String email, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.is_enabled = is_enabled;
		this.register_date = register_date;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
	}

	public User(Integer id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getIs_enabled() {
		return is_enabled;
	}

	public void setIs_enabled(boolean is_enabled) {
		this.is_enabled = is_enabled;
	}

	public Date getRegister_date() {
		return register_date;
	}
	
	public String getRegisterDateBR() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(register_date);
	}

	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", is_enabled=" + is_enabled
				+ ", register_date=" + register_date + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	

}
