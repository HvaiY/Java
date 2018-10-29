package com.hai.常见class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//定义正则表达式 
		String regex="\\w+@\\w+(\\.[comn]+)+";//判断有限的正则
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个邮件");
		String email=sc.nextLine();
		
	    if(email.matches(regex)){
	    	
	    	System.out.println("邮箱输入正确");
	    }	else{
	    	
	    	System.out.println("你输入了啥");
	    }
	    System.out.println("----------------------");
	    
	    
	    //将正则转为一个对象来处理
	    Pattern patt=Pattern.compile(regex);
	   Matcher matcher = patt.matcher("123@qq.com");
	   boolean matches = matcher.matches();//判断是否匹配
	  //同样可以替换或者其它的查找方式
	   System.out.println(matches);
	}

}
