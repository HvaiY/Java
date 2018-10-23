package R6OOP_packaging;

public class Animal {
	// 构造方法 无void  无返回值 签名和类名一样
	// 默认 一个类都有一个无参构造方法 但是都隐藏了 ，然而可以显示的使用
	public Animal() {
		System.out.println("无参构造函数");
	}

	public Animal(int age) {
		System.out.println("一个参数的构造函数");
		this.age = age;
	}

	public Animal(int age, String name) {
		System.out.println("两个参数的构造函数");
		this.name = name;
		this.age = age;
	}

	private int age;
	private String name;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void sayHello() {
		System.out.println("Hello ,我是" + this.name + ",今年" + this.age + "岁了");
	}

}
