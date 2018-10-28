package com.hai.ArraysTools;

import java.util.Arrays;

public class ArraysDemo {

	/**
	 * @param args
	 *            Arrays：针对数组进行操作的工具类 溜溜哒 比如排序和查找
	 */
	public static void main(String[] args) {
		//
		int[] arr = { 12, 34, 2, 76, 38, 99, 78, 54, 56 };
       //将数组转为字符串
		 String s=Arrays.toString(arr);
		 System.out.println(s);
		 
		 System.out.println("---------------------");
		 
		 //将数组进行排序
		 Arrays.sort(arr); 
		 System.out.println(Arrays.toString(arr));
		 
		 System.out.println("-------------------------");
		 //二分查找(需要数组是有序的)某个数值在数值中的index  如查找 38 
		 int index=Arrays.binarySearch(arr, 38);
		 
		 int index2=Arrays.binarySearch(arr, 388);
		 System.out.println(index);
		 System.out.println(index2); //可以看源码哦 
		 
		 System.out.println("-------------------------");
	}

}
