package com.hai.Ïß³Ì³Ø;

import java.util.concurrent.Callable;

public class ThreadGetSum implements Callable<Integer> {
	private int n;

	public ThreadGetSum(int num) {
		this.n = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
