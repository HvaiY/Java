package com.hai.�������Ͱ�װ�ɶ����Ա���÷���;

public class IntegerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��100 תΪ  ������ �� �˽��� ʮ������  ʹ��integer��������
		String s=Integer.toBinaryString(100);
		System.out.println(s);
		//תΪ 8����
		System.out.println(Integer.toOctalString(100));
		//תΪ16����
		System.out.println(Integer.toHexString(100));
		
		//��ȡint �����ֵ����Сֵ 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	/*//���ֻ������͵Ķ�Ӧ�Ķ��� ���� 
		byte     Byte
		short    Short
		int      Integer
		long     Long
		float    Float
		double   Double
		char     Character
		boolean  Boolean*/
		
		int ns=100;
		String sss =new Integer(ns).toString();
		System.out.println(sss);
				
	}

}
