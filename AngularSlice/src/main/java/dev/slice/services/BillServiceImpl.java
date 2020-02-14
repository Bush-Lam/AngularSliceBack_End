package dev.slice.services;

import java.util.Collection;
import java.util.HashSet;
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
		bill = this.br.save(bill);
		return bill;
	}

	@Override
	public Bill getBillById(int id) {
		Bill bil= this.br.findById(id).get();
		return bil;
	}

	@Override
	public Set<Bill> getAllBills() {
		Set<Bill> billl= new HashSet<Bill>((Collection<? extends Bill>)br.findAll());
		return billl;
	}

	@Override
	public Bill updateBill(Bill bill) {
		bill = br.save(bill);
		return bill;
	}

	@Override
	public boolean deleteBill(Bill bill) {
		br.delete(bill);
		return true;
	}

}
