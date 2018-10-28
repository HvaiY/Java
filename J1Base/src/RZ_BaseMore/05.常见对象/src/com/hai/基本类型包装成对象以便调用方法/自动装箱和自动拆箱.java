package com.hai.基本类型包装成对象以便调用方法;

public class 自动装箱和自动拆箱 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer ii=100; //自动装箱过程
		ii+=200;//先拆箱 在装箱  
		System.out.println(ii);
		System.out.println("-------------------------------------");
		//以上实际是 
		Integer i=Integer.valueOf(100);//装箱 
		i=Integer.valueOf(i.intValue()+200);//先拆箱 再装箱  注意  对象不能为空  也就是 i=null 会出现异常
		System.out.println(i);
		
		//关于上面有个需要注意的  上面其实 -128--127之间（byte 类型数字取值所在区间 ）
		//  nteger.valueOf(100) 实际是直接从缓冲区域取值
		
		
		Integer n1=128;//实际是new Integer(128) 这就是一个对象了 
		Integer n2=128;//实际是new Integer(128) 这就是一个对象了 
		System.out.println(n1==n2); //false  比较的是地址 由于不在-128--127  里面的操作
		System.out.println(n1.equals(n2));//  true  方法重写  了   比较的是开面的值
		
		//
		System.out.println("--------------------------");
		//如果 是  n3  在-128--127 那就是直接取缓冲池的值了
		Integer n3=127;//实际是new Integer(128) 这就是一个对象了 
		Integer n4=127;//实际是new Integer(128) 这就是一个对象了 
		System.out.println(n4==n3); //true  
		System.out.println(n4.equals(n3));//  true  方法重写  了   比较的是开面的值

	}

}
