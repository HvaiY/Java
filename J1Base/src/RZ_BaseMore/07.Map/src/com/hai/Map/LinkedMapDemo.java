package com.hai.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMapDemo {

	/**
	 * LinkedHashMap �ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
       lhm.put("001", "�ŷ�");
       lhm.put("002", "����");
       lhm.put("003", "����");
       lhm.put("004", "���");
       lhm.put("004", "�ܲ�");
       
       Set<String> ks = lhm.keySet();
       for(String s:ks){
    	   String names=lhm.get(s);
    	   System.out.println(names); //û�����
       }
	}

}
