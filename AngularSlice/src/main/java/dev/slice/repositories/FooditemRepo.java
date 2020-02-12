package dev.slice.repositories;

import java.util.Set;

import org.springframework.stereotype.Repository;

import dev.slice.entities.Food;

@Repository
public interface FooditemRepo {
	   // creat
		Food createFooditem(Food food);
		
		// read
		Food getFooditemById(int id);
		Set<Food> getAllFooditems();
		Food getFooditemByName(String name);
		Set<Food> sortByCalories();
		Set<Food> sortByPrice();
		
		// update
		Food updateFooditem(Food food);
		
		// delete - probably dont want this
//		boolean deleteFooditem(Food account);
}
