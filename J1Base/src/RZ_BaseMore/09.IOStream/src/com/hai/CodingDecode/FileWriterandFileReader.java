package com.hai.CodingDecode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterandFileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	//�򻯵��ַ������󣬷�װ��������
		//FileReader  �൱��  InputStreamReader
		//FileWriter �൱��   OutPutStreamWriter
		
	//�ļ� ���Ƶ�ʵ��   Ĭ�ϵı��뷽ʽ��GBK�� ���ﲻ��ָ�����뷽ʽ ����Ҫָ�����뷽ʽ����Ҫʹ�����  InputStreamReader ����
		FileReader fr=new FileReader("a.txt");
		FileWriter fw=new FileWriter("b.txt");
		
		//��ʼ�ļ��Ķ�ȡ   ��д��
		//ʹ�ö�ȡ�ַ�����ķ�ʽ 
		char[] chs=new char[1024];
		int len=0;
		while((len=fr.read(chs))!=-1){
			//��ȡ��ÿ��д��һ���ַ����� ʹ���ַ�д����
			
			fw.write(chs, 0, len);
			//������ݽϴ� ����ѡ�� ˢ�� �ַ�д�� �� ����ʵ�ڹر��ַ�д������ʱ�� ���ǵ���ˢ�·����ģ�
			//����ˢ�·���֮���ܼ���ʹ����д�� �����close() �Ǿ�ؿ�취д���ˡ������쳣
			fw.flush();
		}
		//�ͷ���Դ 
		fr.close();
		fw.close();

	}

}
