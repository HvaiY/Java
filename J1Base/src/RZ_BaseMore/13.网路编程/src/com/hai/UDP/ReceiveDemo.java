package com.hai.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	/*	UDP  协议接收数据
		A.创建接收端的Socket
		B.创建一个数据包（接收容器）
		C.调用Socket对象接收数据的方法
		D.解析数据包，并显示在控制台
		E.释放资源*/
		DatagramSocket ds=new DatagramSocket(10086);
		
		
		byte[] buf=new byte[1024];
		int len=buf.length;
		
         DatagramPacket dp=new DatagramPacket(buf, len);
         
         ds.receive(dp);
         
         //解析
         byte[] data = dp.getData();//获取到的数据
         int length = dp.getLength();//获取到的数据数据
         String string = new String(data,0,length);
         String address = dp.getAddress().getHostAddress();
         int port = dp.getPort();
         
         System.out.println(address+":"+port+":"+string);
         ds.close();
	}

}
