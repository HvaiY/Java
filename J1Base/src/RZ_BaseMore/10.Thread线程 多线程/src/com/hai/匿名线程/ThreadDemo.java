package com.hai.匿名线程;

public class ThreadDemo {
	public static void main(String[] args) {
		// 匿名内部类的方式
		/*
		 * 格式： new 类名或者接口名(){ 重写方法 } 本质是该类或者接口的子类对象
		 */

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ i);
				}
			}
		}.start();
		
		//方式二  
		  new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":"
							+ i);
				}
			}
		}){}.start();
	}
}
