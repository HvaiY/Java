package com.hai.Sets;

import java.util.LinkedHashSet;

public class LiknedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// LinkedHashSet
		/*
		 * LinkedHashSet:�ײ����ݽṹ�ɹ�ϣ���������ɡ� ��ϣ��֤Ԫ�ص�Ψһ�ԡ� ����֤Ԫ������(�洢��ȡ����һ��)
		 */
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Hello");
		hs.add("World");
		hs.add("Java");
		hs.add("World");
		// ��ǿforѭ������
		for (String s : hs) {

			System.out.println(s); //LinkedHashSet ����Ĳ�Ԫ�ز��ظ�Ŷ
		}
	}

}
