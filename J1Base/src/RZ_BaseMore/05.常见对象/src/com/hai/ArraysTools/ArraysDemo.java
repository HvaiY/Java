package com.hai.ArraysTools;

import java.util.Arrays;

public class ArraysDemo {

	/**
	 * @param args
	 *            Arrays�����������в����Ĺ����� ������ ��������Ͳ���
	 */
	public static void main(String[] args) {
		//
		int[] arr = { 12, 34, 2, 76, 38, 99, 78, 54, 56 };
       //������תΪ�ַ���
		 String s=Arrays.toString(arr);
		 System.out.println(s);
		 
		 System.out.println("---------------------");
		 
		 //�������������
		 Arrays.sort(arr); 
		 System.out.println(Arrays.toString(arr));
		 
		 System.out.println("-------------------------");
		 //���ֲ���(��Ҫ�����������)ĳ����ֵ����ֵ�е�index  ����� 38 
		 int index=Arrays.binarySearch(arr, 38);
		 
		 int index2=Arrays.binarySearch(arr, 388);
		 System.out.println(index);
		 System.out.println(index2); //���Կ�Դ��Ŷ 
		 
		 System.out.println("-------------------------");
	}

}
