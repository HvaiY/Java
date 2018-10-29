package com.hai.生产者与消费者;

public class SetThread extends Thread {
	private Student s;
	private int num = 0;

	public SetThread(Student s) {

		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (s.flag) {
					// 如果没有数据，线程等待 并设置数据 之后取消等待
					try {
						s.wait();// 线程等待并释放锁
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				// 为了线程安全需要锁住一个对象 那么 对象需要与之同一个，那么这里是用s

				if (num % 2 == 0) {
					s.name = "大海";
					s.age = 27;

				} else {

					s.name = "豆得儿";
					s.age = 26;
				}
				num++;

				// 设置为有数据并取消等待
				s.flag = true;
				s.notify();
			}

		}
	}
}
