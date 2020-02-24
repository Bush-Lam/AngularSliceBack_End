package dev.slice.controllers;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

import dev.slice.entities.BillFoodItem;
import dev.slice.services.BillFooditemService;
import dev.slice.services.BillFooditemServiceImpl;

@Component
@Controller
@CrossOrigin(origins = "*")
public class BillFooditemController {

	@Autowired
	BillFooditemService as;

	@ResponseBody
	@RequestMapping(value = "/billfooditems", method = RequestMethod.POST)
	public BillFoodItem createBillFooditem(@RequestBody BillFoodItem billfooditem) {
		
		return as.createBillFooditem(billfooditem);
	}

	@ResponseBody
	@RequestMapping(value = "/billfooditems/billfooditem", method = RequestMethod.GET)
	public BillFoodItem getBillFooditemByBillId(@RequestParam int bfiid) {
		System.out.println(bfiid);
		return as.getBillFooditemByBillFooditemId(bfiid);

	}

	@ResponseBody
	@RequestMapping(value = "/billfooditems/bill", method = RequestMethod.GET)
	public List<BillFoodItem> getBillFooditemByBillFooditemId(@RequestParam int bid) {
		return as.getBillFooditemsByBillId(bid);

	}
	
	@ResponseBody
	@RequestMapping(value = "/billfooditems", method = RequestMethod.GET)
	public Set<BillFoodItem> getAllBillFooditems() {
		return as.getAllBillFooditems();
	}

	@ResponseBody
	@RequestMapping(value = "/billfooditems", method = RequestMethod.PUT)
	public BillFoodItem updateBillFooditem(@RequestBody BillFoodItem billfooditem) {
		return as.updateBillFooditem(billfooditem);
	}

	@ResponseBody
	@RequestMapping(value = "/billfooditems/{bid}", method = RequestMethod.DELETE)
	public boolean deleteBillFooditem(@PathVariable int bfiid) {
		as.deleteBillFooditem(as.getBillFooditemByBillFooditemId(bfiid));
		return true;
	}

	
}