package com.hai.List;

import java.util.ArrayList;
import java.util.Iterator;

import com.hai.Collections.PersonFull;

/*
 * List�������ص�
 *     ArrayList:
 *       �ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 *       �̲߳���ȫ(�̲߳�ͬ��)��Ч�ʸ�
 *     Vector:
 *         �ײ����ݽṹ�����飬��ѯ�죬��ɾ��
 *         �̰߳�ȫ(�߳�ͬ��)��Ч�ʵ�
 *      LinkList:
 *         �ײ����ݽṹ��������ѯ������ɾ��
 *         �̲߳���ȫ��Ч�ʸ�   
 * */

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("Hello");
		arrayList.add("World");
		arrayList.add("Java");
		// ����ʹ��forѭ������ ����ʹ�õ�������
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s);

		}
		//��Ӷ��� ����������forѭ������
     ArrayList arrayList2 = new ArrayList();
     PersonFull p1 = new PersonFull("������",22);
     PersonFull p2 = new PersonFull("������",82);
     PersonFull p3 = new PersonFull("�ֱ���",23);
     arrayList2.add(p1);
     arrayList2.add(p2);
     arrayList2.add(p3);
     for (int i = 0; i < arrayList2.size(); i++) {
    	 PersonFull p=	(PersonFull) arrayList2.get(i);
    	 System.out.println(p.getName()+"  -------- "+p.getAge());
	}
     
   
     
	}

}
