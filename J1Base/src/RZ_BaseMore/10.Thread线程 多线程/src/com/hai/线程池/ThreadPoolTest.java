package com.hai.�̳߳�;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// �߳��� ����  ע�⣺������
		//����һ���߳�����Ϊ2���̳߳�
	     ExecutorService nftp = Executors.newFixedThreadPool(2);
	     //ִ���߳�  ֻ�ܹ�ִ������Ŷ 
        nftp.submit(new MyRunnable());
        nftp.submit(new MyRunnable());
        //�����̳߳� ���������ٻ����߳���Դ��
        nftp.shutdown();
        
        //��ʽ�� ��Ҳ�� ���̵߳ĵ����ַ�ʽ ��Ҫ�������̳߳� �������з���ֵŶ
        
        ExecutorService p2 = Executors.newFixedThreadPool(2);
        p2.submit(new MyCallable());//����ִ���߳��� call()�����з���ֵ�Ļ�Ҳ�ǿ��Է������ݵ�Ŷ
        p2.submit(new MyCallable());
        p2.shutdown();
	}

}
