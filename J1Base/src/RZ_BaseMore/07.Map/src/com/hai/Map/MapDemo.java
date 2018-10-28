package com.hai.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   //Map����
		  Map<String, String> map = new HashMap<String, String>();
		  map.put("������", "��ӱ");
		  map.put("����", "����");
		  map.put("����", "�����P");
		  map.put("�˳�", "��ٳ");
		  
		  System.out.println(map);
		  
		  //��ȡ
		  String string = map.get("����");
		  System.out.println(string);
		  
		  boolean containsKey = map.containsKey("����");
		  System.out.println(containsKey);
		  System.out.println(map);
		  System.out.println("-------------------------");
		  boolean containsValue = map.containsValue("��ٳ");
		  System.out.println(containsValue);
		  System.out.println(map);
		  System.out.println("-----------------------------");
		  //�����Ƴ���key��ֵ
		  String remove = map.remove("����");
		  System.out.println(remove);
		  System.out.println(map);
		  //��ȡ���е�key
		  Set<String> keySet = map.keySet();
		  System.out.println(keySet);
		  //��ȡ���е�value
		  Collection<String> values = map.values();
		  System.out.println(values);
		  System.out.println("--------------------");
		  int j = map.size();
		  System.out.println(j);
		  
		  System.out.println("=+++++++++++");
		  //Map���ϵı���
		      //���ݼ��ҵ�ֵ  ��ʽһ
		Set<String> ks = map.keySet(); //�õ����еļ�  
		//��ǿforѭ���ҵ�ֵ
		for(String s:ks){
			String key=s;
			String value=map.get(key);
			System.out.println(key+"-------"+value);
		}
		
		  System.out.println("=+++++++++++");
		  //��ʽ�� ���ݼ�ֵ�����ҵ���ֵ
		  Set<Entry<String, String>> entrySet = map.entrySet();
		  for(Entry<String, String> es:entrySet){
			  String key=es.getKey();
			  String value=es.getValue();
			  System.out.println(key+"-------------"+value);
			  
		  }
	}

}
