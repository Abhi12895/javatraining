package com.tcs.training;

public class TestTypesVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int c =0;
		if(a<10)
			c=a+b;
		if(a>=10)
			c=a-b;
			
		System.out.println(c);
		
		boolean result = a>b && a>c ;
		System.out.println(result);
		
		//false and true are boolean literals,literals can be used as like 10,20.
		result = false == false;
		result = false == result;
		result =!true;
		boolean flag=true;
		if(flag = true)//a=10 for int and double it gives errors
			System.out.println(flag);
		else
			System.out.println(flag);
		if(a>=0)
			System.out.println("positive");
		else
			System.out.println("negative");
		
		int total=400,subjects=6;
		int z=total/subjects;
		if(z>90) {
			System.out.println("A+");
		}
		else if(z>80) {
			System.out.println("A");
		}
		else if(z>70) {
			System.out.println("B");
		}
		else if(z>50) {
			System.out.println("C");
		}
		else  {
			System.out.println("Fail");
		}
			

	}
   
}
