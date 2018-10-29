package com.hai.Threads;

public class SynchronizedTest implements Runnable {

	private int number = 100;
	private Object obj = new Object();

	@Override
	public void run() {
		// �̰߳�ȫ������
		// synchronized ��סһ������ �߳�ͬ�����
		// ��Ҫ��������ͬһ������Ŷ
		while (true) {
			synchronized (obj) { //���߳�t1����֮��������ס���������߳̽��������ڶ����߳̽���������ס
				if (number > 0) {

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ ":�۳���" + (number--) + "��Ʊ");
				}
			}
		}

	}

}
