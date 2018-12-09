package com.hai.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	/**
	 * @param args
	 * list  集合  有序的 可重复的
	 */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add("Java");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}
    //list集合除了父类的集合(Collection)功能外还具备自己特有的功能 
		//example 
      /*
       * list 特有功能
       *   A: 添加功能
       *       add(int index ,Object obj); //指定位置添加元素
       *       
       *   B:获取功能  
       *        get(int index);
       *   C:列表迭代：  ListIterator();  //list集合特有的迭代器
       *   D:删除功能 :Object remove(int index); //删除指定位置的元素，返回被修改的元素
       *   E:修改功能： Object set(int index,Object obj);
       * */	
		
		System.out.println("-----------------");
		list.add(1, "Andriod");
		System.out.println(list);//索引从零开始，往第二个位置添加了一个元素
		list.add(4,"abc");
		System.out.println(list);//往最后一个位置添加了 一个元素  success
//	list.add(6, "ssss");//超出索引界限，因此报错（中间出现一个元素跳过了）
//		System.out.println(list);
		
		System.out.println(list.get(4));//如果超出索引界限同样报错
		System.out.println(list.remove(4));//注意不要超出索引界限 ,返回被移除的元素
		Object set = list.set(2, "wwwww");//返回的是被修改的那个元素。
		System.out.println(set);
		System.out.println(list);
	}

}
