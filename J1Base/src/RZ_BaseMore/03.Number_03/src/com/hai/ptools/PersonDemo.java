package com.hai.ptools;

public class PersonDemo {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//創建一個人對象
		Person p = new Person();
		//克隆一個對象
		Object obj = p.clone();
		//將克隆的對象給到person並轉換為person
	  Person p2=(Person)obj;
	  p2.setName("張飛");
	  p2.setAge(17);
	  
	  System.out.println(p2.getName()+"  "+p2.getAge());
	}
}
