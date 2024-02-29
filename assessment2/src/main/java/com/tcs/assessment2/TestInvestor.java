package com.tcs.assessment2;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInvestor {

	public static void main(String[] args) {
		Configuration configure=new Configuration();
		configure=configure.configure();
		
		SessionFactory factory=configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session=factory.openSession();
		System.out.println(session);
		
		Transaction transaction =session.beginTransaction();
		
		Investor inv=new Investor( "abc", "chennai", 50000);
		Investor inv1=new Investor("abcd", "hyderabad", 60000);
		Investor inv2=new Investor( "dfg", "pune", 70000);
		Investor inv3=new Investor("oiu", "mumbai", 80000);
		Investor inv4=new Investor("rty", "kolkata", 90000);
		
		
		session.save(inv);
		session.save(inv1);
		session.save(inv2);
		session.save(inv3);
		session.save(inv4);
		
		transaction.commit();
		session.close();
		
		Query<Investor> query=session.createQuery("select i from Investor i");//striking means outdated
		 List <Investor> list=query.list();
		 Iterator <Investor>iter =list.iterator();
		 
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
		 
		
		

	}

}
