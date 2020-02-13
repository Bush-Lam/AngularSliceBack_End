package dev.slice.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.slice.entities.Food;

@Repository
public interface FooditemRepo extends CrudRepository<Food,Integer>{

	   // creat
//		Food createFooditem(Food food);
//		
//		// read
//		Food getFooditemById(int id);
//		Set<Food> getAllFooditems();
//		Food getFooditemByName(String name);
//		Set<Food> sortByCalories();
//		Set<Food> sortByPrice();
//		Set<Food> sortByType();
//		// update
//		Food updateFooditem(Food food);
		
		// delete - probably dont want this
//		boolean deleteFooditem(Food account);
}
