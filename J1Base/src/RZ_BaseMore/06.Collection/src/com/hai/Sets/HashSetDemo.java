package com.hai.Sets;

import java.util.HashSet;

public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//hashSet 是set集合的子类实现对象，具备集合元素不重复，不一定有序排列
		//现在开始用泛型了 
		HashSet<Dog> hashSet = new HashSet<Dog>();
		  Dog dog1 = new Dog("魏忠贤", 28, '女', "黄色");
		  Dog dog2 = new Dog("魏忠贤", 29, '女', "白色");
		  Dog dog3= new Dog("和珅", 27, '女', "黑色");
		  Dog dog4 = new Dog("和珅", 27, '男', "黑色");
		  Dog dog7= new Dog("和珅", 27, '女', "黑色");
		  Dog dog8 = new Dog("和珅", 27, '男', "黑色");
		  Dog dog5= new Dog("魏忠贤", 28, '男', "黄色");
		  Dog dog6 = new Dog("魏忠贤", 28, '女', "黄色");
		  
		  //已重写hashCode和equals 方法 ，这时候添加对象到集合不会出现重复
		  hashSet.add(dog1);
		  hashSet.add(dog2);
		  hashSet.add(dog3);
		  hashSet.add(dog4);
		  hashSet.add(dog5);
		  hashSet.add(dog6);
		  hashSet.add(dog7);
		  hashSet.add(dog8);
		  
		 //使用增强for循环遍历集合 // hashSet 与Set一样 都是无序的
		  for(Dog d:hashSet){
			  System.out.println(d);//最终遍历出来的是5个了
			  
		  }

	}

}
