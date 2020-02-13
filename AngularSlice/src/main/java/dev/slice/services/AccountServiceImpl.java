package dev.slice.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import dev.slice.entities.Account;
import dev.slice.repositories.AccountRepo;

public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepo ar;
	
	@Override
	public Account createAccount(Account account) {
		ar.save(account);
		return account;
	}

	@Override
	public Set<Account> getAllAccounts() {
		Set<Account> accounts = new HashSet<Account>((Collection<? extends Account>) ar.findAll());
		return accounts;
	}

	@Override
	public Account getAccountById(int id) {
		return ar.findById(id).get();
	}

	@Override
	public boolean deleteAccount(Account account) {
		ar.delete(account);
		return true;
	}

	@Override
	public Account updateAccount(Account account) {
		account = ar.save(account);
		return account;
	}

}
