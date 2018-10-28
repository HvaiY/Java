package com.hai.泛型;

//不知道是什么类型对的泛型接口实现
public class CopyOfFlays<T> implements Flay<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
		
	}


}
