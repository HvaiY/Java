package R6OOP;

public class Dog {
	// javaBean 规范 所有的成员变量都为private 需要有getter和setter方法  boolean 类型 返回方法可以是isXXX
	// 成员变量和器组合方法 一起称之为 属性
	// 类必须为public  ,
	//必须有一无参构造方法
	private int age;
	private String name;
	private boolean vip;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
}
