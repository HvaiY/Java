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
		//����������Socket
		ServerSocket ss=new ServerSocket(12345);
		//����
		Socket s = ss.accept();
		//��ȡ���ݲ���ʾ
      InputStream is = s.getInputStream();
      
      byte[] b=new byte[1024];
      int len = is.read(b,0,b.length);
      
      System.out.println(new String(b,0,len));
      
	}

}
