/**
 * ѧ���������е����ԣ�Ҳ������
 */

package com.hai.person;

public class Student extends Person implements jump {

	@Override
	public void jumps() {
		System.out.println("ѧ�����ĺܸ�");

	}

	@Override
	public void eat() {
	System.out.println("ѧ��������");

	}

	@Override
	public void sleep() {
		System.out.println("��˭������ѧ��");

	}

}
