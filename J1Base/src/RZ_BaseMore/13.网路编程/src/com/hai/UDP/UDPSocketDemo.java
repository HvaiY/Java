package com.hai.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSocketDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * UDP 协议发送数据 。。。。。。。。。。。。。。。。。。。。。。。。。。。。
		 * 1.创建Socket对象 2.创建数据包，并打包 3.调用Socket对象方法，发送数据 4.释放资源
		 */
		// 1.创建Socket对象
		DatagramSocket ds = new DatagramSocket();

		// 创建数据包
		// 需要发送的资源
		byte[] buf = "第一个Java UDP Socket发送数据".getBytes();
		// IP地址对象
		InetAddress address = InetAddress.getByName("192.168.8.229");
		int port = 10086;

		DatagramPacket p = new DatagramPacket(buf, 0, buf.length, address, port);

		// 调用socket方法发送 数据
		ds.send(p);
		// 4.释放资源
		ds.close();

	}

}
