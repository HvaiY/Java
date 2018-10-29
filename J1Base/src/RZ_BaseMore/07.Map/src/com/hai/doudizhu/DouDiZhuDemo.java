package com.hai.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class DouDiZhuDemo {

	/**
	 * 1,创建一个map集合存储数据
	 * 2.创建一个list集合存储键  用来洗牌
	 * 3.创建四个TreeSet集合存储发牌及三家底牌
	 * 4.查看牌
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 存储所有的牌
         HashMap<Integer, String> hm = new HashMap<Integer, String>();
         String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
         String[] colors={"♠","♣","♥","♦"};
         ArrayList<Integer> arrayList = new ArrayList<Integer>();
         int n=0;
         //遍历存储数据到hashMap集合中 
         for(String s:number){
        	 for(String nu:colors){
        		String value=s.concat(nu);
        		arrayList.add(n);
        		hm.put(n, value);
        		n++;
        	 }
         }
         arrayList.add(n);
 		hm.put(n, "小王");
 		n++;
 		arrayList.add(n);
 		
		hm.put(n, "大王");
		//洗牌
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
         // 发牌   TreeSet 为了排序 ，自然排序
         TreeSet<Integer> liubei = new TreeSet<Integer>();
         TreeSet<Integer> zhangfei = new TreeSet<Integer>();
         TreeSet<Integer> guangyu = new TreeSet<Integer>();
         TreeSet<Integer> dipai = new TreeSet<Integer>();
         for (int i = 0; i < arrayList.size(); i++) {
			if(i>=arrayList.size()-3){				
				dipai.add(arrayList.get(i));
			}else if(i%3==1){
				liubei.add(arrayList.get(i));
			}else if(i%3==2){
				zhangfei.add(arrayList.get(i));
			}else{		
				guangyu.add(arrayList.get(i));
			}
		}
         //看牌
        looker("刘备", liubei, hm);
        looker("张飞", zhangfei, hm);
        looker("关羽", guangyu, hm);
        looker("底牌", dipai, hm);
	}
    public static void looker(String name, TreeSet<Integer> t, HashMap<Integer, String> hm) {
    	System.out.print(name+"的牌是：");
    	for(Integer in:t){
    		String string = hm.get(in);
    		System.out.print(string+"  ");
    	}
		System.out.println();
	}
}
