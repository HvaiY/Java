package com.hai.线程间安全通讯;

public class SetThread extends Thread {
	private Student s;
	private int num = 0;

	public SetThread(Student s) {

		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			// 为了线程安全需要锁住一个对象 那么 对象需要与之同一个，那么这里是用s
			synchronized (s) {
				if (num % 2 == 0) {
					s.name = "大海";
					s.age = 27;

				} else {

					s.name = "豆得儿";
					s.age = 26;
				}
				num++;
			}

		}
	}
}
