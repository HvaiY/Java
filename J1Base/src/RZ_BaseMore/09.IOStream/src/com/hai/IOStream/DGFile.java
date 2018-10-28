package com.hai.IOStream;

import java.io.File;

public class DGFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 递归出所有指定目录下的java文件
		File file=new File("D:\\WorkSpace\\Javae");
       getAllFileabsPath(file);
	}
    //递归啊 注意出来的条件哦
	private static void getAllFileabsPath(File file) {
		File[] listFiles = file.listFiles();
		for(File f:listFiles){
			if(f.isDirectory()){
				//递归调用
				getAllFileabsPath(f);
			}else{
				
				if(f.getName().endsWith(".java")){
					System.out.println(f.getAbsolutePath());
				}
			}
		}
		
	}

}
