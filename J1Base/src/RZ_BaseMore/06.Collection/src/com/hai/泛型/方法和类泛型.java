package com.hai.泛型;

public class 方法和类泛型 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//类泛型  去看看类吧
		Person<String> person = new Person<String>();
        person.show("abc");
        //方法泛型  去看看这个类就知道了 
        Animal animal = new Animal();
        animal.show("喵喵喵");
        animal.show(123);
        animal.show(true);
	}

}
