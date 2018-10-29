package com.hai.Threads;

public class LockTestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LockTest ls=new LockTest();
		
		Thread t1=new Thread(ls,"大海");
		Thread t2=new Thread(ls,"小海");
		Thread t3=new Thread(ls,"豆得儿");
		
		t1.start();
		t2.start();
		t3.start();
    
		
	}

}
