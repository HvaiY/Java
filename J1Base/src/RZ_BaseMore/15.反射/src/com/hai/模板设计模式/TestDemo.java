package com.hai.ģ�����ģʽ;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ģ�����ģʽԭ�� ��
		    //�ɳ������еķǳ��󷽷�  �÷����ڲ����ó��󷽷� (�����õĳ��󷽷�����һ������ģ�塣)��
		//���̳и��������ʵ�ֳ��󷽷���  �ó��󷽷��еĴ��빦�ܲ�һ�����ﵽ�Ĺ���Ҳ�Ͳ�һ����
		
		// ���ำֵ������  ��(�ӿ�  ������ ) �󲿷־��������������Ĵ���  
       GetTime gt=new FromTime();
       System.out.println(gt.getTime()+":����");
       
       
       System.out.println("--------------------------");
       
       //ֻҪ����������ֻ�������һ�������ʵ�� �Ϳ���ʵ�������һ����������ʱ���ˣ�
       
       gt=new IOTime();
       System.out.println(gt.getTime()+":����");
	}

}
