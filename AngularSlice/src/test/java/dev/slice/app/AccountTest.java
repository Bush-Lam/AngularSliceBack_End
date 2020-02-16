package dev.slice.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import dev.slice.entities.Account;
import dev.slice.repositories.AccountRepo;
import dev.slice.services.AccountServiceImpl;

@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AccountTest {

	@Autowired
	AccountRepo ar;
// WORKS
//	@Test
//	@Commit
//	@Order(1)
//	void addAccount() {
//		Account a = new Account();
//		a.setUsername("test");
//		a.setPassword("pass");
//		a.setEmail("test");
//		a.setFname("test");
//		a.setLname("test");
//		a.setIsManager(false);
//		ar.save(a);
//		System.out.println(a);
//	
//		
//	}
//	WORKS
//	@Test
//	@Rollback
//	@Order(2)
//	void getAllAccounts() {
//		//AccountServiceImpl asi = new AccountServiceImpl();
//		List<Account> acs = (List<Account>)ar.findAll();
//		System.out.println(acs);
//	}
	
//	WORKS
//	@Test
//	@Commit
//	@Order(3)
//	void updateAccount() {
//		Account a = new Account();
//		a.setAid(8);
//		a.setUsername("test2");
//		a.setPassword("pass2");
//		a.setEmail("test2");
//		a.setFname("test2");
//		a.setLname("test2");
//		a.setIsManager(false);
//		ar.save(a);
//	}
//	WORKS	
//	@Test
//	@Commit
//	@Order(4)
//	void deleteAccount() {
//		ar.deleteById(9);
//	}
//	WORKS
//	@Test
//	@Commit
//	@Order(5)
//	void getAccountById() {
//		System.out.println(ar.findById(6));
//	}


}
