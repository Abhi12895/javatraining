package com.tcs.oops.encapsulation;

public class CreateInvestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Investors i1 =new Investors();
		i1.setId(101);
		i1.setName("John Doe");
		i1.setAddress("Thoripakam,chennai one");
		i1.setAmount(200000);
		
		System.out.println(i1.getId());
		System.out.println(i1.getAddress());
		
		Investors i2 =new Investors();
		i2.setId(101);
		i2.setName("John Doe");
		i2.setAddress("Pondibazar ,Chennai");
		i2.setAmount(20000);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1==i2);
		Investors i3=i1;
        i3=null;
        System.out.println(i1==i3);
        
	}

}
