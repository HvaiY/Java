package com.hai.����;

public class ���ͽӿ�Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*//��һ�ַ��ͽӿ�
		Flay<String> flays = new Flays();//���ͽӿڶ�̬ ���ֲ�����
		flays.show("aaaaaaaa");*/
		
		//�ڶ���  
     Flay<String> f=new CopyOfFlays<String>();
     f.show("�Ǻ�");
     Flay<Integer> f1=new CopyOfFlays<Integer>();
     f1.show(123);
	}

}
