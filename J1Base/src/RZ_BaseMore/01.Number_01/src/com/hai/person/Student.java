/**
 * 学生有人所有的特性，也能跳高
 */

package com.hai.person;

public class Student extends Person implements jump {

	@Override
	public void jumps() {
		System.out.println("学生跳的很高");

	}

	@Override
	public void eat() {
	System.out.println("学生爱吃肉");

	}

	@Override
	public void sleep() {
		System.out.println("爱谁懒觉的学生");

	}

}
