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
@Table(name = "Fooditem")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="f_id")
	private int foodID;
	
	@Column(name ="name")
	private String name;
	
	@Column(name = "price")
	private int  price;
	
	@Column(name = "calories")
	private int calories;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy ="food")
//	private Set<BillFoodItem> setofbillfooditems = new HashSet<BillFoodItem>();

	public Food() {
		super();
	}

	

	public Food(int foodID, String name, int price, int calories) {
		super();
		this.foodID = foodID;
		this.name = name;
		this.price = price;
		this.calories = calories;

	}



	public int getFoodID() {
		return foodID;
	}



	public void setFoodID(int foodID) {
		this.foodID = foodID;
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



//	public Set<BillFoodItem> getBillOfFood() {
//		return setofbillfooditems;
//	}
//
//
//
//	public void setBillOfFood(Set<BillFoodItem> billOfFood) {
//		this.setofbillfooditems = billOfFood;
//	}



	@Override
	public String toString() {
		return "Food [foodID=" + foodID + ", name=" + name + ", price=" + price + ", calories=" + calories
				+  "]";
	}



	
	
}
