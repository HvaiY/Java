package com.hai.String�ж�;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";

		System.out.println(s1.equals(s2));// ���ִ�Сд true
		System.out.println(s1.equals(s3));// ���ִ�Сд false
		System.out.println(s1.equalsIgnoreCase(s2));// �����ִ�Сд ��֤����֤�����õ��� true
		System.out.println(s1.equalsIgnoreCase(s3));// �����ִ�Сд ��֤����֤�����õ��� true

		System.out.println(s1.contains("ow"));// ������ ow
		System.out.println(s1.contains("lw"));// ������ lw Ҫ������Ŷ

		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("h")); // ��h��ʼ ���ִ�Сд
		System.out.println(s1.endsWith("d")); // ��d����

		String s5 = "";
		String s6 = null; // û�ж���Ŷ
		System.out.println(s5.isEmpty()); // �ж��ַ����Ƿ�Ϊ��
		// System.out.println(s6.isEmpty());// �쳣 ��ָ�� ����Ҫ��������ж��Ƿ�Ϊ�հ�

		double s = Math.random();
		System.out.println(s);
		// 1-100֮������ֵ α���
		int n = (int) (Math.random() * 100) + 1;
		System.out.println(n);

		System.out.println("**********************");

		for (int i = 0; i < 100; i++) {
			double random = Math.random();
			System.out.println(random);
			System.out.println((int) (random * 100)+1);

		}
	}
}
