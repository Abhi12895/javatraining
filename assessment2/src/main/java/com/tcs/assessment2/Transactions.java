package com.tcs.assessment2;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transactions {
   
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 int tid;
	 int investorId;
     String tranDate;
     double tranAmount;
	  
	  public Transactions() {
		// TODO Auto-generated constructor stub
	  }
	  
	  

	public Transactions( int investorId, String tranDate, double tranAmount) {
		super();
		this.investorId = investorId;
		this.tranDate = tranDate;
		this.tranAmount = tranAmount;
	}

    

	public int getTid() {
		return tid;
	}



	public void setTid(int tid) {
		this.tid = tid;
	}



	public int getInvestorId() {
		return investorId;
	}



	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}



	public String getTranDate() {
		return tranDate;
	}



	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}



	public double getTranAmount() {
		return tranAmount;
	}



	public void setTranAmount(double tranAmount) {
		this.tranAmount = tranAmount;
	}



	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", investorId=" + investorId + ", tranDate=" + tranDate + ", tranAmount="
				+ tranAmount + "]";
	}
	  
	  
}

	