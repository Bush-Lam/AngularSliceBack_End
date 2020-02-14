package dev.slice.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.slice.entities.Food;
import dev.slice.services.FooditemService;

@Component
@Controller
public class FooditemController {

	@Autowired
	FooditemService fis;
	
	//Create
	@ResponseBody
	@RequestMapping(value = "/food", method = RequestMethod.POST)
	public Food createFood(@RequestBody Food food) {
		return fis.createFood(food);
	}
	
	//Read
	@ResponseBody
	@RequestMapping(value = "/food", method = RequestMethod.GET)
	public List<Food> getAllFood(){
		return fis.getAllFood();
	}
	
	@ResponseBody
	@RequestMapping(value = "/food/id", method = RequestMethod.GET)
	public Food getFoodById(@RequestParam int id){
		return fis.getFoodById(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/food/name", method = RequestMethod.GET)
	public Food getFoodByName(@RequestParam String name){
		return fis.getFoodByName(name);
	}
	
	@ResponseBody
	@RequestMapping(value = "/food/type", method = RequestMethod.GET)
	public List<Food> getFoodByType(@RequestParam String type){
		return fis.getAllFoodByType(type);
	}
	
	//Update
	@ResponseBody
	@RequestMapping(value = "/food/update", method = RequestMethod.PUT)
	public Food updateFood(@RequestBody Food food){
		return fis.updateFood(food);
	}
	
//	//Delete
//	@ResponseBody
//	@RequestMapping(value = "/food/{id}", method = RequestMethod.DELETE)
//	public Boolean deleteFood(@PathVariable int id) {
//		return fis.deleteFood(fis.getFoodById(id));
//	}
}
