package com.hai.��̬����;

import java.lang.reflect.Proxy;

public class ProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���һ����ķ������ɹ�д��֮�� ��һ���ǲ�������ȥ�޸���� ��ֻ����չ������������
		// �����Ҫ��д�õ���ķ�����һЩ�ı� ����ʹ��proxy ��̬������

		StudentDao sd = new StudentDaoImpl();
		sd.add();
		sd.del();
		sd.edit();
		sd.sel();

		System.out.println("------------------------------");
       //��̬����ʵ��  ��Ӱ������������һЩ�ı�
		ProxyClass proxyClass = new ProxyClass(sd);
		StudentDao npi =(StudentDao) Proxy.newProxyInstance(sd.getClass().getClassLoader(), sd.getClass()
				.getInterfaces(), proxyClass);
		npi.add();
		npi.del();
		npi.edit();
		npi.sel();
		
	}

}
