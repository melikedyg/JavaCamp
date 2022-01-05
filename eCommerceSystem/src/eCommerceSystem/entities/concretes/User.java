package eCommerceSystem.entities.concretes;

import eCommerceSystem.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String name;
	private String surname;
	private String eMail;
	private String password;
	private boolean verify;
	
	public User() {
		
	}

	public User(String name, String surname, String eMail, String password,boolean verify) {
		
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
		this.password = password;
		this.verify=verify;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}
	
	
	

}
