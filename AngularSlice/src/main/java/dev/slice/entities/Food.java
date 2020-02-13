package dev.slice.entities;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fooditem")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="f_id")
	private int foodID;
	
	@Column(name ="foodType")
	private String foodType;
	
	@Column(name ="description")
	private String description;
	
	@Column(name ="name")
	private String name;
	
	@Column(name = "price")
	private int  price;
	
	@Column(name = "calories")
	private int calories;

	public int getFoodID() {
		return foodID;
	}

	public Food() {
		super();
	}

	public Food(int foodID, String foodType, String description, String name, int price, int calories) {
		super();
		this.foodID = foodID;
		this.foodType = foodType;
		this.description = description;
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Food [foodID=" + foodID + ", foodType=" + foodType + ", description=" + description + ", name=" + name
				+ ", price=" + price + ", calories=" + calories + "]";
	}
	
}
