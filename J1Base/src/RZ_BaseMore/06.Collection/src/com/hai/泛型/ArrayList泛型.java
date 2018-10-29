package com.hai.泛型;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList泛型 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      //泛型，其它的集合也一样
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("Java");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}

	}

}
