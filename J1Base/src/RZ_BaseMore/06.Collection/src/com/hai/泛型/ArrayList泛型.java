package com.hai.����;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      //���ͣ������ļ���Ҳһ��
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("Java");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}

	}

}
