package com.hai.�̼߳䰲ȫͨѶ;

public class ThreadͨѶDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student();
      //ʹ�ù��캯�� ����ô�����߳�ʹ�õ���ͬһ��student���� ��ͬʱ��ס��Ҳ��ͬһ������
		SetThread st = new SetThread(s); //���Կ���ʱ������
		GetThread gt = new GetThread(s);//���Կ���ʱ������  
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);

		t1.start();
		t2.start();

	}

}
