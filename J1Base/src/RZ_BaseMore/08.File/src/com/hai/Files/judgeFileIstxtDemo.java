package com.hai.Files;

import java.io.File;
import java.io.FilenameFilter;

public class judgeFileIstxtDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ж�ָ��Ŀ¼������ļ��Ƿ���txt�ĵ��������������
		// �жϷ����м��֣�1.���Խ�Ŀ¼�µ��ļ������ļ���ȫ�����ص�һ��String�����У������ж��Ƿ�Ϊ�ļ���֮�����ж��Ƿ���txt��β
		// ����������õڶ��ַ��� ��ֱ���ж����ļ���txt��β �� �������ֵ�����
		//����ķ������Ǻܲ���� ��
		File file = new File("D:\\");
		String[] list = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
		});
		for (String s : list) {
			System.out.println(s);
		}
	}

}
