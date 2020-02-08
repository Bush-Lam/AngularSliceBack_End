package dev.anthony.daos;

import dev.anthony.entities.BillFoodItem;

public interface BillFoodItemDao {
	// creat
	BillFoodItem CreatAccount(BillFoodItem billFI);
		
	// read
	BillFoodItem getAccountByBillId(int bid);
	BillFoodItem getAccountByFoodId(int fid);
		
	// update
	BillFoodItem updateAccount(BillFoodItem account);
		
	// delete
	boolean ddeleteAccount(BillFoodItem account);

}
