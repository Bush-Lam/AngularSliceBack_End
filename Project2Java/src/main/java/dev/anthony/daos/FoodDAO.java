package dev.anthony.daos;



import dev.anthony.entities.Food;

public interface FoodDAO {
	
	   // creat
		Food CreatAccount(Food food);
		
		// read
		Food getAccountById(int id);
		Food getfoodByname(String name);
		
		// update
		Food updateFoodAccount(Food food);
		
		// delete
		boolean ddeleteAccount(Food account);

}
