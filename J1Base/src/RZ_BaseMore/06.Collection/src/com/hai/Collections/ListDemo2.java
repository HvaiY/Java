package com.hai.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//注意：迭代器遍历元素的时候，通过集合是不可以修改元素的 ，但是迭代器是可以修改元素的
     //列表迭代器
		//列表迭代器和迭代器有更多的方法。其中有一个逆向查找（遍历）listIterator lit;  lit.previous()
		List l=new ArrayList();
		l.add("Hello");
		l.add("World");
		l.add("Java");
		ListIterator lit = l.listIterator();
		//逆向遍历需要先next()遍历之后才能使用，不然无意义（出现异常），一般不使用
		while(lit.hasNext()){
			
			String s=(String)lit.next();
			System.out.println(s);
		}
		//逆向遍历 (上面已经遍历了 就可以逆向遍历了)
		while(lit.hasPrevious()){
			
			String s=(String)lit.previous();
			System.out.println(s);
		}
		
	}

}
