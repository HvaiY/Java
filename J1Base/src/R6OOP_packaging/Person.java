package R6OOP_packaging;

public class Person {

	private int age=19; //成员变量或者叫做字段  可以初始化 也可以不初始化 都能使用
	//字段 不赋值的情况 基础类型的默认值是0  boolean 默认false  String（引用类型） 默认值为null
	//null  不指向任何的对象 
	private String name;

	public void setAge(int value) {
		this.age = value;
	}

	public void setName(String value) {
		this.name = value;
	}

	public void sayHello() {
		System.out.println("Hello ,我是" + this.name + ",今年" + this.age + "岁了");
	}
}
