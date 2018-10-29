package com.hai.String截取;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 获取的功能

		String s = "HelloWorld";

		System.out.println(s.length());

		System.out.println(s.charAt(7));// 指定位置的字符
 
		System.out.println(s.indexOf('l'));// 第一次出现字符的位置 可以是int指 97 代表的是a 101
											// 代表e

		System.out.println(s.indexOf(101));// 输出的是 e 第一个位置

		System.out.println(s.indexOf("ll"));

		System.out.println(s.indexOf('l', 4));// 从第四个位置开始找到 l的索引位置

		// 截取
		
		System.out.println(s.substring(4));//从四开始 默认截取到字符的结尾
		System.out.println("------------------------");
		System.out.println(s.substring(3,5));//截取第三个包含第三个  截取到5的索引位置 不好含第五个
	}

}
