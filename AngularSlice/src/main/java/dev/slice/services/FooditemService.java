package dev.slice.services;

import java.util.List;

import dev.slice.entities.Food;

public interface FooditemService {

	//Create
	public Food createFood(Food food);
	
	//Read
	public Food getFoodById(int id);
	public Food getFoodByName(String name);
	public List<Food> getAllFoodByType(String type);
	public List<Food> getAllFood();
	
	//Update
	public Food updateFood(Food food);
	
	//Delete
	//public boolean deleteFood(Food food);
}
