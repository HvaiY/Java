package com.hai.��������������;

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
					// ���û�����ݣ��̵߳ȴ� ���������� ֮��ȡ���ȴ�
					try {
						s.wait();// �̵߳ȴ����ͷ���
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				// Ϊ���̰߳�ȫ��Ҫ��סһ������ ��ô ������Ҫ��֮ͬһ������ô��������s

				if (num % 2 == 0) {
					s.name = "��";
					s.age = 27;

				} else {

					s.name = "���ö�";
					s.age = 26;
				}
				num++;

				// ����Ϊ�����ݲ�ȡ���ȴ�
				s.flag = true;
				s.notify();
			}

		}
	}
}
