package dev.slice.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.slice.entities.BillFoodItem;

@Repository
public interface BillFooditemRepo extends JpaRepository<BillFoodItem,Integer> {
//	// create
//	@Query("select Bill from BillFoodItem where Bill.bId = ?1")
//	List<BillFoodItem> findAllBillFooditemsByBillId(int id);
	
//	BillFoodItem createBillFooditem(BillFoodItem billfooditem);
//		
//	// read
//	BillFoodItem getBillFooditemByBillId(int bid);
//	Set<BillFoodItem> getAllBillFooditems();
//		
//	// update
//	BillFoodItem updateBillFooditem(BillFoodItem billfooditem);
//		
//	// delete
//	boolean deleteBillFooditem(BillFoodItem billfooditem);
}
