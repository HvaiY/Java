package com.hai.��������;

public class ArrayOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.ð������
		int[] arr = { 12, 3, 65, 7, 67, 9, 2, 8, 1, 79 };
		sortMP(arr);
		// ������� ����������������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
		// 2.ѡ������
		int[] arr2 = { 10, 3, 65, 7, 67, 9, 2, 8, 1, 79 };
		sortChoose(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		// ����һ������ ��������������ڵ�index  ʹ�ö��ֲ��ҷ�  ���� 
	}

	// ѡ������
	public static void sortChoose(int[] arr) {
       //���Ը�װ��forѭ��Ƕ��
		int n = 0;
		while (n < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[n] > arr[i]) {
					int temp = arr[n];
					arr[n] = arr[i];
					arr[i] = temp;
				}
			}
			n++;
		}
	}

	// ð������
	public static void sortMP(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// ����
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
