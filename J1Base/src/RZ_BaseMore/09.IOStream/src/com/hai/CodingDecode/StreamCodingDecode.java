package com.hai.CodingDecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;



public class StreamCodingDecode {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//字符流的编码和解码  使用转换流
		//默认编码是 GBK(写入后注意文件打开方式的编码是GBK)
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"));
		 
		osw.write("你好，java");
		
		osw.close();
		//指定编码    UTF-8
		OutputStreamWriter osw2=new OutputStreamWriter(new FileOutputStream("osw2.txt"),"UTF-8");
		 
		osw2.write("你好，java");
		
		osw2.close();
		
		//转换流的读取
		
		//读取转换流的方式也是一样 可以指定编码来读取  ，当时是怎么写的 这时候就怎么读取
		//创建流对象 （转换流）
		InputStreamReader  isr=new InputStreamReader(new FileInputStream("osw2.txt"),"UTF-8");
		/*//读取方式一  单个字节读取
		 int ch=0;
		 while((ch=isr.read())!=-1){
			 System.out.print((char)ch);
		 }*/
		//读取方式二
		int len=0;
		char[] ch=new char[1024];
		while((len=isr.read(ch, 0, ch.length))!=-1)
	       System.out.println(new String(ch,0,len));
		
		//关闭流  释放资源
		isr.close();

	}

}
