package com.hai.ģ�����ģʽ;

public abstract class GetTime {

   //����ĳ�δ���ִ��ʱ�����   �൱��һ��ģ��
	   public long getTime(){
		   
		   long start = System.currentTimeMillis();
		   code();
		   long end = System.currentTimeMillis();
		  
		   return end-start;
	   }
    //  �������ģ������Ҫ�Ĵ��� 
   public abstract void code();
}
