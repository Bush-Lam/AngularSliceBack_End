package dev.anthony.daos;

import dev.anthony.entities.Bill;

public interface BillDAO {
	
	// creat
	Bill createBill(Bill bill);
	
	//read
	Bill getBillById(int id);
	Bill getAllBills();
	Bill getSumAllBillsByAccount();
	Bill getAllBillsByCertainDateRange();
	Bill sortByDate();
	Bill sortByTotal();
	Bill sortByAccountId();
	
	// update
	Bill updateBill(Bill bill);
	
	

}
