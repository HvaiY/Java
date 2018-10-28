package com.hai.常见class;

public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//获取时间的方法
		long l=System.currentTimeMillis();//获取时间 秒 当前时间减去1970 1.1 0时    最后为毫秒数
		System.out.println(l);
		//拷贝数组中的元素到另外的一个数组中去
		int[] n1={12,34,56,78};
		int[] n2={12,11,88,66,13};
		System.arraycopy(n1, 2, n2, 1, 2);//n1的第三位开始 替换给 n2的第二位开始 替换三个 12,56,78,66,13
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n2[i]);
		}
		System.gc();//清理未使用的对象
		System.exit(0);//停止退出java虚拟机 参数为0 就好  ，其实也就是程序停止了
	
	}

}
