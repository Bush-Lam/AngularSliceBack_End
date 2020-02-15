package dev.slice.app;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import dev.slice.entities.Account;
import dev.slice.entities.Bill;
import dev.slice.entities.BillFoodItem;
import dev.slice.entities.Food;
import dev.slice.repositories.AccountRepo;
import dev.slice.repositories.BillFooditemRepo;
import dev.slice.repositories.BillRepo;
import dev.slice.repositories.FooditemRepo;
import dev.slice.services.BillFooditemService;

@SpringBootTest
//@Transactional // each test method is a transaction. It will automatically rollback any changes to the database made in a test
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BillFooditemTest {
	
	@Autowired
	BillFooditemRepo bfirepo;
	@Autowired
	FooditemRepo fir;
	@Autowired
	BillRepo br;
	@Autowired
	AccountRepo ar;
	
	@Autowired
	BillFooditemService bfis;
	
	@Test
	void AddBillFooditem() {
//		BillFoodItem bfi = new BillFoodItem(1, br.findById(1).get(), fir.findById(1).get());
//		bfirepo.save(bfi);
		System.out.println(bfirepo.findById(3).get());
	}
	
	@Test
	void getBillFooditemByBillIds() {
		System.out.println(bfis.getBillFooditemsByBillId(4));
	}
}
