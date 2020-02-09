package dev.anthony.daotest;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import dev.anthony.daos.AccountDAO;
import dev.anthony.daos.AccountDAOHibernate;
import dev.anthony.entities.Account;
import dev.anthony.entities.Bill;

public class AccountDAOtest {

public static AccountDAO acctdaohib= new AccountDAOHibernate();
	
	@Test
	public void CreatAccttest() {
		 Set<Bill> setbill = new HashSet<Bill>(); 
		 Account acct = new Account(1,"61Bo","password","tpo@gmail.com","Yoe","Boe",1,setbill);
		Account acctt = acctdaohib.CreatAccount(acct);
		
		 System.out.println(acctt);
		
	}
	@Test
	public void getAcctByIdtest() {
		  
		 int id =3;
		Account acctt = acctdaohib.getAccountById(id);
		
		 System.out.println("Testing getAcctById "+ acctt);

}
	@Test
	public void getAcctByPasswordtest() {
		  
		 String password ="tb";
		Account acctt = acctdaohib.getAccountByPassword(password);
		
		 System.out.println("Testing getAcctByPassword "+ acctt);

}
	@Test
	public void updateAccttest() {
		  
		 Set<Bill> setbill = new HashSet<Bill>(); 
		 Account acct = new Account(1,"tboy2","tb2","t@gmail.com","Tom","boy",1,setbill);
		 Account acctt = acctdaohib.updateAccount(acct);
		 System.out.println(acctt);
	
	}
	
	@Test
	public void deleteAccttest() {
		 int id =7;
		 Account acctt = acctdaohib.getAccountById(id);
		 acctdaohib.ddeleteAccount(acctt);
		
		 System.out.println(acctt);
	
	}
}

