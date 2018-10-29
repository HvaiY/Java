package com.hai.ptools;
//Cloneable �����һ����ǽӿڣ�����û���κη���  ����֪����ʵ�ָýӿڵ���Ϳ���ʵ����ĸ�����
public class Person implements Cloneable {
	//��Ա����
	private String name;
	private int age;
//���췽��
	public Person() {
		super();
	}
//���ι��췽��
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
	//��д ����Object�ķ���
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//��д����ķ���  equals  �Ժ���   ƥ�����������Ƿ���ͬ�ĳ�Ա��  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
