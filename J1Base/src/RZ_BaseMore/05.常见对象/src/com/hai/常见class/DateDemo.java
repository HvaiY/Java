package com.hai.����class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		//��������
		Date d=new Date();
		//System.out.println(d);//�÷�������дtoString() ���� �����Դ�ӡ���������ַ��� ʱ���ʽ�� 
		long ld=d.getTime();//��ʱ��תΪ��
		System.out.println(System.currentTimeMillis());
		System.out.println(ld);
		System.out.println("-----------------");
		//ʱ���ʽ��  ��������ʵ���� DateFormat���������
	    SimpleDateFormat sdf=new SimpleDateFormat();
	    String format = sdf.format(d);//��ʽ��һ��ʱ��Ϊ�ַ�����ʽ ����û��ָ����ʽ 
	    System.out.println(format);
	    //ʱ���ʽ�� ��ָ����ʽ
	
	    
	    SimpleDateFormat sdf2=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
	    String format2 = sdf2.format(d);
	    Date parse = sdf2.parse("2017��08��09�� 10:30:40");//��һ���ַ���תΪʱ��   ע�� ��ʽҪ�� Ҳ������ʵ����SimpleDateFormat Ҫע�⹹�췽����ʼ��ʱ�Ĳ��� ��ʽ
	    System.out.println(format2);
	    System.out.println(parse);
	    System.out.println("1111111111111111111111111111111111");
       Date d2=new Date();
       System.out.println(d2);
	}

}
