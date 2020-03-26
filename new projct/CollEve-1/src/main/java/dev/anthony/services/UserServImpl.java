package dev.anthony.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.anthony.entities.Event;
import dev.anthony.entities.Users;
import dev.anthony.repositories.EventRepo;
import dev.anthony.repositories.UserRepo;
@Component
@Service
public class UserServImpl implements UserServices{
	
	@Autowired
	UserRepo ur;
	@Autowired
	EventRepo er;

	@Override
	public Users createUser(Users usr) {
		this.ur.save(usr);
		return usr;
	}

	@Override
	public List<Users> getallUsers() {
		List<Users> usr= (List<Users>)ur.findAll();
		return usr;
	}

	@Override
	public List<Event> getallEventsByUserId(int id) {
		List<Event> ev= new ArrayList<Event>((Collection<? extends Event>)er.findAll());
		List<Event> event = new ArrayList<Event>();
		for(int i=0; i < ev.size(); i++) {
			if(ev.get(i).getU_id()==id) {
				event.add(ev.get(i));
			}
		}
		return event;
	}

	@Override
	public Users getUserById(int id) {
		return ur.findById(id).get();
	}

	@Override
	public Users getUserBylogin(String username, String password) {
		Users usr= ur.findByUsername(username);
		if(usr==null) {
			System.out.println("Username "+username+" Does not Exsist");
		}
		if(usr.getPassword().equals(password)) {
			return usr;
		}else {
			System.out.println("Password Does not Exsist");
		}
		return null;
		
	}

	@Override
	public boolean deleteUser(Users usr) {
		this.ur.delete(usr);
		return true;
	}

	@Override
	public Users UpdateUserInfo(Users usr) {
		usr=this.ur.save(usr);
		return usr;
	}

}
