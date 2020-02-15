package dev.slice.services;

import java.util.Set;

import dev.slice.entities.BillFoodItem;

public interface BillFooditemService {
	// create
	BillFoodItem createBillFooditem(BillFoodItem billfooditem);
		
	// read
	BillFoodItem getBillFooditemByBillId(int bid);
	Set<BillFoodItem> getAllBillFooditems();
		
	// update
	BillFoodItem updateBillFooditem(BillFoodItem billfooditem);
		
	// delete
	boolean deleteBillFooditem(BillFoodItem billfooditem);

}