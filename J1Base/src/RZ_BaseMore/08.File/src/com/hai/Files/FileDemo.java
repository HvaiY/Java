package com.hai.Files;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1�������ļ��� �ļ���ʱ��������ڶ�Ӧ�ļ��л����ļ�������false 
		//2.����·�������·�� 
		    // 2.1���·������ָ���̷���·�������ļ������ļ���  ��Ĭ�ϴ������ļ��л����ļ�����ĿĿ¼��
		    //2.2����·����ָ�����̷���·��
		//�����ļ���
		File file1=new File("D:\\test");
		boolean mkdir = file1.mkdir();//��������һ���ļ��У�
		System.out.println(mkdir);
      //�����ļ�
		File file2=new File("D:\\test\\a.txt");
		try {
			//�����ļ�һ��ע���ļ�Ŀ¼�Ƿ����
			boolean createNewFile = file2.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   //���������ļ���
		File file3=new File("D:\\test\\aa\\bb\\cc\\dd");
		System.out.println(file3.mkdirs());
		
		System.out.println("-----------------------------");
		
		//������    ע�� ����������������ļ�file����ĳ�ʼ�������еĲ�������ͬһ��Ŀ¼�����ִ�еĽ���൱�ڼ��е�Ч����
		File file4=new File("D:\\test\\a.txt");
		File file5=new File("D:\\test\\sa.txt");
		boolean renameTo = file4.renameTo(file5);
		System.out.println(renameTo);
		
		System.out.println("------------------------");
		//�ļ�ɾ��  ɾ�� ��ע�� �� 1 ����ɾ�������ļ�ֱ��ɾ���˲��ᵽ����վ 2 delete() ɾ���ļ���ֻ��ɾ��û�����ݵ��ļ���
		File file6=new File("D:\\test\\sa.txt");
		boolean delete = file6.delete();
		System.out.println(delete);
		//�ж�  
		File files=new File("D:\\test\\dahai.txt");
		try {
			files.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//��ӡ�쳣������̨
		}
		System.out.println(files.isDirectory()); //�Ƿ�ΪĿ¼
		System.out.println(files.isFile());//�Ƿ�Ϊ�ļ�
		System.out.println(files.exists());//�ļ��Ƿ����
		System.out.println(files.canRead());//�ļ��Ƿ�ɶ�
		System.out.println(files.canWrite());//�ļ��Ƿ��д
		System.out.println(files.isHidden());//�ļ��Ƿ������ļ�
		
			//��ȡ�ļ����Ե�
		
		File f=new File("test\\dahai.txt");
		
		System.out.println(f.getAbsolutePath());//��ȡ����·��
		System.out.println(f.getPath());//��ȡ���·��
		System.out.println(f.length());//��ȡ�ļ���С���ֽ���
		System.out.println(f.getName());//��ȡ�ļ�����
		long lastModified = f.lastModified(); //��ȡ�ļ�����޸ĵ�ʱ��  ������
		System.out.println(lastModified);
		//�����Ǹ�ʽ��ʱ����ʾ����   ������ʾ������
		Date d=new Date(lastModified);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(d);
		System.out.println(format);
		System.out.println("___________________");
		//��ȡָ��Ŀ¼�µ�Ŀ¼�����ļ����� ��String ��File �������飩
		File filepa = new File("D:\\");
		String[] list = filepa.list();
		for(String s:list){
			System.out.println(s);
			
		}
		System.out.println("+++++++++++++++++++++++");
		//�õ��ļ�����  ��� ������
		File[] listFiles = filepa.listFiles();
		for(File ff:listFiles){
			
			System.out.println(ff.getName());
		}
		
	}

}
