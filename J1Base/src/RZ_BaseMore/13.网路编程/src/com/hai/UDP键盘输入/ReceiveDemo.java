package com.hai.UDP键盘输入;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//创建对象
		DatagramSocket ds=new DatagramSocket(10086);
		while(true){
		//设置打包缓冲区
		byte[] b=new byte[1024];
		DatagramPacket p=new DatagramPacket(b, b.length);
		//接收数据到包中
         ds.receive(p);
         //解析包
         
         String ip = p.getAddress().getHostName();
         
         byte[] data = p.getData();
         int length = p.getLength();
         
         String s=new String(data, 0, length);
         
         System.out.println(ip+"发来了："+s);
		}
	}

}
