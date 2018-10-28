package com.hai.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListBLAddElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 遍历查找list 集合 是否存在World 如果存在我们将增加一个元素 Yes
		// 在遍历中如果使用迭代器 遍历 然后用集合去填写远程会出席异常 并发数异常
		// 因此在使用迭代器遍历的时候最好是使用迭代器来添加元素 ，iterator是没有add方法
		// ，但是其子类ListIterator存在add方法，因此使用该子类
		// 或者采用集合遍历的方式添加元素
		List list = new ArrayList();
		list.add("hello");
		list.add("World");
		list.add("Java");

		// 方式一 使用迭代，元素增加在找到的元素的后面
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {

			if ("World".equals(listIterator.next())) {
				listIterator.add("Yes"); 

			}
		}
		System.out.println(list);
		// 方式二
		System.out.println("------------------------");
		for (int i = 0; i < list.size(); i++) {
			if ("World".equals(list.get(i))) {

				list.add("呵呵");// 这个是加载集合的末尾
			}
		}
		System.out.println(list);
	}

}
