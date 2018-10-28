package com.hai.线程池;

import java.util.concurrent.Callable;

//泛型中 的数据类型就是  call()方法返回的数据的数据类型  如果不使用泛型 默认 object类型
public class MyCallable implements Callable {

	@Override
	public Object call() throws Exception {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		return null;
	}

}
