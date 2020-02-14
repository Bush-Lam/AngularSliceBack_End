package dev.slice.app;

import java.util.Set;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import dev.slice.entities.Food;
import dev.slice.repositories.FooditemRepo;

@SpringBootTest
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
		
		System.out.println("createFoodTest");
		fir.save(food);
	}
	
	@Test
	@Rollback
	@Order(2)
	void getFoodByIdTest() {
		Food food = fir.getFoodById(4);
		System.out.println("getFoodItemByIdTest");
		System.out.println(food);
		
	}
	
	@Test
	@Rollback
	@Order(3)
	void getFoodByNameTest() {
		Food food = fir.getFoodByName("Cheese Pizza");
		System.out.println("getFoodItemByNameTest");
		System.out.println(food);
		
	}

	@Test
	@Rollback
	@Order(4)
	void getAllFoodByTypeTest() {
		Set<Food> foods = fir.getAllFoodByType("pizza");
		System.out.println("getAllFoodItemsByTypeTest");
		System.out.println(foods);
		
	}
	
	@Test
	@Rollback
	@Order(5)
	void getAllFoodTest() {
		Set<Food> foods = fir.getAllFood();
		System.out.println("getAllFoodItemsTest");
		System.out.println(foods);
		
	}
	
	@Test
	@Rollback
	@Order(6)
	void updateFoodTest() {
		Food food = fir.getFoodById(4);
		System.out.println("getAllFoodItemsTest");
		System.out.println("Before: " + food);
		food.setCalories(10000);
		fir.save(food);
		System.out.println("After: " + food);
		
	}
	
	@Test
	@Rollback
	@Order(7)
	void deleteFoodTest() {
		Food food = fir.getFoodById(2);
		System.out.println("getAllFoodItemsTest");
		System.out.println(food);
		fir.delete(food);
	}
}
