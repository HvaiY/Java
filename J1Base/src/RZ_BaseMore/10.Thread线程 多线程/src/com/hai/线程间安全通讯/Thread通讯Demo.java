package com.hai.线程间安全通讯;

public class Thread通讯Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student();
      //使用构造函数 ，那么两个线程使用的是同一个student对象 ，同时锁住的也是同一个对象
		SetThread st = new SetThread(s); //可以看做时生产者
		GetThread gt = new GetThread(s);//可以看做时消费者  
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		t1.start();
		t2.start();

	}

}
