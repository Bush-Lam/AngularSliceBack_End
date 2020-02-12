package dev.anthony.daotest;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import dev.anthony.daos.AccountDAO;
import dev.anthony.daos.AccountDAOHibernate;
import dev.anthony.daos.BillDAO;
import dev.anthony.daos.BillDAOHibernate;
import dev.anthony.daos.BillFoodItemDAOHibernate;
import dev.anthony.daos.BillFoodItemDao;
import dev.anthony.daos.FoodDAO;
import dev.anthony.daos.FoodDAOHibernate;
import dev.anthony.entities.Account;
import dev.anthony.entities.Bill;
import dev.anthony.entities.BillFoodItem;

public class BillFoodItemDAOtest {

	public static BillFoodItemDao billfooditemdao = new BillFoodItemDAOHibernate();
	public static BillDAO bil= new BillDAOHibernate();
	public static FoodDAO food= new FoodDAOHibernate();
		
	@Test
	public void getAcctByBillIdtest() {
		
	     int bid=2; 
		BillFoodItem acct = billfooditemdao.getBillFooditemId(bid);
		
		 System.out.println(acct);
		
	}
	
//	@Test
//	public void getAcctByFoodIdtest() {
//		  
//		 int fid=1; 
//			BillFoodItem acct = billfooditemdao.getAccountByFoodId(fid);
//			
//			 System.out.println(acct);
//
//}
	
//	@Test
//	public void updateAccttest() {
//		int amt=4;
//		BillFoodItem newwBil= new BillFoodItem(amt,bil.getBillById(2),food.getAccountById(1));
//		BillFoodItem acctt = acctdaohib.updateAccount(newwBil);
//		 System.out.println(acctt);
//	
//	}
	
	
}
