package com.hai.基本类型包装成对象以便调用方法;

public class IntegerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 将100 转为  二进制 ， 八进制 十六进制  使用integer炒鸡方便
		String s=Integer.toBinaryString(100);
		System.out.println(s);
		//转为 8进制
		System.out.println(Integer.toOctalString(100));
		//转为16进制
		System.out.println(Integer.toHexString(100));
		
		//获取int 的最大值和最小值 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	/*//八种基本类型的对应的对象 如下 
		byte     Byte
		short    Short
		int      Integer
		long     Long
		float    Float
		double   Double
		char     Character
		boolean  Boolean*/
		
		int ns=100;
		String sss =new Integer(ns).toString();
		System.out.println(sss);
				
	}

}
