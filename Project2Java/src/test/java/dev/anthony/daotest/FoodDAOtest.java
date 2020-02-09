package dev.anthony.daotest;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import dev.anthony.daos.AccountDAO;
import dev.anthony.daos.AccountDAOHibernate;
import dev.anthony.daos.FoodDAO;
import dev.anthony.daos.FoodDAOHibernate;
import dev.anthony.entities.Account;
import dev.anthony.entities.Bill;
import dev.anthony.entities.BillFoodItem;
import dev.anthony.entities.Food;

public class FoodDAOtest {

public static FoodDAO fooddathib = new FoodDAOHibernate();
	
	@Test
	public void CreatFoodtest() {
		 Set<BillFoodItem> setbill = new HashSet<BillFoodItem>(); 
		 Food fd = new Food(1,"Peperoni Piza",12,300,setbill);
		 fooddathib.createFooditem(fd);
		
		 System.out.println("Creat food Successful ");
		
	}
	@Test
	public void getfoodByIdtest() {
		  
		 int fid =3;
		Food food = fooddathib.getFooditemById(fid);
		 System.out.println("Testing getAcctById "+ food);

}
	
//	@Test
//	public void getfoodByNametest() {
//		  
//		 String fname ="Peperoni Piza";
//		Food food = acctdaohib.getfoodByname(fname);
//		 System.out.println("Testing getAcctById "+ food);
//
//}
	@Test
	public void updateAccttest() {
		  
		 Set<BillFoodItem> setbill = new HashSet<BillFoodItem>(); 
		 Food acct = new Food(1,"Peperoni Piza",12,350,setbill);
		 Food acctt = fooddathib.updateFooditem(acct);
		 System.out.println(acctt);
	
	}
	

}


