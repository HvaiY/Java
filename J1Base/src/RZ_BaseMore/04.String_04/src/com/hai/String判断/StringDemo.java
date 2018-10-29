package com.hai.String判断;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";

		System.out.println(s1.equals(s2));// 区分大小写 true
		System.out.println(s1.equals(s3));// 区分大小写 false
		System.out.println(s1.equalsIgnoreCase(s2));// 不区分大小写 验证码验证可以用到哇 true
		System.out.println(s1.equalsIgnoreCase(s3));// 不区分大小写 验证码验证可以用到哇 true

		System.out.println(s1.contains("ow"));// 包含否 ow
		System.out.println(s1.contains("lw"));// 包含否 lw 要连续性哦

		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("h")); // 以h开始 区分大小写
		System.out.println(s1.endsWith("d")); // 以d结束

		String s5 = "";
		String s6 = null; // 没有对象哦
		System.out.println(s5.isEmpty()); // 判断字符串是否为空
		// System.out.println(s6.isEmpty());// 异常 空指针 ，需要对象才能判断是否为空啊

		double s = Math.random();
		System.out.println(s);
		// 1-100之间的随机值 伪随机
		int n = (int) (Math.random() * 100) + 1;
		System.out.println(n);

		System.out.println("**********************");

		for (int i = 0; i < 100; i++) {
			double random = Math.random();
			System.out.println(random);
			System.out.println((int) (random * 100)+1);

		}
	}
}
