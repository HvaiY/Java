/**
 *这是人类的抽象类
 *@author dahai
 *@Version V1.0
 */

package com.hai.person;

public abstract class Person {
	private String name;
	private int age;

	public Person() {
		super();
	
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void eat();

	public abstract void sleep();
}
