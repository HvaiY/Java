package com.hai.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAllFunctionDemo {

	/**
	 * boolean addAll(Collection c);���һ������Ԫ�� 
	 * boolean removeAll(Collection c);�Ƴ�һ������Ԫ�� ֻҪ�Ƴ������е�һ���ͷ���true 
	 * boolean containsAll(Collection c);�ж��Ƿ����ָ���ļ���Ԫ�� ֻ�а����ڶ������ϵ����вŷ���true 
	 * boolean retainAll(Collection c);�������϶��е�Ԫ�� //��������������A ,B
		//A��B�����������صĽ���洢��A�� B����
		//����ֻ��A�Ƿ����ı䣬��ı����򷵻�true
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("aa1");
		c1.add("aa2");
		c1.add("aa3");
		c1.add("aa4");
		// �ڶ������� c2
		Collection c2 = new ArrayList();
		c2.add("aa4");
		c2.add("aa5");
		c2.add("aa6");
		c2.add("aa7");
		// //�����������һ������
		// System.out.println("addAll"+c1.addAll(c2));
		// System.out.println(c1);
		// // removeAll ֻҪ�ܳɹ��Ƴ������е�һ��Ԫ�ؾͷ���true
		// System.out.println(c1.removeAll(c2));
		// System.out.println(c1);
//		//�����ж��Ƿ����ָ���ļ���Ԫ�� ֻ�а����ڶ������ϵ����вŷ���true 
//		 System.out.println("�������ϣ�"+c1.containsAll(c2));
		
		
		//��������������A ,B
		//A��B�����������صĽ���洢��A�� B����
		//����ֻ��A�Ƿ����ı䣬��ı����򷵻�true
		System.out.println(c1.retainAll(c2));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("----------------");
		
		Collection c3 = new ArrayList();
		c3.add("aa1");
		c3.add("aa2");
		c3.add("aa3");
		c3.add("aa4");
		// �ڶ������� c2
		Collection c4 = new ArrayList();
//		c4.add("aa1");
//		c4.add("aa2");
//		c4.add("aa3");
		c4.add("aa4");
		c4.add("aa5");
		c4.add("aa6");
		c4.add("aa7");
		System.out.println(c3.retainAll(c4));
		System.out.println(c3);
		System.out.println(c4);
		
    
	}

}
