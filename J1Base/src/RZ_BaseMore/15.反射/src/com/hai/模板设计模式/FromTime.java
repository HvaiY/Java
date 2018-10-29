package com.hai.模板设计模式;

//实现模板的类
public class FromTime extends GetTime {

	@Override
	public void code() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}

	}

}
