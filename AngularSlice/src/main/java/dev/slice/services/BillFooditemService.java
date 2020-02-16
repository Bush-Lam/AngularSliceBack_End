package dev.slice.services;

import java.util.List;
import java.util.Set;

import dev.slice.entities.BillFoodItem;

public interface BillFooditemService {
	// create
	BillFoodItem createBillFooditem(BillFoodItem billfooditem);
		
	// read
	BillFoodItem getBillFooditemByBillFooditemId(int bfiid);
	Set<BillFoodItem> getAllBillFooditems();
	List<BillFoodItem> getBillFooditemsByBillId(int bid);
	
	// update
	BillFoodItem updateBillFooditem(BillFoodItem billfooditem);
		
	// delete
	boolean deleteBillFooditem(BillFoodItem billfooditem);

}