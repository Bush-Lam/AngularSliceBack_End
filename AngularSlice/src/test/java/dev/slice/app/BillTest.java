package dev.slice.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import dev.slice.entities.Bill;
import dev.slice.repositories.AccountRepo;
import dev.slice.repositories.BillRepo;

@SpringBootTest
//@Transactional
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BillTest {

	@Autowired
	BillRepo br;
	@Autowired
	AccountRepo ar;
	
	@Test
	void addBill() {

		Bill b= new Bill();
		b.setbId(1);
		b.setTotal(20);
		b.setOrderDate("2020-02-13 04:07:03");
		b.setAccount(ar.findById(1).get());
		br.save(b);
		System.out.println(b +" Has been Added");
	}
	
	@Test
	@Commit
	
	void updateBillTot() {
		
		Bill bill = br.findById(1).get();
		bill.setTotal(60);
		br.save(bill);
		System.out.println(bill+" (Tot Has been Updated)");
	}
	
	@Test
	void findById() {
		Bill bil = br.findById(1).get();
		System.out.println(bil);
	}
	
	@Test

	void findByAcctId() {
		int aid = 1;
    	Optional<Bill> bil = br.findById(aid);
		System.out.println(bil);
	}
	
//	@Test
//	@Order(4)
//	void findBytotal() {
//		
//		List<Bill> bil = br.findByTotalGreaterThan(10);
//		System.out.println(bil);
//	}

}
