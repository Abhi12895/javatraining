package com.tcs.Collections;

import java.util.*;
import java.util.Map.Entry;

public class TestCollections3 {

	public static void main(String[] args) {
		
		HashMap<Integer,Investor> map=new HashMap<Integer, Investor>();
		
		Investor i1=new Investor(1, "abc", "shares", "chennai", 50000);
		Investor i2=new Investor(2, "xyz", "bonds", "hyd", 75000);
		Investor i3=new Investor(3, "pqr", "deposits", "pune", 80000);
		Investor i4=new Investor(4, "mnp", "shares", "delhi", 4000);
		Investor i5=new Investor(5, "ijk", "bonds", "mumbai", 345678);
		Investor i6=new Investor(5, "ijk", "bonds", "mumbai", 345678);
		Investor i7=i6;
		
		
		map.put(i5.getId(), i5);
		map.put(i4.getId(), i4);
		map.put(i2.getId(), i2);
		map.put(i3.getId(), i3);
		map.put(i1.getId(), i1);
		
		
		System.out.println(map);
		
		System.out.println(map.get(5));
		i5.setInstrument("shares");
		map.put(i5.getId(), i5);
		System.out.println(map.get(5));
		
		
		//Map views
		//key view,value view,key-value view
		
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		
		Collection<Investor> values=map.values();
		System.out.println(values);
		
		Set<Entry<Integer,Investor>> keyvalues=map.entrySet();
		System.out.println(keyvalues);
		
		Iterator<Entry<Integer,Investor>> iter=keyvalues.iterator();
		while(iter.hasNext()) {
			Entry<Integer,Investor>entry=iter.next();
			System.out.println(entry.getKey()+ "="+entry.getValue());
		}
		
		
		
		

	}

}
