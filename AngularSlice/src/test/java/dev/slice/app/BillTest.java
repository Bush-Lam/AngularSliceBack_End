package dev.slice.app;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.sun.jna.platform.win32.Advapi32Util.Account;

import dev.slice.entities.Bill;
import dev.slice.repositories.AccountRepo;
import dev.slice.repositories.BillRepo;

@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BillTest {

	@Autowired
	BillRepo br;
	AccountRepo ar;
	
	@Test
	@Commit
	@Order(1)
	void addBill() {

		Bill b= new Bill();
		b.setbId(1);
		b.setTotal(20);
		b.setOrderDate("2020-02-13 04:07:03");
		b.setAccount(ar.findById(1).get());
		
		
	}

}
