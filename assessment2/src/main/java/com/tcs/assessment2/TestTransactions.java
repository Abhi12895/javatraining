package com.tcs.assessment2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestTransactions {

	public static void main(String[] args) {
		
		Configuration configure=new Configuration();
		configure=configure.configure();
		
		SessionFactory factory=configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session=factory.openSession();
		System.out.println(session);
		
		Transaction transaction =session.beginTransaction();
		
		Investor i1;
        i1=session.get(Investor.class,1);
		Transactions t1=new Transactions(i1.getId(),"feb-23", 4356);
		session.save(t1);
		if(t1.getTranAmount()<=i1.getAmount()) {
			System.out.println("Transaction Sucessfull");
			i1.setAmount(i1.getAmount()-t1.getTranAmount());
			session.update(i1);
			System.out.println("Available balance after transaction is "+i1.getAmount());
		}
		else {
			System.out.println("Transaction UnSucessfull");
			System.out.println("your available balance is "+i1.getAmount());
			Transactions t=session.get(Transactions.class,1);
		    session.delete(t);
		}
		
		
		i1=session.get(Investor.class,2);
		Transactions t2=new Transactions(i1.getId(),"feb-24", 4346);
		session.save(t2);
		if(t2.getTranAmount()<=i1.getAmount()) {
			System.out.println("Transaction Sucessfull");
			i1.setAmount(i1.getAmount()-t2.getTranAmount());
			session.update(i1);
			System.out.println("Available balance after transaction is "+i1.getAmount());
		}
		else {
			System.out.println("Transaction UnSucessfull");
			System.out.println("your available balance is "+i1.getAmount());
			Transactions t=session.get(Transactions.class,2);
		    session.delete(t);
		}
		
		
		i1=session.get(Investor.class,3);
		Transactions t3=new Transactions(i1.getId(),"feb-25", 9356);
		session.save(t3);
		if(t3.getTranAmount()<=i1.getAmount()) {
			System.out.println("Transaction Sucessfull");
			i1.setAmount(i1.getAmount()-t3.getTranAmount());
			session.update(i1);
			System.out.println("Available balance after transaction is "+i1.getAmount());
		}
		else {
			System.out.println("Transaction UnSucessfull");
			System.out.println("your available balance is "+i1.getAmount());
			Transactions t=session.get(Transactions.class,3);
		    session.delete(t);
		}
		
		
		i1=session.get(Investor.class,4);
		Transactions t4=new Transactions(i1.getId(),"feb-26", 4455);
		session.save(t4);
		if(t4.getTranAmount()<=i1.getAmount()) {
			System.out.println("Transaction Sucessfull");
			i1.setAmount(i1.getAmount()-t4.getTranAmount());
			session.update(i1);
			System.out.println("Available balance after transaction is "+i1.getAmount());
		}
		else {
			System.out.println("Transaction UnSucessfull");
			System.out.println("your available balance is "+i1.getAmount());
			Transactions t=session.get(Transactions.class,4);
		    session.delete(t);
		}
		
		
		i1=session.get(Investor.class,5);
		Transactions t5=new Transactions(i1.getId(),"feb-27", 2355);
		session.save(t5);
		if(t5.getTranAmount()<=i1.getAmount()) {
			System.out.println("Transaction Sucessfull");
			i1.setAmount(i1.getAmount()-t5.getTranAmount());
			session.update(i1);
			System.out.println("Available balance after transaction is "+i1.getAmount());
		}
		else {
			System.out.println("Transaction UnSucessfull");
			System.out.println("your available balance is "+i1.getAmount());
			Transactions t=session.get(Transactions.class,5);
		    session.delete(t);
		}
		
		
		
		transaction.commit();
		session.close();
		
		
		
		Query<Transactions> query=session.createQuery("select i from Transactions i");//striking means outdated
		 List <Transactions> list=query.list();
		 Iterator <Transactions>iter =list.iterator();
		 
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
		

		//updtae arow in db
		/*Employee emp=session.get(Employee.class,1);
		emp.setSal(123456);
		session.update(emp);
		System.out.println(emp);*/
		
	
		//fetch a row from dB
		 /*Employee emp=session.get(Employee.class,1);
		 System.out.println(emp);*/
		

	}

}
