package com.news;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class TPCExample {
	public static void main(String[]args) {
		Transaction tr  = null;
		System.out.println("before ses factory");
		try(Session ses=HbUtil.getSessionFactory().openSession()){
			System.out.println("after ses factory");
			tr=ses.beginTransaction();
			Employee e1=new Employee("Ramesh");
			REgEmployee e2 = new REgEmployee(5500,"Sales","Suresh");
			Trainee e3 =new Trainee("Umesh",200,"6 months");
			
			ses.persist(e1); ses.persist(e2); ses.persist(e3);
			
			tr.commit();
			ses.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
