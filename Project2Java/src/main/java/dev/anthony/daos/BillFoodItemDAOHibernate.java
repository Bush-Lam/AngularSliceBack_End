package dev.anthony.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.anthony.entities.BillFoodItem;
import dev.anthony.util.HibernateUtil;

public class BillFoodItemDAOHibernate implements BillFoodItemDao {
	
	private SessionFactory sf = HibernateUtil.getSessionFactory();

	public BillFoodItem createBillFooditem (BillFoodItem billFI) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.save(billFI);
		sess.getTransaction().commit();
		sess.close();
		return billFI;
	}

	public BillFoodItem getBillFooditemId(int bid) {
		Session sess = sf.openSession();
		BillFoodItem billFI = sess.get(BillFoodItem.class, bid);
		sess.close();
		return billFI;
	}

	public BillFoodItem getAllBillFooditemsByBillId(int bid) {
		Session sess = sf.openSession();
		BillFoodItem billFI = sess.get(BillFoodItem.class, bid);
		sess.close();
		return billFI;
	}

	public BillFoodItem updateBillFooditem(BillFoodItem amt) {
		Session sess =sf.openSession();
		sess.beginTransaction();
		sess.update(amt);
		sess.getTransaction().commit();
		sess.close();
		return amt;
	}

	public boolean deleteBillFooditem(BillFoodItem billfooditem) {
		Session sess =sf.openSession();
		sess.beginTransaction();
		sess.delete(billfooditem);
		sess.getTransaction().commit();
		sess.close();
		
		return true;
	}

}
