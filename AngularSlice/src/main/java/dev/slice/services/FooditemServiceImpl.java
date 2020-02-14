package dev.slice.services;

import java.util.List;
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
		Food food = this.fir.findById(id).get();
		return food;
	}

	@Override
	public Food getFoodByName(String name) {
		Food food = this.fir.findByName(name);
		return food;
	}

	@Override
	public List<Food> getAllFoodByType(String type) {
		List<Food> foods = this.fir.findByFoodType(type); 
		return foods;
	}

	@Override
	public List<Food> getAllFood() {
		List<Food> foods = (List<Food>) this.fir.findAll();
		return foods;
	}

	@Override
	public Food updateFood(Food food) {
		System.out.println(food);
		food = fir.save(food);
		System.out.println(food);
		return food;
	}

//	@Override
//	public boolean deleteFood(Food food) {
//		this.fir.delete(food);
//		return true;
//	}

}
