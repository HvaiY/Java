package com.hai.ģ�����ģʽ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTime extends GetTime {

	@Override
	public void code() {

		try {
			//�ļ�д��Ļ��������ֽڣ�
			BufferedInputStream bf = new BufferedInputStream(
					new FileInputStream("a.avi"));  //a.avi�ļ����ڸ���Ŀ�ĸ�Ŀ¼
			//�ļ����������  
			BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream("b.avi"));
			//������
			byte[] b=new byte[1024];
			int len=0;
			//��ȡ���������� ����ȡ��ȡ�������ĳ���  ����Ϊ-1������ȡ�� 
			while((len=bf.read(b))!=-1){
				//�����������ֽ�����д�뵽�ļ�
				bo.write(b, 0, len);	
			}
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
