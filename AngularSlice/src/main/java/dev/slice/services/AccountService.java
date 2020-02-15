package dev.slice.services;

import java.util.List;

import dev.slice.entities.Account;

public interface AccountService {

	public Account createAccount(Account account);
	
	public List<Account> getAllAccounts();
	
	public Account getAccountById(int id);
	
	public boolean deleteAccount(Account account);
	
	public Account updateAccount(Account account);
}
