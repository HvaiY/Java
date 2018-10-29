package cn.hai.反射2;

import java.lang.reflect.Constructor;

//import com.hai.反射.Person;

public class ReflectDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//获取字节码对象   
		Class c = Class.forName("com.hai.反射.Person");
		
	/*	String name = c.getName();
		System.out.println(name);
		*/
		
		//获取带参的构造方法
		Constructor con = c.getConstructor(String.class,int.class);
		
		//创建该类的对象
		Object o = con.newInstance("张飞",18);
		 
//		//转换为该对象可以调用其方法
//		Person p=(Person)o;
//		p.show();
		System.out.println(o);
		
		//调用私有的构造方法  ******************************************
		
		Constructor con2 = c.getDeclaredConstructor(String.class);
		 //去除修饰符效果  暴力了
		con2.setAccessible(true);
		
		
		Object o2 = con2.newInstance("吕布");
		System.out.println(o2);

	}

}
