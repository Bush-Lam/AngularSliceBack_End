package dev.anthony.app;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import dev.anthony.entities.Users;
import dev.anthony.repositories.EventRepo;
import dev.anthony.repositories.UserRepo;
import dev.anthony.services.EventServices;
import dev.anthony.services.UserServices;

@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CollEve1ApplicationTests {

	@Autowired
	UserRepo ur;
	@Autowired
	UserServices us;
	
	@Autowired
	EventRepo er;
	@Autowired
	EventServices es;
	
	
	@Test
	@Order(1)
	void getuserbyId(){
		//List<Users> allusr = (List<Users>)us.getallUsers();
		int id=2;
		Users uu= us.getUserById(id);
		System.out.println(uu);
	
	}

}
