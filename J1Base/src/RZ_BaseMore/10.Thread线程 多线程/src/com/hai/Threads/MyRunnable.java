package com.hai.Threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// �����ǽӿ� ��ȡ�̵߳�����Ϊ��ʽ
			String name = Thread.currentThread().getName();
			System.out.println(name+":"+i);
		}

	}

}
