package com.hai.CodingDecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;



public class StreamCodingDecode {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//�ַ����ı���ͽ���  ʹ��ת����
		//Ĭ�ϱ����� GBK(д���ע���ļ��򿪷�ʽ�ı�����GBK)
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("osw.txt"));
		 
		osw.write("��ã�java");
		
		osw.close();
		//ָ������    UTF-8
		OutputStreamWriter osw2=new OutputStreamWriter(new FileOutputStream("osw2.txt"),"UTF-8");
		 
		osw2.write("��ã�java");
		
		osw2.close();
		
		//ת�����Ķ�ȡ
		
		//��ȡת�����ķ�ʽҲ��һ�� ����ָ����������ȡ  ����ʱ����ôд�� ��ʱ�����ô��ȡ
		//���������� ��ת������
		InputStreamReader  isr=new InputStreamReader(new FileInputStream("osw2.txt"),"UTF-8");
		/*//��ȡ��ʽһ  �����ֽڶ�ȡ
		 int ch=0;
		 while((ch=isr.read())!=-1){
			 System.out.print((char)ch);
		 }*/
		//��ȡ��ʽ��
		int len=0;
		char[] ch=new char[1024];
		while((len=isr.read(ch, 0, ch.length))!=-1)
	       System.out.println(new String(ch,0,len));
		
		//�ر���  �ͷ���Դ
		isr.close();

	}

}
