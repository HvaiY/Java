package com.hai.IOStream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class MemoeyStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//内存流
		
       PrintStream ps=new PrintStream("ps.txt");//内存字节流了  
       ps.print(97);//内存流写入就是酱紫 ，当然也可以使用流的方式写入   write 
       ps.println('a');
       ps.close();//内存流关闭没有意义，但是这里为了能够写入 到文档中 ，close()方法相当于调用了刷新的
       
       System.out.println("-------------------------");
       
       PrintWriter pw=new PrintWriter("pw.txt");//内存字符流
       pw.println(98);
       pw.println("你好，中国 ");
       pw.close();//内存流关闭没有意义，但是这里为了能够写入 到文档中 ，close()方法相当于调用了刷新的
       
       System.out.println("-----------------");
       
       //当然也是可以刷新使用
       PrintWriter pw2=new PrintWriter(new FileWriter("pw2.txt"), true);
       pw2.print(1213);
       pw2.close();
       
	}

}
