package com.hai.�������Ͱ�װ�ɶ����Ա���÷���;

public class �Զ�װ����Զ����� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer ii=100; //�Զ�װ�����
		ii+=200;//�Ȳ��� ��װ��  
		System.out.println(ii);
		System.out.println("-------------------------------------");
		//����ʵ���� 
		Integer i=Integer.valueOf(100);//װ�� 
		i=Integer.valueOf(i.intValue()+200);//�Ȳ��� ��װ��  ע��  ������Ϊ��  Ҳ���� i=null ������쳣
		System.out.println(i);
		
		//���������и���Ҫע���  ������ʵ -128--127֮�䣨byte ��������ȡֵ�������� ��
		//  nteger.valueOf(100) ʵ����ֱ�Ӵӻ�������ȡֵ
		
		
		Integer n1=128;//ʵ����new Integer(128) �����һ�������� 
		Integer n2=128;//ʵ����new Integer(128) �����һ�������� 
		System.out.println(n1==n2); //false  �Ƚϵ��ǵ�ַ ���ڲ���-128--127  ����Ĳ���
		System.out.println(n1.equals(n2));//  true  ������д  ��   �Ƚϵ��ǿ����ֵ
		
		//
		System.out.println("--------------------------");
		//��� ��  n3  ��-128--127 �Ǿ���ֱ��ȡ����ص�ֵ��
		Integer n3=127;//ʵ����new Integer(128) �����һ�������� 
		Integer n4=127;//ʵ����new Integer(128) �����һ�������� 
		System.out.println(n4==n3); //true  
		System.out.println(n4.equals(n3));//  true  ������д  ��   �Ƚϵ��ǿ����ֵ

	}

}
