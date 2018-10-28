package com.hai.Threads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {
	private int number = 100;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			// ��ʼ�� Ϊ��ֹ��ס�Ĵ�������쳣�����޷��ͷ��� ���� try finally
			try {
				lock.lock();
				if (number > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "�۳���"
							+ (number--) + "��Ʊ");
				}
			} finally {
				// �ͷ���
				lock.unlock();
			}
		}

	}

}
