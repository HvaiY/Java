package com.hai.StringBuffer;

import java.util.Scanner;

public class �Գ��ַ���Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isSams(s));
		System.out.println(isSamss(s));

	}

	// ���򵥵��ж� Ϊ�ַ����Գ�
	public static boolean isSamss(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}

	// �ж��Ƿ�Ϊ�Գ��ַ���
	public static boolean isSams(String str) {
		boolean flag = true;
		char[] c = str.toCharArray();
		// ���õ�forѭ�� ע��ʹ�� �ر𲻴� ���� ���鰡
		for (int start = 0, end = c.length - 1; start <= end; start++, end--) {

			if (c[start] != c[end]) {
				flag = false;
				break;
			}
		}

		return flag;

	}

}
