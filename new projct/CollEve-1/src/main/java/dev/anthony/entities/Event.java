package dev.anthony.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="e_id")
	private int e_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "u_id")
	private Users user;
	
	@Column(name ="e_name")
	private String E_name;
	
	@Column(name ="e_location")
	private String E_location;
	
	@Column(name ="e_time")
	private String E_time;
	
	@Column(name ="pic")
	private String E_pic;
	
	@Column(name ="Additional_info")
	private String E_AddInfo;
	
	public Event() {
		super();
	}

	public Event(int e_id, Users user, String e_name, String e_location, String e_time, String e_pic, String e_AddInfo) {
		super();
		this.e_id = e_id;
		this.user = user;
		E_name = e_name;
		E_location = e_location;
		E_time = e_time;
		E_pic = e_pic;
		E_AddInfo = e_AddInfo;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return E_name;
	}

	public void setE_name(String e_name) {
		E_name = e_name;
	}

	public String getE_location() {
		return E_location;
	}

	public void setE_location(String e_location) {
		E_location = e_location;
	}

	public String getE_time() {
		return E_time;
	}

	public void setE_time(String e_time) {
		E_time = e_time;
	}

	public String getE_pic() {
		return E_pic;
	}

	public void setE_pic(String e_pic) {
		E_pic = e_pic;
	}

	public String getE_AddInfo() {
		return E_AddInfo;
	}

	public void setE_AddInfo(String e_AddInfo) {
		E_AddInfo = e_AddInfo;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	
}
