package com.tcs.oops.encapsulation.constructor;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Investor i1=new Investor();
	    //System.out.println(i1);
	    
	    Investor i1=new Investor(101,"John Doe","Anna Salai,Chennai",200000);
	    System.out.println(i1.getAmount());

	    Investor i2=new Investor(101,"John Doe","Anna Salai,Chennai",200000);
	    System.out.println(i2.getAmount());
	    
	    boolean res=i1.equals(i2);
	    System.out.println(res);
	    System.out.println(i1.equals(i2));
	}

}
