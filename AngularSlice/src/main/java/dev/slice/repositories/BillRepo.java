package dev.slice.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.slice.entities.Bill;

@Repository
public interface BillRepo extends CrudRepository<Bill,Integer>{
	
//	List<Bill>findByTotalGreaterThan(int total);
//	List<Bill>findByid(int acctId);

//	// create;
//	Bill createBill(Bill bill);
//	
//	//read
//	Bill getBillById(int id);
//	Set<Bill> getAllBills();
//	Set<Bill> getSumAllBillsByAccount();
//	Set<Bill> getAllBillsByCertainDateRange(); // do later if have time
//	Set<Bill> sortByDate();
//	Set<Bill> sortByTotal();
//	Set<Bill> sortByAccountId();
//	
//	// update
//	Bill updateBill(Bill bill);
//	
//	//delete
//	boolean deleteBill(Bill bill);
}
