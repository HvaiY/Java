package com.hai.模板设计模式;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTime extends GetTime {

	@Override
	public void code() {

		try {
			//文件写入的缓冲流（字节）
			BufferedInputStream bf = new BufferedInputStream(
					new FileInputStream("a.avi"));  //a.avi文件放在该项目的根目录
			//文件输出缓冲流  
			BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("b.avi"));
			//缓冲区
			byte[] b=new byte[1024];
			int len=0;
			//读取流到缓冲区 并获取读取到的流的长度  ，不为-1继续读取流 
			while((len=bf.read(b))!=-1){
				//将缓冲区的字节数组写入到文件
				bo.write(b, 0, len);	
			}
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
