package com.hai.常见class;

import java.util.Calendar;

public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//日历对象
		Calendar c=Calendar.getInstance();
		
		int i = c.get(Calendar.YEAR);
		int j = c.get(Calendar.MONTH);
		int j2 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i+"年"+(j+1)+"月"+j2+"日");
		
		c.set(2017,2,23);
		int ii = c.get(Calendar.YEAR);
		int ij = c.get(Calendar.MONTH);
		int ij2 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(ii+"年"+(ij+1)+"月"+ij2+"日");
		

	}

}
