package dev.anthony.daos;

import dev.anthony.entities.Account;

public interface AccountDAO {
	
	// create
	Account CreatAccount(Account account);
	
	// read
	Account getAccountById(int id);
	Account getAccountByPassword(String password);
	
	// update
	Account updateAccount(Account account);
	
	// delete
	boolean ddeleteAccount(Account account);
	

}
