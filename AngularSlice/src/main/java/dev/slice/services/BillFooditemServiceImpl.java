package dev.slice.services;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.slice.entities.BillFoodItem;
import dev.slice.repositories.BillFooditemRepo;
import dev.slice.repositories.BillRepo;
import dev.slice.repositories.FooditemRepo;

@Component
@Service
public class BillFooditemServiceImpl implements BillFooditemService {
	
	@Autowired
	BillFooditemRepo bfir;
	@Autowired
	BillRepo br;
	@Autowired
	FooditemRepo fir;
	
	@Override
	public BillFoodItem createBillFooditem(BillFoodItem billfooditem) {
		return bfir.save(billfooditem);
	}

	@Override
	public BillFoodItem getBillFooditemByBillId(int bid) {
		System.out.println(bid);
		return bfir.findById(bid).get();
	}

	@Override
	public Set<BillFoodItem> getAllBillFooditems() {
		return new HashSet<BillFoodItem>((Collection<? extends BillFoodItem>) bfir.findAll());
	}

	@Override
	public BillFoodItem updateBillFooditem(BillFoodItem billfooditem) {
		return bfir.save(billfooditem);
	}

	@Override
	public boolean deleteBillFooditem(BillFoodItem billfooditem) {
		bfir.delete(billfooditem);
		return true;
	}
}