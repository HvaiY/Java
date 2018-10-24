package R6OOP_Encapsulation;

public class Dog {
	// javaBean 规范 所有的成员变量都为private 需要有getter和setter方法  boolean 类型 返回方法可以是isXXX
	// 成员变量和器组合方法 一起称之为 属性
	// 类必须为public  ,
	//必须有一无参构造方法
	private int age;
	private String name;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", vip=" + vip + "]";
	}
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
