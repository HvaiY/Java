package com.hai.�������Ͱ�װ�ɶ����Ա���÷���;

import java.io.CharConversionException;

public class CharacterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//char���͵Ķ�Ӧ����  Character
     Character cc=new Character('a');
     System.out.println(cc);
     
     Character cc2=new Character('��');
     System.out.println(cc2);
     char a='��';
     System.out.println(a);
     
     System.out.println("--------------------");
     //�жϴ�Сд 
     System.out.println(Character.isUpperCase('A'));
     System.out.println(Character.isUpperCase('a'));
     System.out.println(Character.isUpperCase('0'));
     
     //�ж�Сд 
     
     System.out.println(Character.isLowerCase('A'));
     System.out.println(Character.isLowerCase('a'));
     System.out.println(Character.isLowerCase('0'));
     
     //�ж�����
     System.out.println(Character.isDigit('A'));
     System.out.println(Character.isDigit('a'));
     System.out.println(Character.isDigit('0'));
     
     //ת����Сд
     System.out.println(Character.toUpperCase('a'));
     System.out.println(Character.toLowerCase('A'));
     System.out.println(Character.toLowerCase(12));
	}

}
