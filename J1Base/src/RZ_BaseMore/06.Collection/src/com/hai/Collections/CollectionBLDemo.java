package com.hai.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionBLDemo {

	/**
	 * @param args
	 * ���ϵı��������λ�ȡ���ϵ�Ԫ��
	 *  1.תΪ�����������飬�൱�ڱ����˼���
	 *  2. Iterator ʹ�õ���  ���������򼯺϶�����û�м��ϣ�������û���κ�����
	 */
	public static void main(String[] args) {
		//�������϶���
		Collection c=new ArrayList();
        //���Ԫ��
		c.add("Hello");
		c.add("Wrold");
		c.add("Java");
		Object[] array = c.toArray();
	
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+"---------"+((String)array[i]).length());
		}
		System.out.println("------------------------");
		
		
		//������ʹ�á���������������������������������������������������
		Iterator it=c.iterator();
		//�ж��Ƿ�����һ��Ԫ��
		//it.hasNext();//����boolean
		//it.next();//�ҵ���һ��Ԫ��  object����
		//����  
		 while(it.hasNext()){
			 //ע�⣬it.next();  �÷������鲻Ҫ�ظ�ʹ�ã�next()��ʾ������һ��
			 System.out.println(it.next());
		 }
	}

}
