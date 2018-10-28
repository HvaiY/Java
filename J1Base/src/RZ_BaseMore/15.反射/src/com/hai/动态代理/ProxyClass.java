package com.hai.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyClass implements InvocationHandler {
	
	private Object targer;
	//传入对象 
	public ProxyClass(Object targer){
		this.targer=targer;
	}
  // 实现InvocationHandler   重写方法 了
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("增加的权限功能");
		Object invoke = method.invoke(targer, args);
		System.out.println("增加的日志功能");
		return null;
	}
   //动态代理类  实现方法的功能变更  增加    需要实现 
	
}
