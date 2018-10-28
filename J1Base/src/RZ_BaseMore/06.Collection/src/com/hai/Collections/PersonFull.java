package com.hai.Collections;

public class PersonFull {
//标准的Person类 练习而已
	private String name;
	private int age;
	public PersonFull() {
	}
	public PersonFull(String name, int age) {
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
	@Override
	public String toString() {
		return "PersonFull [name=" + name + ", age=" + age + "]";
	}

}
