package com.hai.动态代理;

import java.lang.reflect.Proxy;

public class ProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 如果一个类的方法都成功写好之后 ，一般是不允许再去修改类的 ，只能扩展方法或者其他
		// 如果需要将写好的类的方法做一些改变 可以使用proxy 动态代理处理

		StudentDao sd = new StudentDaoImpl();
		sd.add();
		sd.del();
		sd.edit();
		sd.sel();

		System.out.println("------------------------------");
       //动态对象实现  不影响类的情况下做一些改变
		ProxyClass proxyClass = new ProxyClass(sd);
		StudentDao npi =(StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(), sd.getClass()
				.getInterfaces(), proxyClass);
		npi.add();
		npi.del();
		npi.edit();
		npi.sel();
		
	}

}
