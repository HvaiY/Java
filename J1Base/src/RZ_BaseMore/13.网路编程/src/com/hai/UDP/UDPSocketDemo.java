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
		 * UDP Э�鷢������ ��������������������������������������������������������
		 * 1.����Socket���� 2.�������ݰ�������� 3.����Socket���󷽷����������� 4.�ͷ���Դ
		 */
		// 1.����Socket����
		DatagramSocket ds = new DatagramSocket();

		// �������ݰ�
		// ��Ҫ���͵���Դ
		byte[] buf = "��һ��Java UDP Socket��������".getBytes();
		// IP��ַ����
		InetAddress address = InetAddress.getByName("192.168.8.229");
		int port = 10086;

		DatagramPacket p = new DatagramPacket(buf, 0, buf.length, address, port);

		// ����socket�������� ����
		ds.send(p);
		// 4.�ͷ���Դ
		ds.close();

	}

}
