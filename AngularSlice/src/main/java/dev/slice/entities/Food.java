package dev.slice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fooditem")
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
	private double price;
	
	@Column(name = "calories")
	private int calories;
	
	@Column(name = "url")
	private String url;

	//Constructors
	public Food() {
		super();
	}

	public Food(int foodID, String foodType, String description, String name, double price, int calories, String url) {
		super();
		this.foodID = foodID;
		this.foodType = foodType;
		this.description = description;
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.url = url;
	}

	//Getters and Setters
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

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getFoodID() {
		return foodID;
	}
	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	//toString
	@Override
	public String toString() {
		return "Food [foodID=" + foodID + ", foodType=" + foodType + ", description=" + description + ", name=" + name
				+ ", price=" + price + ", calories=" + calories + ", url=" + url + "]";
	}

}
