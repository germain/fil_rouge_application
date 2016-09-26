package fr.dta.mediatheque.application.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import fr.dta.mediatheque.application.core.Model;

@Entity
public class Usr implements Model{

	private static final long serialVersionUID = -2885009665185962268L;

	@Id
	@GeneratedValue
//	@SequenceGenerator(name="seq_usr", sequenceName="seq_usr",allocationSize=1)
	private int id;
	
	private String login;
	private String password;
	private String firstname;
	private String lastname;
	private String rules;
	
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
	}
	public String getLogin() {		return login;	}
	public void setLogin(String login) {		this.login = login;	}
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}
	public String getFirstname() {		return firstname;	}
	public void setFirstname(String firstname) {		this.firstname = firstname;	}
	public String getLastname() {		return lastname;	}
	public void setLastname(String lastname) {		this.lastname = lastname;	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}


}
