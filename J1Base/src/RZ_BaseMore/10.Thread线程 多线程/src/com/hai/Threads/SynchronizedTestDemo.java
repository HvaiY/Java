package com.hai.Threads;

public class SynchronizedTestDemo {
	public static void main(String[] args) {
		// ��Ʊ100 �ŵ����� ����������Ʊ ��ʹ�ù������� ���߳� �����������������ݣ�
		SynchronizedTest st = new SynchronizedTest();

		Thread t1 = new Thread(st, "����һ");
		Thread t2 = new Thread(st, "���ڶ�");
		Thread t3 = new Thread(st, "������");

		t1.start();
		t2.start();
		t3.start();
	}
}
