package com.hai.CodingDecode;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CodingDecode {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//���������
		//�Ƿ�ָ������
		 // java��Ĭ�ϵı�������붼��GBK
		
		//��Ȼ����ָ���� ָ��������ҲҪָ�����뷽ʽ
		
           String s="���";
           //���� ��δָ������Ĭ������GBK  Ҳ����  s.getBytes("GBK")
           byte[] bytes = s.getBytes();
            //תΪ�ַ������������ʲô ������֮����ֽ�
           System.out.println(Arrays.toString(bytes));
           //���� Ĭ��Ҳ��GBK
             String string = new String(bytes);
             System.out.println(string);
             
             //ָ�����뷽ʽ   --------��Ҫ��ͬ�ķ�ʽ���� ----------------------
             System.out.println("-----------------");
             String ss="���Java";
             
             byte[] bytes2 = ss.getBytes("UTF-8");
             System.out.println(Arrays.toString(bytes2));
             
             System.out.println(new String(bytes2,"UTF-8"));
            		 
	}

}
