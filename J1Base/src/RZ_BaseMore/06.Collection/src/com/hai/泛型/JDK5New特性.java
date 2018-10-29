package com.hai.泛型;

import java.util.ArrayList;
import java.util.Collection;

/*
 * JDK5的新特性 ：自动拆装箱，泛型，增强for,静态导入，可变参数，枚举
 * 增强for：是for循环的一种
 * */

public class JDK5New特性 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//遍历数组看看
		int[] arr={12,23,4,66};
		for(int x:arr){
			System.out.println(x);
		}
		System.out.println("---------------------");
 //遍历集合看看   增强的for这里本质是迭代器的使用
		//使用增强的for 需要判断集合或者数组是否为空，null不能遍历
		Collection<String> c=new ArrayList<String>();
		c.add("霍元甲");
		c.add("黑山老妖");
		c.add("白鸥");
		for(String s:c){
			
			System.out.println(s);
		}
	}

}
