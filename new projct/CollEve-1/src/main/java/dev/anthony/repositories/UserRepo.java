package dev.anthony.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.anthony.entities.Users;

@Component
@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {

	// implements the CRUD 
	
	// add methods that you need thet are not already available 
	Users findByUsername(String username);
}
