package com.hai.String;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ʹ��String�Ŀչ��췽��
		String s1 = new String();
		System.out.println(s1);// �������ʵ��s1.tosString(); Ȼ��������д�ˣ����Ϊ �հ�
		System.out.println(s1.length());
		System.out.println("***********************************");
		// ʹ�ô��ι��췽�� ����Ϊ�ֽ����飬 ���Բ鿴api
		String[] strs=new String[3];
		strs[0]="a";
		strs[1]="b";
		strs[2]="c";
//		strs[3]="c";
		System.out.println(strs.toString());

		byte[] byt = new byte[] { 97, 98, 99, 100, 101 };
		String s2 = new String(byt);
		System.out.println(s2); // �����abcde ���ֽ�תΪ�ַ� a ��Ӧ����97
		System.out.println("*******************************");

		// ����Ҳ������char[]
		char[] c = { 'a', 'b', 'c', 'd', 'e' };
		String s3 = new String(c);
		System.out.println(s3);
		System.out.println("*******************************");
		// �����ǽ�ȡ
		String s4 = new String(c, 2, 3);// ������2��ʼȡ����תΪ�ַ���
		System.out.println(s4);// ��ȡ�ֽ�������һ����
		System.out.println("*******************************");
		String s6 = new String("abcde");
		System.out.println(s6);
		System.out.println("*******************************");

		// Ҳ������һ���ַ����� ֱ�Ӹ��ƾͺã����û�д���һ������ ����Լ�ڴ���Դ
		String s5 = "abcde";
		System.out.println(s5);// ������ǳ��õ�
		System.out.println("*******************************");
		// �ַ���һ������ֵ�Ͳ��ܱ��ı� ����Ҳ����Hello ���ܸı䣬 World Ҳ���ܸı� ���s����ָ�����HelloWorld
		// ���ÿ��Ա� ���� ֵ�ǲ��ܱ�� Ҳ���� �ַ���һ������ֵ�Ͳ��ܱ��� ��������ı��������
		System.out.println("�ַ���ƴ��");
		String s = "Hello";
		s += "World";
		System.out.println(s);
		System.out.println("*******************************");
		// ���� == ��equals���ֱȽ�
		// == ����ǱȽ��������� �Ƚϵ��ǵ�ֵַ
		// equals Ĭ�ϱȽϵ�Ҳ�ǵ�ֵַ ���Ǹ÷���������д�� ��String ������д��equals ���� �Ƚϵ������ߵ�ʵ������
		String ss1 = new String("Hello");
		String ss2 = "Hello";
		System.out.println(ss1 == ss2);//false
		System.out.println(ss1.equals(ss2));//true    ����ָ����һ�µ�
		System.out.println("*******************************");
		//  ���  �ַ�������Ǳ��� �ȿ��ռ� �����   
		//      ����ǳ���  ��ô��ֱ�����  ���ڳ����������� �������ֱ�ӷ��� �����û�о�ֱ�Ӵ��� 
	}

}
