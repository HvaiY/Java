package com.hai.Threads;

public class MyRunnableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		
        Thread t1=new Thread(mr, "大海");
        Thread t2=new Thread(mr, "小海");
        Thread t3=new Thread(mr, "豆得儿");
        
        t1.start();
        t2.start();
        t3.start();
	}

}
