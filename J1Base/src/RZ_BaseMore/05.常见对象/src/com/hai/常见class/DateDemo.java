package com.hai.常见class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//创建对象
		Date d=new Date();
		//System.out.println(d);//该方法已重写toString() 方法 ，所以打印出来的是字符串 时间格式的 
		long ld=d.getTime();//将时间转为秒
		System.out.println(System.currentTimeMillis());
		System.out.println(ld);
		System.out.println("-----------------");
		//时间格式化  下面的这个实质是 DateFormat的子类对象
	    SimpleDateFormat sdf=new SimpleDateFormat();
	    String format = sdf.format(d);//格式化一个时间为字符串格式 但是没有指定格式 
	    System.out.println(format);
	    //时间格式化 并指定格式
	
	    
	    SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
	    String format2 = sdf2.format(d);
	    Date parse = sdf2.parse("2017年08月09日 10:30:40");//将一个字符串转为时间   注意 格式要求 也就是在实例化SimpleDateFormat 要注意构造方法初始化时的参数 格式
	    System.out.println(format2);
	    System.out.println(parse);
	    System.out.println("1111111111111111111111111111111111");
       Date d2=new Date();
       System.out.println(d2);
	}

}
