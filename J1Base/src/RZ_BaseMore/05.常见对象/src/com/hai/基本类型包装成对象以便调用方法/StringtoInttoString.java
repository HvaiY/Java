package com.hai.�������Ͱ�װ�ɶ����Ա���÷���;

public class StringtoInttoString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String - int -String

		int n = 100;
		// תΪ String
		// ����һ
		String s = "" + n;
		System.out.println("s:" + s);
		// ������
		String s1 = String.valueOf(n); // ���鳣��
		System.out.println("s1:" + s1);
		// ������
		Integer ns = new Integer(n);
		String s2 = ns.toString();
		System.out.println("s2:" + s2);
		// ������
		String s3 = Integer.toString(n);
		System.out.println("s3:" + s3);
		System.out.println("-----------------------");

		// תΪint
		// ����һ
		Integer ii = new Integer(s3);
		int m = ii.intValue();
		System.out.println(m);

		// ������

		int m2 = Integer.parseInt(s3); // ���� ����
		System.out.println(m2);

		System.out.println("-----------------------");

		// int ���� ��������� �ܺ��� ע�� ���Ƶķ�Χ��2-36

		int number = 1000;
		System.out.println(Integer.toString(number, 10));
		System.out.println(Integer.toString(number, 2));
		System.out.println(Integer.toString(number, 8));
		System.out.println(Integer.toString(number, 16));
		System.out.println(Integer.toString(number, 3));
		System.out.println(Integer.toString(number, 4));

		System.out.println("-----------------------");

		// �������Ƶ�ʮ����
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100",2));//�����Ƶ�100תΪ 10����
		System.out.println(Integer.parseInt("100",8));
		System.out.println(Integer.parseInt("100",16));
		System.out.println(Integer.parseInt("100",32));
		//ע����Ƶ���������  ��������� ֻ�� 01
	}

}
