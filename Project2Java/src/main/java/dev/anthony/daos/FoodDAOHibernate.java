package dev.anthony.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dev.anthony.entities.Food;
import dev.anthony.util.HibernateUtil;

public class FoodDAOHibernate implements FoodDAO {
	
	private SessionFactory sf = HibernateUtil.getSessionFactory();

	public Food createFooditem(Food food) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.save(food);
		sess.getTransaction().commit();
		sess.close();
		return food;
	}

	public Food getFooditemById(int id) {
		Session sess = sf.openSession();
		Food food = sess.get(Food.class, id);
		sess.close();
		
		return food;
	}

	public Food getFooditemByName(String name) {
		Session sess = sf.openSession();
		Food food = sess.get(Food.class, name);
		sess.close();
		
		return food;
	}

	public Food updateFooditem(Food food) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.update(food);
		
		sess.getTransaction().commit();
		sess.close();
		return food;
	}

	public boolean deleteFooditem(Food food) {
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.delete(food);
		sess.getTransaction().commit();
		sess.close();
		return true;
	}
	

}
