package com.hai.����class;

import java.util.Calendar;

public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��������
		Calendar c=Calendar.getInstance();
		
		int i = c.get(Calendar.YEAR);
		int j = c.get(Calendar.MONTH);
		int j2 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i+"��"+(j+1)+"��"+j2+"��");
		
		c.set(2017,2,23);
		int ii = c.get(Calendar.YEAR);
		int ij = c.get(Calendar.MONTH);
		int ij2 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(ii+"��"+(ij+1)+"��"+ij2+"��");
		

	}

}
