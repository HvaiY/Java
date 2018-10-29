package com.hai.基本类型包装成对象以便调用方法;

import java.io.CharConversionException;

public class CharacterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//char类型的对应对象  Character
     Character cc=new Character('a');
     System.out.println(cc);
     
     Character cc2=new Character('海');
     System.out.println(cc2);
     char a='海';
     System.out.println(a);
     
     System.out.println("--------------------");
     //判断大小写 
     System.out.println(Character.isUpperCase('A'));
     System.out.println(Character.isUpperCase('a'));
     System.out.println(Character.isUpperCase('0'));
     
     //判断小写 
     
     System.out.println(Character.isLowerCase('A'));
     System.out.println(Character.isLowerCase('a'));
     System.out.println(Character.isLowerCase('0'));
     
     //判断数字
     System.out.println(Character.isDigit('A'));
     System.out.println(Character.isDigit('a'));
     System.out.println(Character.isDigit('0'));
     
     //转换大小写
     System.out.println(Character.toUpperCase('a'));
     System.out.println(Character.toLowerCase('A'));
     System.out.println(Character.toLowerCase(12));
	}

}
