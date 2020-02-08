package dev.anthony.daos;

import dev.anthony.entities.Bill;

public interface BillDAO {
	
	// creat
	Bill createBill(Bill bill);
	
	//read
	Bill getBillById(int id);
	
	// update
	Bill updateBill(Bill bill);
	
	

}
