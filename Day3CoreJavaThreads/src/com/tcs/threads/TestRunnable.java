package com.tcs.threads;

public class TestRunnable {

	public static void main(String[] args) {
		
		System.out.println("starting the main");
		
		MyRunnable runnable =new MyRunnable();
		
		Thread t1=new Thread(runnable);
		Thread t2=new Thread(runnable);
		
		t1.start();
		t2.start();
		
		System.out.println("exiting the main");

	}

}
