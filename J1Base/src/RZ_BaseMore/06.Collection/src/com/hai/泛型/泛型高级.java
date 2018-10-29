package com.hai.泛型;

import java.util.ArrayList;
import java.util.Collection;

public class 泛型高级 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//通配符 向上和向下的限定
       //使用一个集合来测试
		//非泛型使用集合 两边的类型需要一致才不报错
		Collection<Object> c1=new ArrayList<Object>();
		Collection<Animals> c2=new ArrayList<Animals>();
//		Collection<Object> c3=new ArrayList<Dog>();
//		Collection<Object> c4=new ArrayList<Cat>();
		// ? 使用通配符
		Collection<?> c5=new ArrayList<Object>();
		Collection<?> c6=new ArrayList<Animals>();
		Collection<?> c7=new ArrayList<Dog>();
		Collection<?> c8=new ArrayList<Cat>();
		
		// ? extends E 向下限定 限定为E 及E的子类
		Collection<? extends Object> c9=new ArrayList<Animals>();
		Collection<? extends Animals> c10=new ArrayList<Animals>();
		Collection<? extends Animals> c11=new ArrayList<Dog>();
		Collection<? extends Animals> c12=new ArrayList<Cat>();
		
		//？ super E 向上限定 限定為E或者E的父類
		Collection<? super Animals> c15=new ArrayList<Object>();
		Collection<? super Animals> c13=new ArrayList<Animals>();
//		Collection<? super Animals> c14=new ArrayList<Dog>();
//		Collection<? super Animals> c16=new ArrayList<Cat>();
	}

}
 class Animals{ 
 }
 class Dog extends Animals{}
 class Cat extends Animals{}
