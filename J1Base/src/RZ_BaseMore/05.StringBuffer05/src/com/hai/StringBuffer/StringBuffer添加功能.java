package com.hai.StringBuffer;

public class StringBuffer��ӹ��� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
//		StringBuffer sb = new StringBuffer();
//		StringBuffer sb2 = sb.append("Hello");// ������ʵ��һ������ ���ر�Ҫע��
//		System.out.println(sb);
//		System.out.println(sb2);
//		System.out.println(sb2 == sb);
		
		StringBuffer sb=new StringBuffer();
		sb.append("asd");
		sb.append(12);
		System.out.println(sb);
		//appendҲ������ʽ���Ŷ 
		
		//insert
		sb.insert(3, "��");//ָ��λ�ò������ݣ����ر���
		System.out.println(sb);
		// TODO Auto-generated method stub
		//ɾ��
		sb.deleteCharAt(2);//ɾ��ָ������λ�õ��ַ�
		System.out.println(sb);
		sb.delete(1, 3);//ɾ��ָ����ʼλ�úͽ���λ�õ��ַ�  ���󲻰��ұ�
		System.out.println(sb);
		System.out.println("-------------------------");
		
		StringBuffer sb2=new StringBuffer();
		sb2.append("hello").append("world").append("java");
		sb2.replace(5, 10, "����");//ָ��λ�ÿ�ʼ��ָ��λ�ý��� �滻Ϊ ��Ҫ���ַ���  ���󲻰��ұ�
		System.out.println(sb2);
		
		//��ת-------------------------------
		sb2.reverse();
		System.out.println(sb2);
		
		//��ȡ
		StringBuffer sb3=new StringBuffer();
		sb3.append("hello").append("world").append("java");
		//ע�� ����ֵ��String Ŷ 
		String s1=sb3.substring(2);//lloworldjava
		
		String s2=sb3.substring(2, 5);//llo    
		System.out.println(s1);
		System.out.println(s2);

	}

}
