package dev.slice.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Bill_Fooditem")
public class BillFoodItem {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="bill_fooditem_id")
	private int billfooditemid;
    
	@Column(name ="amount")
	private int amount;
	
    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "b_id") // foreign key
	private Bill bill;

    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "f_id") // foreign key 
	private Food food;

	public BillFoodItem() {
		super();
	}

	public BillFoodItem(int amount, Bill bill, Food food) {
		super();
		this.amount = amount;
		this.bill = bill;
		this.food = food;
	}
	
    public int getBillfooditemid() {
		return billfooditemid;
	}

	public void setBillfooditemid(int billfooditemid) {
		this.billfooditemid = billfooditemid;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "BillFoodItem [billfooditemid=" + billfooditemid + ", amount=" + amount + ", bill=" + bill + ", food="
				+ food + "]";
	}

}
