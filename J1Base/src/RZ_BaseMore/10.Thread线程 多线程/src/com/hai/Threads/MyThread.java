package com.hai.Threads;

public class MyThread extends Thread {
	@Override
	public void run() {
		// ���̷߳�ʽһ����
		for (int i = 0; i < 100; i++) {
		//	getName();//��ȡ�߳�����
           System.out.println(getName()+":"+i);
		}
	}
}
