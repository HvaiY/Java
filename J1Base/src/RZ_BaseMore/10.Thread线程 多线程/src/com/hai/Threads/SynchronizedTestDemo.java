package com.hai.Threads;

public class SynchronizedTestDemo {
	public static void main(String[] args) {
		// 买票100 张的问题 三个窗口售票 （使用共享数据 多线程 多条语句操作共享数据）
		SynchronizedTest st = new SynchronizedTest();

		Thread t1 = new Thread(st, "窗口一");
		Thread t2 = new Thread(st, "窗口二");
		Thread t3 = new Thread(st, "窗口三");

		t1.start();
		t2.start();
		t3.start();
	}
}
