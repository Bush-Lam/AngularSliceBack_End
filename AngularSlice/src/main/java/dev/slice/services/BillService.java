package dev.slice.services;

import java.util.Set;

import dev.slice.entities.Bill;

public interface BillService {

	 Bill CreatBill(Bill bill);
	 
	 Bill getBillById(int id);
	 
	 Set<Bill> getAllBills();
	 
	 Bill updateBill(Bill bill);
	 
	 boolean deleteBill(Bill bill);
}
