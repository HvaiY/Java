package com.hai.StringBuffer;

public class StringBuffer��String����ת���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��String תΪStringBuffer
		/*//��ʽһ
		StringBuffer sb = new StringBuffer();
		String s = "HelloWorld";
		sb.append(s);
		System.out.println(sb);*/
		
		/*//��ʽ�� ���췽��ʵ��s
		String s = "HelloWorld";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);*/
		
		
		System.out.println("-----------------------------------");
		
		//��StringBufferתΪ String
		//��ʽһ���췽��ʵ��
		StringBuffer sb = new StringBuffer();
		sb.append("����").append("��");
		String s=new String(sb);
		System.out.println(s);
		
		System.out.println("-------------------");
		//������  toString();
		String s2=sb.toString();
		System.out.println(s2);
		// TODO Auto-generated method stub

	}

}
