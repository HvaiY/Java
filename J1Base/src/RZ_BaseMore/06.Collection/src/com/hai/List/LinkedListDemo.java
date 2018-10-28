package com.hai.List;

import java.util.LinkedList;

/*LinkedList :  List ����
 *    ���й��ܣ�
 *        public void addFirst(E e); ���Ԫ�ص����ϵ�һ��λ��
 *        public void addLast(E e);��ӵ����ϵ�ĩβ�����岻�� ��addһ��Ч��
 *        ��ȡԪԪ��
 *          public E getFirst();��ȡ��һ��Ԫ��
 *          public E getLast()����ȡ���һ��Ԫ��
 *        �Ƴ�Ԫ��
 *           public E removeFirst(); �Ƴ���һ��Ԫ�ز�����
 *           public E removeLast();�Ƴ����һ��Ԫ�ز�����  
 * 
 * */
public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  LinkedList linkedList = new LinkedList();
	    
	    linkedList.add("Hello");
	    linkedList.add("World");
	    linkedList.addLast("����"); //��ʵ�Ǻ�addһ����Ч����
	    linkedList.addFirst("Java");
	    
	    System.out.println(linkedList);
	    System.out.println(linkedList.getFirst());
	    System.out.println(linkedList.getLast());
	    
	    
	    
	    System.out.println("------------------------");
	    System.out.println(linkedList.removeLast());
	    System.out.println(linkedList.removeFirst());
	    System.out.println(linkedList);
	}

}
