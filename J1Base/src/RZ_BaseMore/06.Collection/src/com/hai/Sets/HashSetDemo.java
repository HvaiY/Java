package com.hai.Sets;

import java.util.HashSet;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//hashSet ��set���ϵ�����ʵ�ֶ��󣬾߱�����Ԫ�ز��ظ�����һ����������
		//���ڿ�ʼ�÷����� 
		HashSet<Dog> hashSet = new HashSet<Dog>();
		  Dog dog1 = new Dog("κ����", 28, 'Ů', "��ɫ");
		  Dog dog2 = new Dog("κ����", 29, 'Ů', "��ɫ");
		  Dog dog3= new Dog("�ͫ|", 27, 'Ů', "��ɫ");
		  Dog dog4 = new Dog("�ͫ|", 27, '��', "��ɫ");
		  Dog dog7= new Dog("�ͫ|", 27, 'Ů', "��ɫ");
		  Dog dog8 = new Dog("�ͫ|", 27, '��', "��ɫ");
		  Dog dog5= new Dog("κ����", 28, '��', "��ɫ");
		  Dog dog6 = new Dog("κ����", 28, 'Ů', "��ɫ");
		  
		  //����дhashCode��equals ���� ����ʱ����Ӷ��󵽼��ϲ�������ظ�
		  hashSet.add(dog1);
		  hashSet.add(dog2);
		  hashSet.add(dog3);
		  hashSet.add(dog4);
		  hashSet.add(dog5);
		  hashSet.add(dog6);
		  hashSet.add(dog7);
		  hashSet.add(dog8);
		  
		 //ʹ����ǿforѭ���������� // hashSet ��Setһ�� ���������
		  for(Dog d:hashSet){
			  System.out.println(d);//���ձ�����������5����
			  
		  }

	}

}
