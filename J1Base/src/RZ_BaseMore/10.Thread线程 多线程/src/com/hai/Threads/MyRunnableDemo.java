package com.hai.Threads;

public class MyRunnableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		
        Thread t1=new Thread(mr, "��");
        Thread t2=new Thread(mr, "С��");
        Thread t3=new Thread(mr, "���ö�");
        
        t1.start();
        t2.start();
        t3.start();
	}

}
