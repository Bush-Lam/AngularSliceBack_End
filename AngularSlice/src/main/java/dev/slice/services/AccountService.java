package dev.slice.services;

import java.util.Set;

import dev.slice.entities.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	
	public Set<Account> getAllAccounts();
	
	public Account getAccountById(int id);
	
	public boolean deleteAccount(Account account);
	
	public Account updateAccount(Account account);



}
