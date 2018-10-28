package com.hai.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMapDemo {

	/**
	 * LinkedHashMap 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
       lhm.put("001", "张飞");
       lhm.put("002", "关羽");
       lhm.put("003", "刘备");
       lhm.put("004", "诸葛");
       lhm.put("004", "曹操");
       
       Set<String> ks = lhm.keySet();
       for(String s:ks){
    	   String names=lhm.get(s);
    	   System.out.println(names); //没诸葛了
       }
	}

}
