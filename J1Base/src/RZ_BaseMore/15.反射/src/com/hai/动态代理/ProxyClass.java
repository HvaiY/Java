package com.hai.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyClass implements InvocationHandler {
	
	private Object targer;
	//������� 
	public ProxyClass(Object targer){
		this.targer=targer;
	}
  // ʵ��InvocationHandler   ��д���� ��
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("���ӵ�Ȩ�޹���");
		Object invoke = method.invoke(targer, args);
		System.out.println("���ӵ���־����");
		return null;
	}
   //��̬������  ʵ�ַ����Ĺ��ܱ��  ����    ��Ҫʵ�� 
	
}
