package com.hai.����ģʽ;

public class Student {
	// ����ģʽ ����  ��һ���Ӿ�����һ������
	// 1.���캯�� ˽�л� ������޷�ʵ��������(�����)
	private Student() {

	}

	// �ڲ���һ��˽�ж��� ������������
	private static Student s = new Student();
	
	//����һ����̬���� ���ض���
	
	public static Student getStudent(){
		
		return s;
	}

}
