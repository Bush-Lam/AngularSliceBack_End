package dev.anthony.daos;

import java.util.List;

import dev.anthony.entities.Account;

public interface AccountDAO {
	
	// create
	Account CreateAccount(Account account);
	
	// read
	Account getAccountById(int id);
	Account getAccountByPassword(String password);
	List<Account> getAllAccounts();
	
	// update
	Account updateAccount(Account account);
	
	// delete
	boolean deleteAccount(Account account);
	

}
