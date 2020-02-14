package dev.slice.services;

import java.util.Set;

import dev.slice.entities.Food;

public interface FooditemService {

	//Create
	public Food createFood(Food food);
	
	//Read
	public Food getFoodById(int id);
	public Food getFoodByName(String name);
	public Set<Food> getAllFoodByType(String type);
	public Set<Food> getAllFood();
	
	//Update
	public Food updateFood(Food food);
	
	//Delete
	public boolean deleteFood(Food food);
}
