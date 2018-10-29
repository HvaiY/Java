package com.hai.Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	/**
	 * ���ں������Red-Black tree���� NavigableMap ʵ�֡�
	 * ��ӳ������������Ȼ˳��������򣬻��߸��ݴ���ӳ��ʱ�ṩ�� Comparator �������򣬾���ȡ����ʹ�õĹ��췽���� 
	 * @param args
	 */
	public static void main(String[] args) {
		//���ָ�����������ļ�����Ҫָ�����������Ȼ���� ���������������Ȼ������
		TreeMap<Student, String> treeMap = new TreeMap<Student, String>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				int num=o1.getAge()-o2.getAge();//�Ƚ����� ����   ����� o2.getAge()-o1.getAge()  ��ô���ǽ���
				num=num==0?o1.getName().compareTo(o2.getName()):num;  //compareTo �ڲ��Ƚϳ��� ͬ�±Ƚ��ַ�����ͨ����ϣ��
				return num;
			}
		});
	  Student s1 = new Student("����",33);
	  Student s2 = new Student("�ŷ�",31);
	  Student s3 = new Student("����",35);
	  Student s4 = new Student("����",38);
	  Student s5 = new Student("����",33);
	  treeMap.put(s1, "����");  //ͨ����Ȼ����  ����������s5�滻�� ��Key��һ���ģ�
	  treeMap.put(s2, "���");
	  treeMap.put(s3, "�屡����");
	  treeMap.put(s4, "������");
	  treeMap.put(s5, "������");
    
	  Set<Student> ks = treeMap.keySet();
	  for(Student s:ks){
		  String ss=treeMap.get(s);
		  System.out.println(s.getName()+" -----"+s.getAge()+" -------"+ss);
		  
	  }
	}

}
