package com.hai.��������������;

public class GetThread extends Thread {
	private Student s;

	public GetThread(Student s) {

		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
			//��������� �����̵߳ȴ�  ��ȡ�����ݺ� ȡ���ȴ�
			if(!s.flag){
				try {
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
				System.out.println(s.name + "----" + s.age);
				
				//�����߳�
				s.notify();
				s.flag=false;
				
			}
			
		}
	}
}
