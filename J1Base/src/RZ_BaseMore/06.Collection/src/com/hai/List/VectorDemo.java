package com.hai.List;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector Ҳ��list�Ӽ��� 
 *  ���й��ܣ�
 *     ���Ԫ�أ�
 *     public void addElement(Object obj)
 *     ��ȡԪ�أ�
 *     public Object elementAt(int index)
 *     public Enumeration elements()
 * */
public class VectorDemo {
  public static void main(String[] args) {
	  Vector vector = new Vector();
	  vector.addElement("Hello"); //Ҳ���Ǻ��汻add�����
	  vector.addElement("World"); 
	  vector.addElement("Java"); 
	  
	  for (int i = 0; i < vector.size(); i++) {
		String s=(String) vector.elementAt(i); //----get���
		System.out.println(s);
	}
	  System.out.println("------------------------------");
	   Enumeration elements = vector.elements(); //�൱�� Itertor()��������
	  while(elements.hasMoreElements()){
		  
		  String s=(String) elements.nextElement();
			System.out.println(s);
	  }
}
}
