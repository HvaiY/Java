package com.hai.IOStream;

import java.io.File;

public class DGFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ݹ������ָ��Ŀ¼�µ�java�ļ�
		File file=new File("D:\\WorkSpace\\Javae");
       getAllFileabsPath(file);
	}
    //�ݹ鰡 ע�����������Ŷ
	private static void getAllFileabsPath(File file) {
		File[] listFiles = file.listFiles();
		for(File f:listFiles){
			if(f.isDirectory()){
				//�ݹ����
				getAllFileabsPath(f);
			}else{
				
				if(f.getName().endsWith(".java")){
					System.out.println(f.getAbsolutePath());
				}
			}
		}
		
	}

}
