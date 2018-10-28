package com.hai.StringBuffer;

public class StringBuffer与String互相转换不 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 将String 转为StringBuffer
		/*//方式一
		StringBuffer sb = new StringBuffer();
		String s = "HelloWorld";
		sb.append(s);
		System.out.println(sb);*/
		
		/*//方式二 构造方法实现s
		String s = "HelloWorld";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);*/
		
		
		System.out.println("-----------------------------------");
		
		//将StringBuffer转为 String
		//方式一构造方法实现
		StringBuffer sb = new StringBuffer();
		sb.append("我是").append("大海");
		String s=new String(sb);
		System.out.println(s);
		
		System.out.println("-------------------");
		//方法二  toString();
		String s2=sb.toString();
		System.out.println(s2);
		// TODO Auto-generated method stub

	}

}
