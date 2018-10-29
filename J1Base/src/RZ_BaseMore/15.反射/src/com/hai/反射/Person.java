package com.hai.∑¥…‰;

public class Person {
    private String name;
    private int age;
	public Person() {
		
	}
	private Person(String name){
		this.name=name;
	}
	public void show(){
		
		System.out.println("Œ“∞Æshow");
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
