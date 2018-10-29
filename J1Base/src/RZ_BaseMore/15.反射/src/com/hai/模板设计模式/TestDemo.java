package com.hai.模板设计模式;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 模板设计模式原理 ：
		    //由抽象类中的非抽象方法  该方法内部调用抽象方法 (被调用的抽象方法就是一个代码模板。)，
		//当继承该类的子类实现抽象方法是  该抽象方法中的代码功能不一样，达到的功能也就不一样了
		
		// 子类赋值给父类  ，(接口  抽象类 ) 大部分就是在这上面做的处理  
       GetTime gt=new FromTime();
       System.out.println(gt.getTime()+":毫秒");
       
       
       System.out.println("--------------------------");
       
       //只要将对象重新只想另外的一个子类的实现 就可以实现另外的一个方法计算时间了，
       
       gt=new IOTime();
       System.out.println(gt.getTime()+":毫秒");
	}

}
