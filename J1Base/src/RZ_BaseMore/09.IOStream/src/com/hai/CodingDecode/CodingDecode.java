package com.hai.CodingDecode;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CodingDecode {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//编码与解码
		//是否指定编码
		 // java中默认的编码与解码都是GBK
		
		//当然可以指定， 指定编码是也要指定解码方式
		
           String s="你好";
           //编码 。未指定编码默认是是GBK  也可以  s.getBytes("GBK")
           byte[] bytes = s.getBytes();
            //转为字符串输出看看是什么 ，编码之后的字节
           System.out.println(Arrays.toString(bytes));
           //解码 默认也是GBK
             String string = new String(bytes);
             System.out.println(string);
             
             //指定编码方式   --------需要相同的方式解码 ----------------------
             System.out.println("-----------------");
             String ss="你好Java";
             
             byte[] bytes2 = ss.getBytes("UTF-8");
             System.out.println(Arrays.toString(bytes2));
             
             System.out.println(new String(bytes2,"UTF-8"));
            		 
	}

}
