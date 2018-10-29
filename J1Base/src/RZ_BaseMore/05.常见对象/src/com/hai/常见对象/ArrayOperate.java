package com.hai.常见对象;

public class ArrayOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.冒泡排序
		int[] arr = { 12, 3, 65, 7, 67, 9, 2, 8, 1, 79 };
		sortMP(arr);
		// 遍历输出 。。。。。。。。
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
		// 2.选择排序
		int[] arr2 = { 10, 3, 65, 7, 67, 9, 2, 8, 1, 79 };
		sortChoose(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		// 查找一个数在 有排序的数组所在的index  使用二分查找法  ，略 
	}

	// 选择排序
	public static void sortChoose(int[] arr) {
       //可以改装成for循环嵌套
		int n = 0;
		while (n < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[n] > arr[i]) {
					int temp = arr[n];
					arr[n] = arr[i];
					arr[i] = temp;
				}
			}
			n++;
		}
	}

	// 冒泡排序
	public static void sortMP(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// 升序
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
