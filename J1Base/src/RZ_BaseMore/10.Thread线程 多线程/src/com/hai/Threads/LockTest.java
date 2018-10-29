package com.hai.Threads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {
	private int number = 100;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			// 开始锁 为防止锁住的代码出现异常导致无法释放锁 加上 try finally
			try {
				lock.lock();
				if (number > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "售出第"
							+ (number--) + "张票");
				}
			} finally {
				// 释放锁
				lock.unlock();
			}
		}

	}

}
