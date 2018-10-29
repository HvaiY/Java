package com.hai.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("192.168.10.123", 12345);
		//发送数据
		OutputStream os = s.getOutputStream();
		os.write("TCP，我来啦".getBytes());
		
          s.close();
	}

}
