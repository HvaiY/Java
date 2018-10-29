package com.hai.单例模式;

public class Teacher {

	// 懒汉模式 为了多线程安全问题 需要方法加锁 线程同步
	private Teacher() {

	}
	//一开始不创建对象 在使用的时候创建   懒汉模式
	private static Teacher t=null;
	// 为了线程安全需要将方法锁住
	public static synchronized  Teacher getTeacher(){
		
		if(t==null){
			t=new Teacher();
		}
		return t;
	}
}
