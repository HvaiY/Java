package com.hai.�����߳�;

public class ThreadDemo {
	public static void main(String[] args) {
		// �����ڲ���ķ�ʽ
		/*
		 * ��ʽ�� new �������߽ӿ���(){ ��д���� } �����Ǹ�����߽ӿڵ��������
		 */

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ i);
				}
			}
		}.start();
		
		//��ʽ��  
		  new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ i);
				}
			}
		}){}.start();
	}
}
