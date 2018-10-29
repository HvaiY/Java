package com.hai.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAllFunctionDemo {

	/**
	 * boolean addAll(Collection c);添加一个集合元素 
	 * boolean removeAll(Collection c);移除一个集合元素 只要移除集合中的一个就返回true 
	 * boolean containsAll(Collection c);判断是否包含指定的集合元素 只有包含第二个集合的所有才返回true 
	 * boolean retainAll(Collection c);两个集合都有的元素 //假设有两个集合A ,B
		//A对B做交集，返回的结果存储在A中 B不变
		//返回只是A是否发生改变，如改变了则返回true
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("aa1");
		c1.add("aa2");
		c1.add("aa3");
		c1.add("aa4");
		// 第二个集合 c2
		Collection c2 = new ArrayList();
		c2.add("aa4");
		c2.add("aa5");
		c2.add("aa6");
		c2.add("aa7");
		// //往集合中添加一个集合
		// System.out.println("addAll"+c1.addAll(c2));
		// System.out.println(c1);
		// // removeAll 只要能成功移除集合中的一个元素就返回true
		// System.out.println(c1.removeAll(c2));
		// System.out.println(c1);
//		//包含判断是否包含指定的集合元素 只有包含第二个集合的所有才返回true 
//		 System.out.println("包含集合："+c1.containsAll(c2));
		
		
		//假设有两个集合A ,B
		//A对B做交集，返回的结果存储在A中 B不变
		//返回只是A是否发生改变，如改变了则返回true
		System.out.println(c1.retainAll(c2));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("----------------");
		
		Collection c3 = new ArrayList();
		c3.add("aa1");
		c3.add("aa2");
		c3.add("aa3");
		c3.add("aa4");
		// 第二个集合 c2
		Collection c4 = new ArrayList();
//		c4.add("aa1");
//		c4.add("aa2");
//		c4.add("aa3");
		c4.add("aa4");
		c4.add("aa5");
		c4.add("aa6");
		c4.add("aa7");
		System.out.println(c3.retainAll(c4));
		System.out.println(c3);
		System.out.println(c4);
		
    
	}

}
