package com.hai.String��������;

import java.awt.image.ConvolveOp;
import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {
		String s = "HelloWorld";
		String s1 = s.replace('l', 'a');// �滻�ֽ�
		System.out.println(s1);

		System.out.println("-----------");
		String s2 = s.replace("oW", "asdfgg22");// �滻�ַ���
		System.out.println(s2);
		System.out.println("----------------------");

		String ss = "   Hello World    ";
		String ss1 = ss.trim(); // ȥ����β�ո�
		System.out.println(ss1);
		System.out.println("----------------------");

		String ss2 = "Hello";//  72...
		
		System.out.println('A'-1); //��A��ĸ˳������65
		String ss3 = "Hello";
		String ss4 = "abc"; //97  98  99
		String ss5 = "xyz";// 120  121  122

		// ���ֵ�˳�����Ƚ��ַ��� compareTo compareToIgnoreCase����ǲ����ִ�Сд�� ��
		// ����� ���ַ����ĵ�һ���ַ��͵ڶ����ַ����ĵ�һ���ַ� ȥ�Ƚ� ��� ��Ϊ0��ȥ�Ƚϵڶ��� ��������
		System.out.println(ss2.compareTo(ss3)); // 0
		System.out.println(ss2.compareTo(ss4));// -25
		System.out.println(ss2.compareTo(ss5));// -48

//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println(sc.nextInt());
//		Scanner sc2=new Scanner(System.in);
//		System.out.println(sc.nextLine());
		
	}
}
