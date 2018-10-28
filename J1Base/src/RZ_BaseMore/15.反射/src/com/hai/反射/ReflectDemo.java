package com.hai.反射;

public class ReflectDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		//获取Class对象 (字节码文件对象)
		
		//方法一
		   Person p=new Person();
		   Class p1 = p.getClass();
		   
		   //方法二 
		   Class c1=   Person.class;
		   
		   //方式三 
		    Class c2=  Class.forName("com.hai.反射.Person");
		    
		    System.out.println(p1==c1);
		    System.out.println(c1==c2);
       
	}

}
