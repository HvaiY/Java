package com.hai.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListBLAddElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��������list ���� �Ƿ����World ����������ǽ�����һ��Ԫ�� Yes
		// �ڱ��������ʹ�õ����� ���� Ȼ���ü���ȥ��дԶ�̻��ϯ�쳣 �������쳣
		// �����ʹ�õ�����������ʱ�������ʹ�õ����������Ԫ�� ��iterator��û��add����
		// ������������ListIterator����add���������ʹ�ø�����
		// ���߲��ü��ϱ����ķ�ʽ���Ԫ��
		List list = new ArrayList();
		list.add("hello");
		list.add("World");
		list.add("Java");

		// ��ʽһ ʹ�õ�����Ԫ���������ҵ���Ԫ�صĺ���
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {

			if ("World".equals(listIterator.next())) {
				listIterator.add("Yes"); 

			}
		}
		System.out.println(list);
		// ��ʽ��
		System.out.println("------------------------");
		for (int i = 0; i < list.size(); i++) {
			if ("World".equals(list.get(i))) {

				list.add("�Ǻ�");// ����Ǽ��ؼ��ϵ�ĩβ
			}
		}
		System.out.println(list);
	}

}
