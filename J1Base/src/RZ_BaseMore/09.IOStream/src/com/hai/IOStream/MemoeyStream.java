package com.hai.IOStream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class MemoeyStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//�ڴ���
		
       PrintStream ps=new PrintStream("ps.txt");//�ڴ��ֽ�����  
       ps.print(97);//�ڴ���д����ǽ��� ����ȻҲ����ʹ�����ķ�ʽд��   write 
       ps.println('a');
       ps.close();//�ڴ����ر�û�����壬��������Ϊ���ܹ�д�� ���ĵ��� ��close()�����൱�ڵ�����ˢ�µ�
       
       System.out.println("-------------------------");
       
       PrintWriter pw=new PrintWriter("pw.txt");//�ڴ��ַ���
       pw.println(98);
       pw.println("��ã��й� ");
       pw.close();//�ڴ����ر�û�����壬��������Ϊ���ܹ�д�� ���ĵ��� ��close()�����൱�ڵ�����ˢ�µ�
       
       System.out.println("-----------------");
       
       //��ȻҲ�ǿ���ˢ��ʹ��
       PrintWriter pw2=new PrintWriter(new FileWriter("pw2.txt"), true);
       pw2.print(1213);
       pw2.close();
       
	}

}
