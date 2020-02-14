package dev.slice.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.slice.entities.Food;
import dev.slice.repositories.FooditemRepo;

@Component
@Service
public class FooditemServiceImpl  implements FooditemService{
	@Autowired
	FooditemRepo fir;
	
	
	@Override
	public Food createFood(Food food) {
		food = this.fir.save(food);
		return food;
	}

	@Override
	public Food getFoodById(int id) {
		Food food = this.fir.getFoodById(id);
		return food;
	}

	@Override
	public Food getFoodByName(String name) {
		Food food = this.fir.getFoodByName(name);
		return food;
	}

	@Override
	public Set<Food> getAllFoodByType(String type) {
		Set<Food> foods = this.fir.getAllFoodByType(type); 
		return foods;
	}

	@Override
	public Set<Food> getAllFood() {
		Set<Food> foods = this.fir.getAllFood();
		return foods;
	}

	@Override
	public Food updateFood(Food food) {
		food = this.fir.updateFood(food);
		return food;
	}

	@Override
	public boolean deleteFood(Food food) {
		this.fir.delete(food);
		return true;
	}

}
