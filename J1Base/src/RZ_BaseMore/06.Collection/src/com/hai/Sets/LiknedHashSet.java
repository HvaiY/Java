package com.hai.Sets;

import java.util.LinkedHashSet;

public class LiknedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// LinkedHashSet
		/*
		 * LinkedHashSet:底层数据结构由哈希表和链表组成。 哈希表保证元素的唯一性。 链表保证元素有序。(存储和取出是一致)
		 */
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Hello");
		hs.add("World");
		hs.add("Java");
		hs.add("World");
		// 增强for循环遍历
		for (String s : hs) {

			System.out.println(s); //LinkedHashSet 有序的并元素不重复哦
		}
	}

}
