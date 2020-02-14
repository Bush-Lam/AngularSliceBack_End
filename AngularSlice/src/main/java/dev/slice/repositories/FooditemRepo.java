package dev.slice.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.slice.entities.Food;

@Repository
public interface FooditemRepo extends CrudRepository<Food,Integer>{

	   // create
		Food createFood(Food food);
	
		// read
		Food getFoodById(int id);
		Set<Food> getAllFood();
		Food getFoodByName(String name);
		Set<Food> getAllFoodByType(String type);
//		Set<Food> sortByCalories();
//		Set<Food> sortByPrice();
//		Set<Food> sortByType();
	
		// update
		Food updateFood(Food food);
		
		// delete - probably don't need it, but will have it in case
		boolean deleteFood(Food food);
}
