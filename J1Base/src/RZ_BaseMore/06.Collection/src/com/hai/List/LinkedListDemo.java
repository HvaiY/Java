package com.hai.List;

import java.util.LinkedList;

/*LinkedList :  List 子类
 *    特有功能：
 *        public void addFirst(E e); 添加元素到集合第一个位置
 *        public void addLast(E e);添加到集合的末尾，意义不大 和add一样效果
 *        获取元元素
 *          public E getFirst();获取第一个元素
 *          public E getLast()；获取最后一个元素
 *        移除元素
 *           public E removeFirst(); 移除第一个元素并返回
 *           public E removeLast();移除最后一个元素并返回  
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
	    linkedList.addLast("最后的"); //其实是和add一样的效果，
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
