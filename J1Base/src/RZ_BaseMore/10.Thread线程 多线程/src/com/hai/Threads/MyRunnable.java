package com.hai.Threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// 这里是接口 获取线程的名称为方式
			String name = Thread.currentThread().getName();
			System.out.println(name+":"+i);
		}

	}

}
