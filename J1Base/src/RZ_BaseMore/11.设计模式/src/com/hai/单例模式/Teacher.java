package com.hai.����ģʽ;

public class Teacher {

	// ����ģʽ Ϊ�˶��̰߳�ȫ���� ��Ҫ�������� �߳�ͬ��
	private Teacher() {

	}
	//һ��ʼ���������� ��ʹ�õ�ʱ�򴴽�   ����ģʽ
	private static Teacher t=null;
	// Ϊ���̰߳�ȫ��Ҫ��������ס
	public static synchronized  Teacher getTeacher(){
		
		if(t==null){
			t=new Teacher();
		}
		return t;
	}
}
