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
	   //Map集合
		  Map<String, String> map = new HashMap<String, String>();
		  map.put("黄晓明", "杨颖");
		  map.put("大鹏", "柳岩");
		  map.put("文章", "马伊琍");
		  map.put("邓超", "孙俪");
		  
		  System.out.println(map);
		  
		  //获取
		  String string = map.get("文章");
		  System.out.println(string);
		  
		  boolean containsKey = map.containsKey("文章");
		  System.out.println(containsKey);
		  System.out.println(map);
		  System.out.println("-------------------------");
		  boolean containsValue = map.containsValue("孙俪");
		  System.out.println(containsValue);
		  System.out.println(map);
		  System.out.println("-----------------------------");
		  //返回移除的key的值
		  String remove = map.remove("文章");
		  System.out.println(remove);
		  System.out.println(map);
		  //获取所有的key
		  Set<String> keySet = map.keySet();
		  System.out.println(keySet);
		  //获取所有的value
		  Collection<String> values = map.values();
		  System.out.println(values);
		  System.out.println("--------------------");
		  int j = map.size();
		  System.out.println(j);
		  
		  System.out.println("=+++++++++++");
		  //Map集合的遍历
		      //根据键找到值  方式一
		Set<String> ks = map.keySet(); //拿到所有的键  
		//增强for循环找到值
		for(String s:ks){
			String key=s;
			String value=map.get(key);
			System.out.println(key+"-------"+value);
		}
		
		  System.out.println("=+++++++++++");
		  //方式二 根据键值对象找到键值
		  Set<Entry<String, String>> entrySet = map.entrySet();
		  for(Entry<String, String> es:entrySet){
			  String key=es.getKey();
			  String value=es.getValue();
			  System.out.println(key+"-------------"+value);
			  
		  }
	}

}
