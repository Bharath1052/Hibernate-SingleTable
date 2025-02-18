package com.news;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HbUtil {
	//private static SessionFactory sf1 = null;
	public static StandardServiceRegistry registry =null;
	private static SessionFactory sf =null;
	public static SessionFactory getSessionFactory() {
		if(sf==null) {
			try {
			registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			MetadataSources mds = new MetadataSources(registry);
			Metadata md = mds.getMetadataBuilder().build();
			sf = md.getSessionFactoryBuilder().build();
		}catch(Exception e) {
			e.printStackTrace();
			if(registry!=null) {
				StandardServiceRegistryBuilder.destroy(registry);
			}
		}
		}
		return sf;
	}
}
