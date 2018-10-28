package com.hai.生产者与消费者;

public class Thread通讯Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student();
      //使用构造函数 ，那么两个线程使用的是同一个student对象 ，同时锁住的也是同一个对象
		SetThread st = new SetThread(s); //可以看做时生产者
		GetThread gt = new GetThread(s);//可以看做时消费者  
		
		//生产者与消费者之间的关系（需要数据 如果没有就等待，并通知生产者，生产者取消等待，生产后并通知消费者）
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		t1.start();
		t2.start();

	}

}
