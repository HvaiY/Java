package com.hai.List;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector 也是list子集合 
 *  特有功能：
 *     添加元素：
 *     public void addElement(Object obj)
 *     获取元素：
 *     public Object elementAt(int index)
 *     public Enumeration elements()
 * */
public class VectorDemo {
  public static void main(String[] args) {
	  Vector vector = new Vector();
	  vector.addElement("Hello"); //也就是后面被add替代了
	  vector.addElement("World"); 
	  vector.addElement("Java"); 
	  
	  for (int i = 0; i < vector.size(); i++) {
		String s=(String) vector.elementAt(i); //----get替代
		System.out.println(s);
	}
	  System.out.println("------------------------------");
	   Enumeration elements = vector.elements(); //相当于 Itertor()迭代方法
	  while(elements.hasMoreElements()){
		  
		  String s=(String) elements.nextElement();
			System.out.println(s);
	  }
}
}
