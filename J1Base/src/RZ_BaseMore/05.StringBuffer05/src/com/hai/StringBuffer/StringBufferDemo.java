package com.hai.StringBuffer;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �̰߳�ȫ�����߳̽��⣩
		// ��ȫ---ͬ��  StringBuffer �ǰ�ȫ�ģ�Ч�ʵ�           StringBuilder�ǲ���ȫ�Ĳ�ͬ����  Ч�ʸ�
		// ����ȫ ---��ͬ��

		// �൱�ڴ�����һ�������� ����Ĭ����16 ���������ַ������Ӷ�����
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// Ĭ�ϻ���ռ���16
		System.out.println(sb.length());

		System.out.println("-----------------------------");
		StringBuffer  sb3=new StringBuffer(50);//ָ��������StringBuffer
		
		System.out.println("-----------------------------");

		StringBuffer sb2 = new StringBuffer("hello");//���Խ�һ���ַ���תΪStringBuffer����Ŷ
//		String s="hello";
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.toCharArray()[i]-0);
//		}
		System.out.println(sb2.capacity());// 21
		System.out.println(sb2.length());// 5

		System.out.println("---------------");

		
		// TODO Auto-generated method stub

	}

}
