package com.hai.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	/**
	 * Collection ���� ��Ϊ��ڣ�������ҲΪ�ӿڣ������ʵ�ֲ���������Ҫ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ����
		Collection c = new ArrayList();
		c.add("�Ŵ�ϼ");
		c.add(123);
		c.add("��");
		c.add("�Ǻ�");
		c.addAll(c);

		System.out.println("���ϳ���Ϊ��" + c.size());
		// ����дtoString();
		System.out.println(c);
		// ����
		for (Object object : c) {
			System.out.println(object);
		}
		// �Ƴ�������ĳ��Ԫ��
		c.remove("�Ǻ�");// �Ƴ��ӵ�һ����ʼ
		System.out.println(c);
		// �������
		// c.clear();
		// System.out.println("clear�˼���c��"+c);
		// �жϼ����Ƿ�Ϊ��
		System.out.println("����Ϊ����" + c.isEmpty());
		// �Ƿ����ĳ��Ԫ�� ��ĳ������Ԫ��
		System.out.println(c.contains(123));
		// תΪ����
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
