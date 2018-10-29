package com.hai.Threads;

public class MyThread extends Thread {
	@Override
	public void run() {
		// 多线程方式一的类
		for (int i = 0; i < 100; i++) {
		//	getName();//获取线程名字
           System.out.println(getName()+":"+i);
		}
	}
}
