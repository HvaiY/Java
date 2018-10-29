package com.hai.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//创建服务器Socket
		ServerSocket ss=new ServerSocket(12345);
		//监听
		Socket s = ss.accept();
		//获取数据并显示
      InputStream is = s.getInputStream();
      
      byte[] b=new byte[1024];
      int len = is.read(b,0,b.length);
      
      System.out.println(new String(b,0,len));
      
	}

}
