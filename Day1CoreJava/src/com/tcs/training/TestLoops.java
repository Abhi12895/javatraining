package com.tcs.training;

public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1,stop=100;
		while(start<=stop) {
			System.out.println("Run="+start);
			start++;
		}
		for(start=1;start<=stop;start++) {
			System.out.println("Run="+start);
		
		}
		start=1;
		for(stop=100;start<=stop;stop--) {
			System.out.println("Run="+stop);
		
		}
		stop=100;
		for(start=1;start<=stop/2;start++) {
			System.out.println("Run="+start);
		}
		for(start=1;start<=stop/2;start+=2) {
			System.out.println("Run="+start);
		}
		for(start=1;start<=(stop/2)-((stop/2)%3);start++) {
			System.out.println(start+ ++start + ++start);
//			System.out.println(start);
		}
		int i=0;
		for(;i<=20;i++);//body is optional but for while it is necessary
		{
			System.out.println(i);
		}

	}

}
