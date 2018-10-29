package com.hai.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionBLDemo {

	/**
	 * @param args
	 * 集合的遍历，依次获取集合的元素
	 *  1.转为数组后遍历数组，相当于遍历了集合
	 *  2. Iterator 使用迭代  迭代器是因集合而生，没有集合，迭代器没有任何意义
	 */
	public static void main(String[] args) {
		//创建集合对象
		Collection c=new ArrayList();
        //添加元素
		c.add("Hello");
		c.add("Wrold");
		c.add("Java");
		Object[] array = c.toArray();
	
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+"---------"+((String)array[i]).length());
		}
		System.out.println("------------------------");
		
		
		//迭代器使用。。。。。。。。。。。。。。。。。。。。。。。。。。
		Iterator it=c.iterator();
		//判断是否有下一个元素
		//it.hasNext();//返回boolean
		//it.next();//找到下一个元素  object类型
		//遍历  
		 while(it.hasNext()){
			 //注意，it.next();  该方法建议不要重复使用，next()表示的是下一个
			 System.out.println(it.next());
		 }
	}

}
