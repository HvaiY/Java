package com.hai.Sets;

import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 *  * TreeSet���ܹ���Ԫ�ذ���ĳ�ֹ����������
 * ���������ַ�ʽ
 * A:��Ȼ����
 * B:�Ƚ�������
 * 
 * TreeSet���ϵ��ص㣺�����Ψһ
 * 
 * ͨ���۲�TreeSet��add()����������֪������Ҫ��TreeMap��put()������
	 */
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(12);
		treeSet.add(112);
		treeSet.add(32);
		treeSet.add(62);
		treeSet.add(33);
		treeSet.add(12);
		treeSet.add(33);
		//���ظ���� ��������Ŷ��
		for(Integer i:treeSet){
			System.out.println(i);
			
		}
	}

}
