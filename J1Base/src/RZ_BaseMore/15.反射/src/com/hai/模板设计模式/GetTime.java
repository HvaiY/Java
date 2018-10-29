package com.hai.模板设计模式;

public abstract class GetTime {

   //计算某段代码执行时间的类   相当于一个模板
	   public long getTime(){
		   
		   long start = System.currentTimeMillis();
		   code();
		   long end = System.currentTimeMillis();
		  
		   return end-start;
	   }
    //  这里才是模板中需要的代码 
   public abstract void code();
}
