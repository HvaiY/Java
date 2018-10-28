package com.hai.泛型;

public class 泛型接口Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*//第一种泛型接口
		Flay<String> flays = new Flays();//泛型接口多态 这种不常用
		flays.show("aaaaaaaa");*/
		
		//第二种  
     Flay<String> f=new CopyOfFlays<String>();
     f.show("呵呵");
     Flay<Integer> f1=new CopyOfFlays<Integer>();
     f1.show(123);
	}

}
