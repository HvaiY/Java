package com.hai.IOStream;

import javax.swing.JEditorPane;

public class 递归Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 递归，方法调用自己本身 可以解决很多for循环等问题
		// 注意，需要找出 递归的出口 ，不要方法递归过多，易出现内存溢出， 找出规律。
		// example
		// 1.阶乘处理

		int number = jieCheng(5);
		System.out.println(number);
		System.out.println("_____________________");

		// 不死神兔 1,1,2,3,5,8.。。。。。。找到第20个数
		int num = st(20);
		System.out.println(num);

		System.out.println(st1(20));
		System.out.println(st2(20));

	}

	// 数组方式
	public static int st2(int n) {
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n - 1];
	}

	// a b值方式
	/*
	 * a=1 b=1 a=b=1 b=a+b=2 a=b=2 b=a+b=3
	 */
	public static int st1(int n) {

		int a = 1;
		int b = 1;

		for (int i = 0; i < n - 2; i++) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		return b;
	}

	public static int st(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return st(n - 1) + st(n - 2);
		}

	}

	public static int jieCheng(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * jieCheng(n - 1);
		}
	}
}
