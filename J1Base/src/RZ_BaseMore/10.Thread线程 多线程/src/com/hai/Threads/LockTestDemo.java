package com.hai.Threads;

public class LockTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LockTest ls=new LockTest();
		
		Thread t1=new Thread(ls,"��");
		Thread t2=new Thread(ls,"С��");
		Thread t3=new Thread(ls,"���ö�");
		
		t1.start();
		t2.start();
		t3.start();
    
		
	}

}
