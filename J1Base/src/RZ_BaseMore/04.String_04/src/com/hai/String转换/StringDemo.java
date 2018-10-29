package com.hai.String转换;

public class StringDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "HellWorld";
		
		
		char[] c = s.toCharArray();//将字符串转为字符数组
		for (int i = 0; i < c.length; i++) {
         System.out.println(c[i]);
		}

		System.out.println("----------------------");
		byte[] b=s.getBytes(); //将字符串 转为字节数组
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("----------------------");
		String ss=String.valueOf(c);//可以将任意类型转为字符串
		String valueOf = String.valueOf(false);
		System.out.println(valueOf);
		System.out.println(ss);
		System.out.println("----------------------");
	  String ss1=s.toLowerCase();//转为 小写  s本身是没变  
	  String ss2=s.toUpperCase();//转为  大写  s本身是没变  
	  
	  System.out.println(ss1);
	  System.out.println(ss2);
	  System.out.println("----------------------");
	  
	  String sss=ss1.concat(ss2);//拼接字符串
	  System.out.println(sss);
	}

}