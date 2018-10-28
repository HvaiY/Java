package com.hai.�̳߳�;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadGetSumDemo {

	/**
	 * @param args
	 * @throws Exception
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException,
			Exception {
		// �����̳߳ض���
		ExecutorService p1 = Executors.newFixedThreadPool(2);

		// �ύ��ִ�У��̲߳��õ���ط��صķ�װֵ
		Future<Integer> s1 = p1.submit(new ThreadGetSum(100));
		Future<Integer> s2 = p1.submit(new ThreadGetSum(200));
		// �����̳߳�
		p1.shutdown();
		// ��ȡ�߳�ִ�к�õ��Ľ��
		Integer i1 = s1.get();
		Integer i2 = s2.get();

		System.out.println(i1);
		System.out.println(i2);
	}

}
