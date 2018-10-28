package com.hai.基本类型包装成对象以便调用方法;

public class StringtoInttoString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String - int -String

		int n = 100;
		// 转为 String
		// 方法一
		String s = "" + n;
		System.out.println("s:" + s);
		// 方法二
		String s1 = String.valueOf(n); // 建议常用
		System.out.println("s1:" + s1);
		// 方法三
		Integer ns = new Integer(n);
		String s2 = ns.toString();
		System.out.println("s2:" + s2);
		// 方法四
		String s3 = Integer.toString(n);
		System.out.println("s3:" + s3);
		System.out.println("-----------------------");

		// 转为int
		// 方法一
		Integer ii = new Integer(s3);
		int m = ii.intValue();
		System.out.println(m);

		// 方法二

		int m2 = Integer.parseInt(s3); // 建议 常用
		System.out.println(m2);

		System.out.println("-----------------------");

		// int 类型 到任意进制 很好玩 注意 进制的范围是2-36

		int number = 1000;
		System.out.println(Integer.toString(number, 10));
		System.out.println(Integer.toString(number, 2));
		System.out.println(Integer.toString(number, 8));
		System.out.println(Integer.toString(number, 16));
		System.out.println(Integer.toString(number, 3));
		System.out.println(Integer.toString(number, 4));

		System.out.println("-----------------------");

		// 其它进制到十进制
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100",2));//二进制的100转为 10进制
		System.out.println(Integer.parseInt("100",8));
		System.out.println(Integer.parseInt("100",16));
		System.out.println(Integer.parseInt("100",32));
		//注意进制的数字类型  比如二进制 只有 01
	}

}
