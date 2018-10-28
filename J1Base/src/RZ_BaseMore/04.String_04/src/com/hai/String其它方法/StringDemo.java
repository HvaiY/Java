package com.hai.String其它方法;

import java.awt.image.ConvolveOp;
import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		String s = "HelloWorld";
		String s1 = s.replace('l', 'a');// 替换字节
		System.out.println(s1);

		System.out.println("-----------");
		String s2 = s.replace("oW", "asdfgg22");// 替换字符串
		System.out.println(s2);
		System.out.println("----------------------");

		String ss = "   Hello World    ";
		String ss1 = ss.trim(); // 去除首尾空格
		System.out.println(ss1);
		System.out.println("----------------------");

		String ss2 = "Hello";//  72...
		
		System.out.println('A'-1); //大A字母顺序是是65
		String ss3 = "Hello";
		String ss4 = "abc"; //97  98  99
		String ss5 = "xyz";// 120  121  122

		// 按字典顺序来比较字符串 compareTo compareToIgnoreCase这个是不区分大小写的 ，
		// 结果是 用字符串的第一个字符和第二个字符串的第一个字符 去比较 相减 ，为0就去比较第二个 。。。。
		System.out.println(ss2.compareTo(ss3)); // 0
		System.out.println(ss2.compareTo(ss4));// -25
		System.out.println(ss2.compareTo(ss5));// -48

//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println(sc.nextInt());
//		Scanner sc2=new Scanner(System.in);
//		System.out.println(sc.nextLine());
		
	}
}
