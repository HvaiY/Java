package com.hai.Threads;

public class SynchronizedTest implements Runnable {

	private int number = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		// 线程安全问题解决
		// synchronized 锁住一个对象 线程同步解决
		// 需要锁定的是同一个对象哦
		while (true) {
			synchronized (obj) { //当线程t1进来之后立马锁住，其它的线程进不来，第二个线程进来再再锁住
				if (number > 0) {

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ ":售出第" + (number--) + "张票");
				}
			}
		}

	}

}
