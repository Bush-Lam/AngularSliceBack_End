package dev.slice.services;

import java.util.List;

import dev.slice.entities.Account;
import dev.slice.entities.Bill;

public interface AccountService {

	public Account createAccount(Account account);
	
	public List<Account> getAllAccounts();
	public List<Bill> getAllBillsByAccountId(int id);
	
	public Account getAccountById(int id);
	
	public Account getAccountByUsername(String username, String password);
	
	public boolean deleteAccount(Account account);
	
	public Account updateAccount(Account account);
	
	
}
