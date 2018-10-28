package com.hai.单例模式;

public class Student {
	// 饿汉模式 单例  类一增加就造了一个对象
	// 1.构造函数 私有化 ，外界无法实例化对象(造对象)
	private Student() {

	}

	// 内部赵一个私有对象 ，不让外界访问
	private static Student s = new Student();
	
	//创建一个静态方法 返回对象
	
	public static Student getStudent(){
		
		return s;
	}

}
