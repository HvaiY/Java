package com.hai.CodingDecode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterandFileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	//简化的字符流对象，封装成子类了
		//FileReader  相当于  InputStreamReader
		//FileWriter 相当于   OutPutStreamWriter
		
	//文件 复制的实例   默认的编码方式“GBK” 这里不能指定编码方式 ，需要指定编码方式还需要使用这个  InputStreamReader 父类
		FileReader fr=new FileReader("a.txt");
		FileWriter fw=new FileWriter("b.txt");
		
		//开始文件的读取   与写入
		//使用读取字符数组的方式 
		char[] chs=new char[1024];
		int len=0;
		while((len=fr.read(chs))!=-1){
			//读取后每次写入一个字符数组 使用字符写入流
			
			fw.write(chs, 0, len);
			//如果数据较大 可以选择 刷新 字符写入 流 （其实在关闭字符写入留的时候 就是调用刷新方法的）
			//调用刷新方法之后还能继续使用流写入 ，如果close() 那就乜办法写入了。出现异常
			fw.flush();
		}
		//释放资源 
		fr.close();
		fw.close();

	}

}
