package com.hai.����class;

public class SystemDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ȡʱ��ķ���
		long l=System.currentTimeMillis();//��ȡʱ�� �� ��ǰʱ���ȥ1970 1.1 0ʱ    ���Ϊ������
		System.out.println(l);
		//���������е�Ԫ�ص������һ��������ȥ
		int[] n1={12,34,56,78};
		int[] n2={12,11,88,66,13};
		System.arraycopy(n1, 2, n2, 1, 2);//n1�ĵ���λ��ʼ �滻�� n2�ĵڶ�λ��ʼ �滻���� 12,56,78,66,13
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n2[i]);
		}
		System.gc();//����δʹ�õĶ���
		System.exit(0);//ֹͣ�˳�java����� ����Ϊ0 �ͺ�  ����ʵҲ���ǳ���ֹͣ��
	
	}

}
