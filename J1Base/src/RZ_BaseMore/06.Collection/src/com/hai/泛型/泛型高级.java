package com.hai.����;

import java.util.ArrayList;
import java.util.Collection;

public class ���͸߼� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ͨ��� ���Ϻ����µ��޶�
       //ʹ��һ������������
		//�Ƿ���ʹ�ü��� ���ߵ�������Ҫһ�²Ų�����
		Collection<Object> c1=new ArrayList<Object>();
		Collection<Animals> c2=new ArrayList<Animals>();
//		Collection<Object> c3=new ArrayList<Dog>();
//		Collection<Object> c4=new ArrayList<Cat>();
		// ? ʹ��ͨ���
		Collection<?> c5=new ArrayList<Object>();
		Collection<?> c6=new ArrayList<Animals>();
		Collection<?> c7=new ArrayList<Dog>();
		Collection<?> c8=new ArrayList<Cat>();
		
		// ? extends E �����޶� �޶�ΪE ��E������
		Collection<? extends Object> c9=new ArrayList<Animals>();
		Collection<? extends Animals> c10=new ArrayList<Animals>();
		Collection<? extends Animals> c11=new ArrayList<Dog>();
		Collection<? extends Animals> c12=new ArrayList<Cat>();
		
		//�� super E �����޶� �޶���E����E�ĸ��
		Collection<? super Animals> c15=new ArrayList<Object>();
		Collection<? super Animals> c13=new ArrayList<Animals>();
//		Collection<? super Animals> c14=new ArrayList<Dog>();
//		Collection<? super Animals> c16=new ArrayList<Cat>();
	}

}
 class Animals{ 
 }
 class Dog extends Animals{}
 class Cat extends Animals{}
