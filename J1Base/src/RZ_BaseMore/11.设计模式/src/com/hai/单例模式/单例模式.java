package com.hai.单例模式;

public class 单例模式 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//单例 模式  饿汉模式 开发使用  jdk 中runtime 就是使用的  饿汉模式
		Student s1=Student.getStudent();
		Student s2=Student.getStudent();
       System.out.println(s1==s2);//是同一个对象哦
       
       //单例模式   懒汉模式  面试使用 
          // 多线程 安全问题
       // 延迟加载（创建对象）
       //  
       Teacher t1=Teacher.getTeacher();
       Teacher t2=Teacher.getTeacher();
	   System.out.println(t1==t2);//是同一个对象 返回的是true
	}
}
