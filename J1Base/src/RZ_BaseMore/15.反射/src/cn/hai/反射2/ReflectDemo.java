package cn.hai.����2;

import java.lang.reflect.Constructor;

//import com.hai.����.Person;

public class ReflectDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//��ȡ�ֽ������   
		Class c = Class.forName("com.hai.����.Person");
		
	/*	String name = c.getName();
		System.out.println(name);
		*/
		
		//��ȡ���εĹ��췽��
		Constructor con = c.getConstructor(String.class,int.class);
		
		//��������Ķ���
		Object o = con.newInstance("�ŷ�",18);
		 
//		//ת��Ϊ�ö�����Ե����䷽��
//		Person p=(Person)o;
//		p.show();
		System.out.println(o);
		
		//����˽�еĹ��췽��  ******************************************
		
		Constructor con2 = c.getDeclaredConstructor(String.class);
		 //ȥ�����η�Ч��  ������
		con2.setAccessible(true);
		
		
		Object o2 = con2.newInstance("����");
		System.out.println(o2);

	}

}
