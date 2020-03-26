package dev.anthony.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="s_user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="u_id")
    private int u_id;
	
    @Column(name="username")
	private String username;
	
    @Column(name="password")
	private String password;
	
    @Column(name="f_name")
	private String F_name;
	
    @Column(name="l_name")
	private String L_name;
	
//    @Column(name="SchoolEmail")
//	private String School_Email;
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Event> event = new HashSet<Event>();
	

	public Users() {
		super();
	}


	public Users(int u_id, String username, String password, String f_name, String l_name, String school_Email,
			Set<Event> event) {
		super();
		this.u_id = u_id;
		this.username = username;
		this.password = password;
		F_name = f_name;
		L_name = l_name;
//		School_Email = school_Email;
		this.event = event;
	}


	public int getU_id() {
		return u_id;
	}


	public void setU_id(int u_id) {
		this.u_id = u_id;
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


	public String getF_name() {
		return F_name;
	}


	public void setF_name(String f_name) {
		F_name = f_name;
	}


	public String getL_name() {
		return L_name;
	}


	public void setL_name(String l_name) {
		L_name = l_name;
	}


//	public String getSchool_Email() {
//		return School_Email;
//	}
//
//
//	public void setSchool_Email(String school_Email) {
//		School_Email = school_Email;
//	}


	public Set<Event> getEvent() {
		return event;
	}


	public void setEvent(Set<Event> event) {
		this.event = event;
	}

}
