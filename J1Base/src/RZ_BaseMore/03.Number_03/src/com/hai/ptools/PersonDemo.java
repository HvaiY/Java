package com.hai.ptools;

public class PersonDemo {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//����һ���ˌ���
		Person p = new Person();
		//��¡һ������
		Object obj = p.clone();
		//����¡�Č���o��person�K�D�Q��person
	  Person p2=(Person)obj;
	  p2.setName("���w");
	  p2.setAge(17);
	  
	  System.out.println(p2.getName()+"  "+p2.getAge());
	}
}
