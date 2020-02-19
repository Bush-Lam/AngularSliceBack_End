package dev.slice.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.slice.entities.Account;
import dev.slice.entities.Bill;
import dev.slice.entities.BillFoodItem;
import dev.slice.repositories.AccountRepo;
import dev.slice.repositories.BillRepo;

@Component
@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepo ar;
	
	@Autowired
	BillRepo br;
	
	@Override
	public Account createAccount(Account account) {
		ar.save(account);
		return account;
	}

	@Override
	public List<Account> getAllAccounts() {
		List<Account> accounts = (List<Account>)ar.findAll(); 
				//new ArrayList<Account>((Collection<? extends Account>) ar.findAll());
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

	@Override
	public Account getAccountByUsername(String username, String password) {
		Account account = ar.findByUsername(username);
		if(account == null) {
			return null;
		}else if(account.getPassword() == password){			
			return account;
		}else {
			return null;
		}
	}
	
	public List<Bill> getAllBillsByAccountId(int id) {
		
		List<Bill> bills = new ArrayList<Bill>((Collection<? extends Bill>) br.findAll());
		List<Bill> billsbyaccount = new ArrayList<Bill>();
		
		for (int i = 0; i < bills.size(); i++) {
			if (bills.get(i).getAccount().getAid() == id) {
				billsbyaccount.add(bills.get(i));
			}
		}
		return billsbyaccount;

	}

}
