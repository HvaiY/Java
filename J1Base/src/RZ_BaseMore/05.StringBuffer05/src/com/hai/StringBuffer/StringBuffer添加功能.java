package com.hai.StringBuffer;

public class StringBuffer添加功能 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
//		StringBuffer sb = new StringBuffer();
//		StringBuffer sb2 = sb.append("Hello");// 这里其实是一个对象 ，特别要注意
//		System.out.println(sb);
//		System.out.println(sb2);
//		System.out.println(sb2 == sb);
		
		StringBuffer sb=new StringBuffer();
		sb.append("asd");
		sb.append(12);
		System.out.println(sb);
		//append也可以链式编程哦 
		
		//insert
		sb.insert(3, "海");//指定位置插入内容，返回本身
		System.out.println(sb);
		// TODO Auto-generated method stub
		//删除
		sb.deleteCharAt(2);//删除指定索引位置的字符
		System.out.println(sb);
		sb.delete(1, 3);//删除指定开始位置和结束位置的字符  包左不包右边
		System.out.println(sb);
		System.out.println("-------------------------");
		
		StringBuffer sb2=new StringBuffer();
		sb2.append("hello").append("world").append("java");
		sb2.replace(5, 10, "窝里");//指定位置开始到指定位置结束 替换为 想要的字符，  包左不包右边
		System.out.println(sb2);
		
		//反转-------------------------------
		sb2.reverse();
		System.out.println(sb2);
		
		//截取
		StringBuffer sb3=new StringBuffer();
		sb3.append("hello").append("world").append("java");
		//注意 返回值是String 哦 
		String s1=sb3.substring(2);//lloworldjava
		
		String s2=sb3.substring(2, 5);//llo    
		System.out.println(s1);
		System.out.println(s2);

	}

}
