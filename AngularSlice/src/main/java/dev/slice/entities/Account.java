package dev.slice.entities;

import java.util.HashSet;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="a_id")
	private int aid;
	
	@Column(name ="username")
	private String Username;
	
	@Column(name ="password")
	private String password;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="f_name")
	private String fname;
	
	@Column(name ="l_name")
	private String lname;
	
	@Column(name ="isManager")
	private int isManager;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy ="account", cascade = CascadeType.ALL, orphanRemoval = true) // look for the account obj in bill, should match
	private Set<Bill> setofbills = new HashSet<Bill>();
	

	public Account() {
		super();
	}


	public Account(int aid, String username, String password, String email, String fname, String lname, int isManager) {
		super();
		this.aid = aid;
		Username = username;
		this.password = password;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.isManager = isManager;
	}


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public int getIsManager() {
		return isManager;
	}


	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}


	public Set<Bill> getBills() {
		return setofbills;
	}


	public void setBills(Set<Bill> bills) {
		this.setofbills = bills;
	}


	@Override
	public String toString() {
		return "Account [aid=" + aid + ", Username=" + Username + ", password=" + password + ", email=" + email
				+ ", fname=" + fname + ", lname=" + lname + ", isManager=" + isManager +"]";
	} 
	
	
}
