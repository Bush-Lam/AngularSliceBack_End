package dev.anthony.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="b_id")
	private int bId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="a_id")
	private Account account;
	
	@Column(name = "total")
	private int total;
	
	@Column(name= "orderDate")
	private String orderDate;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="bill") // mappedBy - look for the bill object in billfooditem, should match
	private Set<BillFoodItem> bill = new HashSet<BillFoodItem>();
	

	public Bill() {
		super();
	}


	public Bill(int bId, Account account, int total, String orderDate, Set<BillFoodItem> bill) {
		super();
		this.bId = bId;
		this.account = account;
		this.total = total;
		this.orderDate = orderDate;
		this.bill = bill;
	}


	public int getbId() {
		return bId;
	}


	public void setbId(int bId) {
		this.bId = bId;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}


	public Set<BillFoodItem> getBill() {
		return bill;
	}


	public void setBill(Set<BillFoodItem> bill) {
		this.bill = bill;
	}


	@Override
	public String toString() {
		return "Bill [bId=" + bId + ", total=" + total + ", orderDate=" + orderDate + "]";
	}





	
	
}
