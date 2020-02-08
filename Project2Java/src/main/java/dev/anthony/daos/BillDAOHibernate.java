package dev.anthony.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.anthony.entities.Bill;
import dev.anthony.util.HibernateUtil;

public class BillDAOHibernate implements BillDAO {
	
	private SessionFactory sf= HibernateUtil.getSessionFactory();

	public Bill createBill(Bill bill) {
		
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.getTransaction().commit();
		sess.close();
		return bill;
	}

	public Bill getBillById(int id) {
		
		Session sess =sf.openSession();
		Bill bill= sess.get(Bill.class, id);
		sess.close();
		return bill;
	}

	public Bill updateBill(Bill bill) {
		Session sess =sf.openSession();
		sess.beginTransaction();
		sess.update(bill);
		
		sess.getTransaction().commit();
		sess.close();
		return bill;
	}

	
	
}
