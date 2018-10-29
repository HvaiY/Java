package com.hai.List;

import java.util.ArrayList;
import java.util.Iterator;

import com.hai.Collections.PersonFull;

/*
 * List的子类特点
 *     ArrayList:
 *       底层数据结构是数组，查询快，增删慢
 *       线程不安全(线程不同步)，效率高
 *     Vector:
 *         底层数据结构是数组，查询快，增删慢
 *         线程安全(线程同步)，效率低
 *      LinkList:
 *         底层数据结构是链表，查询慢，增删快
 *         线程不安全，效率高   
 * */

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
		// 可以使用for循环遍历 这里使用迭代器了
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s);

		}
		//添加对象 这里我们用for循环遍历
     ArrayList arrayList2 = new ArrayList();
     PersonFull p1 = new PersonFull("林黛玉",22);
     PersonFull p2 = new PersonFull("刘姥姥",82);
     PersonFull p3 = new PersonFull("贾宝玉",23);
     arrayList2.add(p1);
     arrayList2.add(p2);
     arrayList2.add(p3);
     for (int i = 0; i < arrayList2.size(); i++) {
    	 PersonFull p=	(PersonFull) arrayList2.get(i);
    	 System.out.println(p.getName()+"  -------- "+p.getAge());
	}
     
   
     
	}

}
