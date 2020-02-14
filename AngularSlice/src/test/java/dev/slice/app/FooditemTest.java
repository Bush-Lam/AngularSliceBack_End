package dev.slice.app;

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

import dev.slice.entities.Food;
import dev.slice.repositories.FooditemRepo;

@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FooditemTest {

	@Autowired
	FooditemRepo fir;
	
	@Test
	@Rollback
	@Order(1)
	void createFoodTest() {
		Food food = new Food();
		food.setName("Personal Pizza");
		food.setFoodType("Pizza");
		food.setDescription("Cheesy");
		food.setCalories(4000000);
		food.setPrice(99.98);
		food.setUrl("asdfg.com");
		
		System.out.println("\ncreateFoodTest");
		fir.save(food);
	}
	
	@Test
	@Rollback
	@Order(2)
	void getFoodByIdTest() {
		Food food = fir.findById(4).get();
		System.out.println("\ngetFoodByIdTest");
		System.out.println(food);
	}
	
	@Test
	@Rollback
	@Order(3)
	void getFoodByNameTest() {
		Food food = fir.findByName("Cheese Pizza");
		System.out.println("\ngetFoodByNameTest");
		System.out.println(food);
	}

	@Test
	@Rollback
	@Order(4)
	void getAllFoodByTypeTest() {
		List<Food> foods = fir.findByFoodType("pizza");
		System.out.println("\ngetAllFoodByTypeTest");
		System.out.println(foods);
	}
	
	@Test
	@Rollback
	@Order(5)
	void getAllFoodTest() {
		List<Food> foods = (List<Food>) fir.findAll();
		System.out.println("\ngetAllFoodTest");
		System.out.println(foods);
	}
	
	@Test
	@Commit
	@Order(6)
	void updateFoodTest() {
		Food food = fir.findById(4).get();
		System.out.println("\nupdateFoodTest");
		System.out.println("Before: " + food);
		food.setCalories(552);
		fir.save(food);
		System.out.println("After: " + food);
	}
	
//	@Test
//	@Rollback
//	@Order(7)
//	void deleteFoodTest() {
//		Food food = fir.findById(2).get();
//		System.out.println("getAllFoodTest");
//		System.out.println(food);
//		fir.delete(food);
//	}
}
