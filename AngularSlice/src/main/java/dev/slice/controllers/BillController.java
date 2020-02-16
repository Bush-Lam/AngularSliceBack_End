package dev.slice.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.slice.entities.Bill;
import dev.slice.services.BillService;

@Component
@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class BillController {
	
	@Autowired
	BillService bs;
	
	@ResponseBody
	@RequestMapping(value="/Bill",method = RequestMethod.POST)
	public Bill creatBill(@RequestBody Bill bill) {
		return bs.CreatBill(bill);
}
	@ResponseBody
	@RequestMapping(value="/Bill/{bid}", method=RequestMethod.GET)
	public Bill getBillbyId(@PathVariable int bid) {
		return bs.getBillById(bid);
	}
	@ResponseBody
	@RequestMapping(value = "/Bill", method = RequestMethod.GET)
	public Set<Bill>getAllBill(){
		return bs.getAllBills();
	}
	@ResponseBody
	@RequestMapping(value = "/Bill",method = RequestMethod.PUT)
	public Bill updateBill(@RequestBody Bill bill) {
		return bs.updateBill(bill);
	}
	@ResponseBody
	@RequestMapping(value ="/Bill/{bid}", method = RequestMethod.DELETE)
	public boolean deleteBill(@PathVariable int bid) {
		bs.deleteBill(bs.getBillById(bid));
		return true;
	}
}
