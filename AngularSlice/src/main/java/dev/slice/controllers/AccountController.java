package dev.slice.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.foltz.pojo.LoginObject;
import dev.slice.entities.Account;
import dev.slice.entities.Bill;
import dev.slice.services.AccountService;

@Component
@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {

	@Autowired
	AccountService as;
	
	@ResponseBody
	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public Account createAccount(@RequestBody Account account) {
		Account temp = as.getAccountByUsername(account.getUsername(), account.getPassword());
		if(temp == null) {
			return as.createAccount(account);
		}else {
			return null;
		}
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
	public Account getAccountById(@PathVariable int id) {
		return as.getAccountById(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public List<Account> getAllAccounts(){
		return as.getAllAccounts();
	}
	
	@ResponseBody
	@RequestMapping(value = "/account/bills", method = RequestMethod.GET)
	public List<Bill> getAllBillsByAccountId(@RequestParam int id){
		return as.getAllBillsByAccountId(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/account/{id}")
	public boolean deleteAccount(@PathVariable int id) {
		return (boolean)(as.deleteAccount(as.getAccountById(id)));
	}
	
	@ResponseBody
	@RequestMapping(value = "/account", method = RequestMethod.PUT)
	public Account updateAccount(@RequestBody Account account) {
		return as.updateAccount(account);
	}
	
	@ResponseBody
	@RequestMapping(value = "/account/login", method = RequestMethod.POST)
	public Account getAccountByUsername(@RequestBody Account account) {
		System.out.println("Account Controller" + account.getUsername() +"-----"+ account.getPassword());
		return as.getAccountByUsername(account.getUsername(), account.getPassword());
	}
}
