package com.hai.�̼߳䰲ȫͨѶ;

public class SetThread extends Thread {
	private Student s;
	private int num = 0;

	public SetThread(Student s) {

		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			// Ϊ���̰߳�ȫ��Ҫ��סһ������ ��ô ������Ҫ��֮ͬһ������ô��������s
			synchronized (s) {
				if (num % 2 == 0) {
					s.name = "��";
					s.age = 27;

				} else {

					s.name = "���ö�";
					s.age = 26;
				}
				num++;
			}

		}
	}
}
