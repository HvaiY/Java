package com.hai.CodingDecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		write();
		read();

	}

	private static void read() throws IOException {
		//读取和写入的顺序 要一致啊  一致啊 
		DataInputStream dis=new DataInputStream(new FileInputStream("dos.txt"));
		byte b = dis.readByte();
		
		char c = dis.readChar();
		
		double d = dis.readDouble();
		float f = dis.readFloat();
		boolean bb = dis.readBoolean();
	
		
		dis.close();
		System.out.println(b);
		System.out.println(bb);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
	
		
	}
   //数据写（数据类型）
	private static void write() throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("dos.txt"));
		dos.writeByte(10);
		dos.writeChar(97);
		dos.writeDouble(12.34);
		dos.writeFloat(23.45F);
		dos.writeBoolean(false);
		
		dos.close();
		
	}

}
