package com.hai.UDP��������;

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
		//��������
		DatagramSocket ds=new DatagramSocket(10086);
		while(true){
		//���ô��������
		byte[] b=new byte[1024];
		DatagramPacket p=new DatagramPacket(b, b.length);
		//�������ݵ�����
         ds.receive(p);
         //������
         
         String ip = p.getAddress().getHostName();
         
         byte[] data = p.getData();
         int length = p.getLength();
         
         String s=new String(data, 0, length);
         
         System.out.println(ip+"�����ˣ�"+s);
		}
	}

}
