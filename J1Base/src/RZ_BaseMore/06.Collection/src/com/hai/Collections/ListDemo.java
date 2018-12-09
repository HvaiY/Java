package com.hai.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	/**
	 * @param args
	 * list  ����  ����� ���ظ���
	 */
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add("Java");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			
			System.out.println(iterator.next());
		}
    //list���ϳ��˸���ļ���(Collection)�����⻹�߱��Լ����еĹ��� 
		//example 
      /*
       * list ���й���
       *   A: ��ӹ���
       *       add(int index ,Object obj); //ָ��λ�����Ԫ��
       *       
       *   B:��ȡ����  
       *        get(int index);
       *   C:�б������  ListIterator();  //list�������еĵ�����
       *   D:ɾ������ :Object remove(int index); //ɾ��ָ��λ�õ�Ԫ�أ����ر��޸ĵ�Ԫ��
       *   E:�޸Ĺ��ܣ� Object set(int index,Object obj);
       * */	
		
		System.out.println("-----------------");
		list.add(1, "Andriod");
		System.out.println(list);//�������㿪ʼ�����ڶ���λ�������һ��Ԫ��
		list.add(4,"abc");
		System.out.println(list);//�����һ��λ������� һ��Ԫ��  success
//	list.add(6, "ssss");//�����������ޣ���˱����м����һ��Ԫ�������ˣ�
//		System.out.println(list);
		
		System.out.println(list.get(4));//���������������ͬ������
		System.out.println(list.remove(4));//ע�ⲻҪ������������ ,���ر��Ƴ���Ԫ��
		Object set = list.set(2, "wwwww");//���ص��Ǳ��޸ĵ��Ǹ�Ԫ�ء�
		System.out.println(set);
		System.out.println(list);
	}

}
