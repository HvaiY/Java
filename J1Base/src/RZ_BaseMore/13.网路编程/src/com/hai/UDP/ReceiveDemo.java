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
	/*	UDP  Э���������
		A.�������ն˵�Socket
		B.����һ�����ݰ�������������
		C.����Socket����������ݵķ���
		D.�������ݰ�������ʾ�ڿ���̨
		E.�ͷ���Դ*/
		DatagramSocket ds=new DatagramSocket(10086);
		
		
		byte[] buf=new byte[1024];
		int len=buf.length;
		
         DatagramPacket dp=new DatagramPacket(buf, len);
         
         ds.receive(dp);
         
         //����
         byte[] data = dp.getData();//��ȡ��������
         int length = dp.getLength();//��ȡ������������
         String string = new String(data,0,length);
         String address = dp.getAddress().getHostAddress();
         int port = dp.getPort();
         
         System.out.println(address+":"+port+":"+string);
         ds.close();
	}

}
