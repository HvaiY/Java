package com.hai.����;

public class ReflectDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		//��ȡClass���� (�ֽ����ļ�����)
		
		//����һ
		   Person p=new Person();
		   Class p1 = p.getClass();
		   
		   //������ 
		   Class c1=   Person.class;
		   
		   //��ʽ�� 
		    Class c2=  Class.forName("com.hai.����.Person");
		    
		    System.out.println(p1==c1);
		    System.out.println(c1==c2);
       
	}

}
