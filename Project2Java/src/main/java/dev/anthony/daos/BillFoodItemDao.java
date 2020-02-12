package dev.anthony.daos;

import dev.anthony.entities.BillFoodItem;

public interface BillFoodItemDao {
	// creat
	BillFoodItem createBillFooditem(BillFoodItem billfooditem);
		
	// read
	BillFoodItem getBillFooditemId(int bid);
	BillFoodItem getAllBillFooditemsByBillId(int bid);
		
	// update
	BillFoodItem updateBillFooditem(BillFoodItem billfooditem);
		
	// delete
	boolean deleteBillFooditem(BillFoodItem billfooditem);

}
