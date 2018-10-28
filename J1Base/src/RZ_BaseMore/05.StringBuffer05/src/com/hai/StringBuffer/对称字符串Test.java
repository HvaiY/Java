package com.hai.StringBuffer;

import java.util.Scanner;

public class 对称字符串Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isSams(s));
		System.out.println(isSamss(s));

	}

	// 更简单的判断 为字符串对称
	public static boolean isSamss(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}

	// 判断是否为对称字符串
	public static boolean isSams(String str) {
		boolean flag = true;
		char[] c = str.toCharArray();
		// 好用的for循环 注意使用 特别不错 建议 建议啊
		for (int start = 0, end = c.length - 1; start <= end; start++, end--) {

			if (c[start] != c[end]) {
				flag = false;
				break;
			}
		}

		return flag;

	}

}
