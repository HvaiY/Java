package com.hai.����;

public class �������෺�� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�෺��  ȥ�������
		Person<String> person = new Person<String>();
        person.show("abc");
        //��������  ȥ����������֪���� 
        Animal animal = new Animal();
        animal.show("������");
        animal.show(123);
        animal.show(true);
	}

}
