package com.tcs.Collections;

import java.util.TreeSet;

public class TestCollections2 {

	public static void main(String[] args) {
		
		Investor i1=new Investor(1, "abc", "shares", "chennai", 50000);
		Investor i2=new Investor(2, "xyz", "bonds", "hyd", 75000);
		Investor i3=new Investor(3, "pqr", "deposits", "pune", 80000);
		Investor i4=new Investor(4, "mnp", "shares", "delhi", 4000);
		Investor i5=new Investor(5, "ijk", "bonds", "mumbai", 345678);
		Investor i6=new Investor(5, "ijk", "bonds", "mumbai", 345678);
		Investor i7=i6;
		
		
	    TreeSet<Investor>set=new TreeSet<>();
	    set.add(i7);
		set.add(i1);
		set.add(i2);
		set.add(i3);
		set.add(i4);
		set.add(i5);
		set.add(i6);
		set.add(i7);
		
		
		System.out.println(set);
		System.out.println(set.size());
	
		
		
	}

}
