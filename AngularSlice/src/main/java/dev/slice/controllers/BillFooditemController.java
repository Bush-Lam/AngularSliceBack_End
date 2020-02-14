package dev.slice.controllers;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.slice.entities.BillFoodItem;
import dev.slice.services.BillFooditemService;
import dev.slice.services.BillFooditemServiceImpl;

@Component
@Controller
public class BillFooditemController {

	@Autowired
	BillFooditemService as;

	@ResponseBody
	@RequestMapping(value = "/BillFooditems", method = RequestMethod.POST)
	public BillFoodItem createBillFooditem(@RequestBody BillFoodItem billfooditem) {
		return as.createBillFooditem(billfooditem);
	}

	@ResponseBody
	@RequestMapping(value = "/BillFooditems/query", method = RequestMethod.GET)
	public BillFoodItem getBillFooditemByBillId(@RequestParam int bid) {
		System.out.println(bid);
		return as.getBillFooditemByBillId(bid);

	}

	@ResponseBody
	@RequestMapping(value = "/BillFooditems", method = RequestMethod.GET)
	public Set<BillFoodItem> getAllBillFooditems() {
		return as.getAllBillFooditems();
	}

	@ResponseBody
	@RequestMapping(value = "/BillFooditems", method = RequestMethod.PUT)
	public BillFoodItem updateBillFooditem(@RequestBody BillFoodItem billfooditem) {
		return as.updateBillFooditem(billfooditem);
	}

	@ResponseBody
	@RequestMapping(value = "/BillFooditems/{bid}", method = RequestMethod.DELETE)
	public boolean deleteBillFooditem(@PathVariable int bid) {
		as.deleteBillFooditem(as.getBillFooditemByBillId(bid));
		return true;
	}

	
}