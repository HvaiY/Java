package com.hai.����;

import java.util.ArrayList;
import java.util.Collection;

/*
 * JDK5�������� ���Զ���װ�䣬���ͣ���ǿfor,��̬���룬�ɱ������ö��
 * ��ǿfor����forѭ����һ��
 * */

public class JDK5New���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//�������鿴��
		int[] arr={12,23,4,66};
		for(int x:arr){
			System.out.println(x);
		}
		System.out.println("---------------------");
 //�������Ͽ���   ��ǿ��for���ﱾ���ǵ�������ʹ��
		//ʹ����ǿ��for ��Ҫ�жϼ��ϻ��������Ƿ�Ϊ�գ�null���ܱ���
		Collection<String> c=new ArrayList<String>();
		c.add("��Ԫ��");
		c.add("��ɽ����");
		c.add("��Ÿ");
		for(String s:c){
			
			System.out.println(s);
		}
	}

}
