package com.hai.String;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用String的空构造方法
		String s1 = new String();
		System.out.println(s1);// 输出的其实是s1.tosString(); 然而方法重写了，输出为 空白
		System.out.println(s1.length());
		System.out.println("***********************************");
		// 使用带参构造方法 参数为字节数组， 可以查看api
		String[] strs=new String[3];
		strs[0]="a";
		strs[1]="b";
		strs[2]="c";
//		strs[3]="c";
		System.out.println(strs.toString());

		byte[] byt = new byte[] { 97, 98, 99, 100, 101 };
		String s2 = new String(byt);
		System.out.println(s2); // 结果是abcde 讲字节转为字符 a 对应的是97
		System.out.println("*******************************");

		// 参数也可以是char[]
		char[] c = { 'a', 'b', 'c', 'd', 'e' };
		String s3 = new String(c);
		System.out.println(s3);
		System.out.println("*******************************");
		// 可以是截取
		String s4 = new String(c, 2, 3);// 从索引2开始取三个转为字符串
		System.out.println(s4);// 截取字节数则是一样的
		System.out.println("*******************************");
		String s6 = new String("abcde");
		System.out.println(s6);
		System.out.println("*******************************");

		// 也可以是一个字符对象 直接复制就好，这就没有创建一个对象 ，节约内存资源
		String s5 = "abcde";
		System.out.println(s5);// 这个才是常用的
		System.out.println("*******************************");
		// 字符串一旦被赋值就不能被改变 下面也就是Hello 不能改变， World 也不能改变 最后s引用指向的是HelloWorld
		// 引用可以变 但是 值是不能变的 也就是 字符串一旦被赋值就不能被改 所以下面改变的是引用
		System.out.println("字符串拼接");
		String s = "Hello";
		s += "World";
		System.out.println(s);
		System.out.println("*******************************");
		// 关于 == 和equals两种比较
		// == 如果是比较引用类型 比较的是地址值
		// equals 默认比较的也是地址值 但是该方法可以重写啊 在String 里面重写了equals 方法 比较的是两者的实际内容
		String ss1 = new String("Hello");
		String ss2 = "Hello";
		System.out.println(ss1 == ss2);//false
		System.out.println(ss1.equals(ss2));//true    内容指向是一致的
		System.out.println("*******************************");
		//  相加  字符串如果是变量 先开空间 在相加   
		//      如果是常量  那么是直接相加  再在常量池里面找 ，如果有直接返回 ，如果没有就直接创建 
	}

}
