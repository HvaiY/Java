/**
 * 老师只是一个普通人 爱吃蔬菜
 */

package com.hai.person;

public class Teacher extends Person {

	@Override
	public void eat() {
		System.out.println("不吃肉，爱吃蔬菜");

	}

	@Override
	public void sleep() {
		System.out.println("晚上总是睡不着");
	}

}
