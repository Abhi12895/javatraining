package com.tcs.inheritence2;

public class ICICIMasterCreditCard extends Card {
   
	public ICICIMasterCreditCard() {
	  super();
   }

	public ICICIMasterCreditCard(int cardNo, int cvv, int pin, String expiry, String name, double amount) {
		super(cardNo, cvv, pin, expiry, name, amount);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean swipe(double transactionAmount) {
		//first get the balance from the account based on card number of the customer
		//update account balance with transaction amount
		System.out.println("Transaction successfulfrom ICICI");	
			return true;
	}
   
}
