package com.hai.StringBuffer;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 线程安全（多线程讲解）
		// 安全---同步  StringBuffer 是安全的，效率低           StringBuilder是不安全的不同步的  效率高
		// 不安全 ---不同步

		// 相当于创建了一个缓冲区 容量默认是16 长度随着字符串增加而增加
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// 默认缓冲空间是16
		System.out.println(sb.length());

		System.out.println("-----------------------------");
		StringBuffer  sb3=new StringBuffer(50);//指定容量的StringBuffer
		
		System.out.println("-----------------------------");

		StringBuffer sb2 = new StringBuffer("hello");//可以将一个字符串转为StringBuffer类型哦
//		String s="hello";
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.toCharArray()[i]-0);
//		}
		System.out.println(sb2.capacity());// 21
		System.out.println(sb2.length());// 5

		System.out.println("---------------");

		
		// TODO Auto-generated method stub

	}

}
