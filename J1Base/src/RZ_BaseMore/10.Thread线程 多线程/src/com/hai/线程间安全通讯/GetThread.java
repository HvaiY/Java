package com.hai.�̼߳䰲ȫͨѶ;

public class GetThread extends Thread {
	private Student s;

	public GetThread(Student s) {

		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				System.out.println(s.name + "----" + s.age);
			}
		}
	}
}
