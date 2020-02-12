package dev.slice.repositories;

import java.util.Set;

import org.springframework.stereotype.Repository;

import dev.slice.entities.BillFoodItem;

@Repository
public interface BillFooditemRepo {
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
