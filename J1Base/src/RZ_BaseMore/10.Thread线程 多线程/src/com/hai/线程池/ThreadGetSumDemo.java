package com.hai.线程池;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadGetSumDemo {

	/**
	 * @param args
	 * @throws Exception
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException,
			Exception {
		// 创建线程池对象
		ExecutorService p1 = Executors.newFixedThreadPool(2);

		// 提交（执行）线程并得到相关返回的封装值
		Future<Integer> s1 = p1.submit(new ThreadGetSum(100));
		Future<Integer> s2 = p1.submit(new ThreadGetSum(200));
		// 结束线程池
		p1.shutdown();
		// 获取线程执行后得到的结果
		Integer i1 = s1.get();
		Integer i2 = s2.get();

		System.out.println(i1);
		System.out.println(i2);
	}

}
