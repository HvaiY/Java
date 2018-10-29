package com.hai.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 线程组 略了  注意：：：：
		//创建一个线程容量为2的线程池
	     ExecutorService nftp = Executors.newFixedThreadPool(2);
	     //执行线程  只能够执行两条哦 
        nftp.submit(new MyRunnable());
        nftp.submit(new MyRunnable());
        //结束线程池 结束后不能再回收线程资源了
        nftp.shutdown();
        
        //方式二 这也是 多线程的第三种方式 需要依赖于线程池 ，可以有返回值哦
        
        ExecutorService p2 = Executors.newFixedThreadPool(2);
        p2.submit(new MyCallable());//这里执行线程中 call()方法有返回值的话也是可以返回数据的哦
        p2.submit(new MyCallable());
        p2.shutdown();
	}

}
