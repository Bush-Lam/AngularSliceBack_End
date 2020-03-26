package dev.anthony.services;

import java.util.List;

import dev.anthony.entities.Event;
import dev.anthony.entities.Users;

public interface UserServices {

	// Using implementing the CRUD
	
	 Users createUser(Users usr);
	
     List<Users> getallUsers();
	 List<Event> getallEventsByUserId(int id);
	
	 Users getUserById(int id);
	
	 Users getUserBylogin(String username, String password);
	
	 boolean deleteUser(Users usr);
	
	 Users UpdateUserInfo(Users usr);
}
