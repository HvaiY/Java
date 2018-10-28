package com.hai.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	/**
	 * Collection 集合 ，为借口，其子类也为接口，子类的实现才是我们需要的
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 集合
		Collection c = new ArrayList();
		c.add("张春霞");
		c.add(123);
		c.add("大海");
		c.add("呵呵");
		c.addAll(c);

		System.out.println("集合长度为：" + c.size());
		// 已重写toString();
		System.out.println(c);
		// 遍历
		for (Object object : c) {
			System.out.println(object);
		}
		// 移除集合中某个元素
		c.remove("呵呵");// 移除从第一个开始
		System.out.println(c);
		// 清除集合
		// c.clear();
		// System.out.println("clear了集合c："+c);
		// 判断集合是否为空
		System.out.println("集合为空吗？" + c.isEmpty());
		// 是否包含某个元素 或某个集合元素
		System.out.println(c.contains(123));
		// 转为数组
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
