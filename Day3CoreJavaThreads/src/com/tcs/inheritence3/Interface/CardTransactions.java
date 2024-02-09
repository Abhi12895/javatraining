package com.tcs.inheritence3.Interface;

public class CardTransactions {

	public static void main(String[] args) {
		
		CardIface iface=null;
		iface =new HDFCVisaDebitCard(12345678,919,4536,"03/25","John Doe",500000);
		iface.swipe(120009);
		HDFCVisaDebitCard hdfc= (HDFCVisaDebitCard)iface;
		iface= new ICICIMasterCreditCard(32323232, 999, 4545, "02/27", "Jane Doe", 200000);
		iface.swipe(120656);
	
		//Downcasting/narrowing needs explicit cast operation
        ICICIMasterCreditCard icici=(ICICIMasterCreditCard) iface;
        hdfc.swipe(45678);
        icici.swipe(45678);
		
		
//		Card card=null;
//		card =new HDFCVisaDebitCard(12345678,919,4536,"03/25","John Doe",500000);
//		card.swipe(15000);
//		card =new ICICIMasterCreditCard(32323232, 999, 4545, "02/27", "Jane Doe", 200000);
//		card.swipe(1234);
		
		
		/*HDFCVisaDebitCard hdfc =new HDFCVisaDebitCard(12345678,919,4536,"03/25","John Doe",500000);//static binding
		
		System.out.println(hdfc);
		
		
		ICICIMasterCreditCard icici = new ICICIMasterCreditCard(32323232, 999, 4545, "02/27", "Jane Doe", 200000);
		
		hdfc.swipe(10000);
		icici.swipe(2300);
		
		Card card =new HDFCVisaDebitCard(12345678,919,4536,"03/25","John Doe",500000);//dynamic binding
		card.swipe(764456);
		
		card =new ICICIMasterCreditCard(32323232, 999, 4545, "02/27", "Jane Doe", 200000);
		card.swipe(98766);*/
		

	}

}
