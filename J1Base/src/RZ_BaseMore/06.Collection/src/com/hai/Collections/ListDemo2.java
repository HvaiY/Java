package com.hai.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ע�⣺����������Ԫ�ص�ʱ��ͨ�������ǲ������޸�Ԫ�ص� �����ǵ������ǿ����޸�Ԫ�ص�
     //�б������
		//�б�������͵������и���ķ�����������һ��������ң�������listIterator lit;  lit.previous()
		List l=new ArrayList();
		l.add("Hello");
		l.add("World");
		l.add("Java");
		ListIterator lit = l.listIterator();
		//���������Ҫ��next()����֮�����ʹ�ã���Ȼ�����壨�����쳣����һ�㲻ʹ��
		while(lit.hasNext()){
			
			String s=(String)lit.next();
			System.out.println(s);
		}
		//������� (�����Ѿ������� �Ϳ������������)
		while(lit.hasPrevious()){
			
			String s=(String)lit.previous();
			System.out.println(s);
		}
		
	}

}
