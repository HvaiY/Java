package com.hai.UDP键盘输入;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String line=null;
	while((line=br.readLine())!=null){
	  if("886".equals(line)){
		  break;
	    }
			byte[] buf = line.getBytes();
			DatagramPacket dp=new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.1.255"), 10086);
			//发送数据
			ds.send(dp);
	   }
		//释放资源
		ds.close();

	}

}
