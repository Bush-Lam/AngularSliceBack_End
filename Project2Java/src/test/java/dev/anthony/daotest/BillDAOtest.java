package dev.anthony.daotest;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import dev.anthony.daos.AccountDAO;
import dev.anthony.daos.AccountDAOHibernate;
import dev.anthony.daos.BillDAO;
import dev.anthony.daos.BillDAOHibernate;
import dev.anthony.entities.Bill;
import dev.anthony.entities.BillFoodItem;

public class BillDAOtest {

	public static BillDAO acctdaohib= new BillDAOHibernate();
	public static AccountDAO acctdaohib2= new AccountDAOHibernate();
	@Test
	public void CreatBilltest() {
		Set<BillFoodItem> setbill = new HashSet<BillFoodItem>(); 
		
		Bill b= new Bill(0,acctdaohib2.getAccountById(3),12,"2020-02-07",setbill);
		acctdaohib.createBill(b);
		
		 System.out.println(b);
		
	}
	@Test
	public void getBillByIdtest() {
		  
		 int id =2;
		Bill b = acctdaohib.getBillById(id);
		
		 System.out.println("Testing getbillById "+ b);

}

	@Test
	public void updateAccttest() {
		  
   Set<BillFoodItem> setbill = new HashSet<BillFoodItem>(); 
		
		Bill b= new Bill(2,acctdaohib2.getAccountById(1),50,"2020-02-05 00:00:00",setbill);
		acctdaohib.createBill(b);
		
		 System.out.println(b);
	
	}
	

}
