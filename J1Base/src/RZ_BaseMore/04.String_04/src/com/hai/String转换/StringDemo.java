package com.hai.Stringת��;

public class StringDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "HellWorld";
		
		
		char[] c = s.toCharArray();//���ַ���תΪ�ַ�����
		for (int i = 0; i < c.length; i++) {
         System.out.println(c[i]);
		}

		System.out.println("----------------------");
		byte[] b=s.getBytes(); //���ַ��� תΪ�ֽ�����
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("----------------------");
		String ss=String.valueOf(c);//���Խ���������תΪ�ַ���
		String valueOf = String.valueOf(false);
		System.out.println(valueOf);
		System.out.println(ss);
		System.out.println("----------------------");
	  String ss1=s.toLowerCase();//תΪ Сд  s������û��  
	  String ss2=s.toUpperCase();//תΪ  ��д  s������û��  
	  
	  System.out.println(ss1);
	  System.out.println(ss2);
	  System.out.println("----------------------");
	  
	  String sss=ss1.concat(ss2);//ƴ���ַ���
	  System.out.println(sss);
	}

}