package com.hai.����class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����������ʽ 
		String regex="\\w+@\\w+(\\.[comn]+)+";//�ж����޵�����
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ʼ�");
		String email=sc.nextLine();
		
	    if(email.matches(regex)){
	    	
	    	System.out.println("����������ȷ");
	    }	else{
	    	
	    	System.out.println("��������ɶ");
	    }
	    System.out.println("----------------------");
	    
	    
	    //������תΪһ������������
	    Pattern patt=Pattern.compile(regex);
	   Matcher matcher = patt.matcher("123@qq.com");
	   boolean matches = matcher.matches();//�ж��Ƿ�ƥ��
	  //ͬ�������滻���������Ĳ��ҷ�ʽ
	   System.out.println(matches);
	}

}
