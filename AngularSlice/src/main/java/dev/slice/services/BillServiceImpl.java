package dev.slice.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.slice.entities.Bill;
import dev.slice.repositories.BillRepo;

@Component
@Service
public class BillServiceImpl implements BillService {

	@Autowired
	BillRepo br;
	@Override
	public Bill CreatBill(Bill bill) {
		
		return null;
	}

	@Override
	public Bill getBillById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Bill> getAllBills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill updateBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBill(Bill bill) {
		// TODO Auto-generated method stub
		return false;
	}

}
