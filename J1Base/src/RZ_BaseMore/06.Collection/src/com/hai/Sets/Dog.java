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
  //��ΪhashSet�������ж������ظ��ĵײ�ʹ�õ��� hashCode() && equals()����
//�������д���������� ����ô���õ���Object ������������  ����������ʹ�õ����ж��������������Ƿ���ͬ��
//hashSet��������Ĺ�ϵ ������hashCodeҲҪ�������У�����Ҫ��д�� 
//---��дhashCode��equals
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
//��д toString()����
@Override
public String toString() {
	return "Dog [name=" + name + ", age=" + age + ", gender=" + gender
			+ ", color=" + color + "]";
}

  
}
