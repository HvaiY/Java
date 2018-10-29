package com.hai.Sets;

public class Dog {
  private String  name;
  private int age;
  private char gender;
  private String color;
public Dog() {
	super();
	// TODO Auto-generated constructor stub
}
public Dog(String name, int age, char gender, String color) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.color = color;
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
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
  //因为hashSet集合中判断数据重复的底层使用的是 hashCode() && equals()方法
//如果不重写该两个方法 ，那么调用的是Object 的这两个方法  ，我们现在使用的是判断两个对象内容是否相同，
//hashSet方法是与的关系 ，所以hashCode也要成立才行，都需要重写了 
//---重写hashCode与equals
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + gender;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Dog other = (Dog) obj;
	if (age != other.age)
		return false;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (gender != other.gender)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
//重写 toString()方法
@Override
public String toString() {
	return "Dog [name=" + name + ", age=" + age + ", gender=" + gender
			+ ", color=" + color + "]";
}

  
}
