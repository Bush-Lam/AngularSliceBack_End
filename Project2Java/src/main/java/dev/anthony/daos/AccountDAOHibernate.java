package dev.anthony.daos;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.anthony.entities.Account;
import dev.anthony.util.HibernateUtil;

public class AccountDAOHibernate implements AccountDAO {
	
	private SessionFactory sf = HibernateUtil.getSessionFactory();

	public Account createAccount(Account account) {
		try {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.save(account);
		sess.getTransaction().commit();
		sess.close();
		sf.close();}
		catch(HibernateException exception){
		     System.out.println("Problem creating session factory");
		     exception.printStackTrace();
		}
		return account;
	}

	public Account getAccountById(int id) {
		Session sess = sf.openSession();
		Account account = sess.get(Account.class, id);
		sess.close();
		return account;
	}

	public Account getAccountByPassword(String password) {
		Session sess = sf.openSession();
		Account account = sess.get(Account.class, password);
		sess.close();
		return account;
	}

	public Account updateAccount(Account account) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.update(account);
		
		sess.getTransaction().commit();
		sess.clear();
				return account;
	}

	public boolean deleteAccount(Account account) {
		Session sess =sf.openSession();
		sess.beginTransaction();
		sess.delete(account);
		sess.getTransaction().commit();
		sess.close();
		return true;
	}

	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
