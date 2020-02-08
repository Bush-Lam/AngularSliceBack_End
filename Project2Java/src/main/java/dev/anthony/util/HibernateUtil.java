package dev.anthony.util;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static SessionFactory sf = null;
	
	public static SessionFactory getSessionFactory() {
		if (sf == null) {
			Configuration cfg = new Configuration();
			sf = cfg.configure().buildSessionFactory();
		}
		return sf;
	}

}
