package dev.slice.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.slice.entities.Account;
import dev.slice.services.AccountService;

@Component
@Controller
public class AccountController {

	@Autowired
	AccountService as;
	
	@ResponseBody
	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public Account createAccount(@RequestBody Account account) {
		return as.createAccount(account);
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
	@RequestMapping(value = "/account/{id}")
	public boolean deleteAccount(@PathVariable int id) {
		return (boolean)(as.deleteAccount(as.getAccountById(id)));
	}
	
	@ResponseBody
	@RequestMapping(value = "/account", method = RequestMethod.PUT)
	public Account updateAccount(@RequestBody Account account) {
		return as.updateAccount(account);
	}
}
