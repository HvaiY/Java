package com.hai.����ģʽ;

public class ����ģʽ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//���� ģʽ  ����ģʽ ����ʹ��  jdk ��runtime ����ʹ�õ�  ����ģʽ
		Student s1=Student.getStudent();
		Student s2=Student.getStudent();
       System.out.println(s1==s2);//��ͬһ������Ŷ
       
       //����ģʽ   ����ģʽ  ����ʹ�� 
          // ���߳� ��ȫ����
       // �ӳټ��أ���������
       //  
       Teacher t1=Teacher.getTeacher();
       Teacher t2=Teacher.getTeacher();
	   System.out.println(t1==t2);//��ͬһ������ ���ص���true
	}
}
