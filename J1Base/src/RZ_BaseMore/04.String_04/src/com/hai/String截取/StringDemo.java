package com.hai.String��ȡ;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��ȡ�Ĺ���

		String s = "HelloWorld";

		System.out.println(s.length());

		System.out.println(s.charAt(7));// ָ��λ�õ��ַ�
 
		System.out.println(s.indexOf('l'));// ��һ�γ����ַ���λ�� ������intָ 97 �������a 101
											// ����e

		System.out.println(s.indexOf(101));// ������� e ��һ��λ��

		System.out.println(s.indexOf("ll"));

		System.out.println(s.indexOf('l', 4));// �ӵ��ĸ�λ�ÿ�ʼ�ҵ� l������λ��

		// ��ȡ
		
		System.out.println(s.substring(4));//���Ŀ�ʼ Ĭ�Ͻ�ȡ���ַ��Ľ�β
		System.out.println("------------------------");
		System.out.println(s.substring(3,5));//��ȡ����������������  ��ȡ��5������λ�� ���ú������
	}

}
