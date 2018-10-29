package com.hai.Threads;

public class MyThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 开启多线程的方式 一
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();

		mt1.setName("大海");
		mt2.setName("小海");
		mt3.setName("豆得儿");
		//开启线程  可以睡一下  Thread.sleep(1000);  
//		mt1.stop();//中断线程 但是已过时 ，中断线程后，后面就不执行了
//		mt1.notify();//中断线程  使用这个 
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
