package com.hai.Sets;

import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 *  * TreeSet：能够对元素按照某种规则进行排序。
 * 排序有两种方式
 * A:自然排序
 * B:比较器排序
 * 
 * TreeSet集合的特点：排序和唯一
 * 
 * 通过观察TreeSet的add()方法，我们知道最终要看TreeMap的put()方法。
	 */
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(12);
		treeSet.add(112);
		treeSet.add(32);
		treeSet.add(62);
		treeSet.add(33);
		treeSet.add(12);
		treeSet.add(33);
		//不重复添加 并排序了哦！
		for(Integer i:treeSet){
			System.out.println(i);
			
		}
	}

}
