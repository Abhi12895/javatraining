package com.tcs.Collections;

import java.util.ArrayList;

public class Investor implements Comparable<Investor>{
  
     int id;
     String name,instrument,address;
     double amount;
     
     public Investor() {
		// TODO Auto-generated constructor stub
	}

	public Investor(int id, String name, String instrument, String address, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.instrument = instrument;
		this.address = address;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", instrument=" + instrument + ", address=" + address
				+ ", amount=" + amount + "]";
	}

	@Override
	public int compareTo(Investor o) {
		//if a <b return-1, a>b return 1 ,a==b return 0
		if(this.id <o.getId())return -1;
		else if(this.id>o.getId())return 1;
		return 0;
	}
	
	

	
	
	
    
	
}
