package com.hai.Threads;

public class MyThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �������̵߳ķ�ʽ һ
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();

		mt1.setName("��");
		mt2.setName("С��");
		mt3.setName("���ö�");
		//�����߳�  ����˯һ��  Thread.sleep(1000);  
//		mt1.stop();//�ж��߳� �����ѹ�ʱ ���ж��̺߳󣬺���Ͳ�ִ����
//		mt1.notify();//�ж��߳�  ʹ����� 
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
