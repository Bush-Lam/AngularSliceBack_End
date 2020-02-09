package dev.anthony.daos;



import dev.anthony.entities.Food;

public interface FoodDAO {
	
	   // creat
		Food createFooditem(Food food);
		
		// read
		Food getFooditemById(int id);
		Food getFooditemByName(String name);
		
		// update
		Food updateFooditem(Food food);
		
		// delete
		boolean deleteFooditem(Food account);

}
