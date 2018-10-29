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
		
		//1。创建文件夹 文件的时候如果存在对应文件夹或者文件，返回false 
		//2.绝对路径和相对路径 
		    // 2.1相对路径：不指定盘符的路径创建文件或者文件夹  ，默认创建的文件夹或者文件在项目目录下
		    //2.2绝对路径：指定了盘符的路径
		//创建文件夹
		File file1=new File("D:\\test");
		boolean mkdir = file1.mkdir();//创建的是一个文件夹，
		System.out.println(mkdir);
      //创建文件
		File file2=new File("D:\\test\\a.txt");
		try {
			//创建文件一定注意文件目录是否存在
			boolean createNewFile = file2.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   //创建深层的文件夹
		File file3=new File("D:\\test\\aa\\bb\\cc\\dd");
		System.out.println(file3.mkdirs());
		
		System.out.println("-----------------------------");
		
		//重命名    注意 如果重名命是两个文件file对象的初始化方法中的参数不是同一个目录，最后执行的结果相当于剪切的效果了
		File file4=new File("D:\\test\\a.txt");
		File file5=new File("D:\\test\\sa.txt");
		boolean renameTo = file4.renameTo(file5);
		System.out.println(renameTo);
		
		System.out.println("------------------------");
		//文件删除  删除 需注意 ： 1 这里删除就是文件直接删除了不会到回收站 2 delete() 删除文件夹只能删除没有内容的文件夹
		File file6=new File("D:\\test\\sa.txt");
		boolean delete = file6.delete();
		System.out.println(delete);
		//判断  
		File files=new File("D:\\test\\dahai.txt");
		try {
			files.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//打印异常到控制台
		}
		System.out.println(files.isDirectory()); //是否为目录
		System.out.println(files.isFile());//是否为文件
		System.out.println(files.exists());//文件是否存在
		System.out.println(files.canRead());//文件是否可读
		System.out.println(files.canWrite());//文件是否可写
		System.out.println(files.isHidden());//文件是否隐藏文件
		
			//获取文件属性等
		
		File f=new File("test\\dahai.txt");
		
		System.out.println(f.getAbsolutePath());//获取绝对路径
		System.out.println(f.getPath());//获取相对路径
		System.out.println(f.length());//获取文件大小，字节数
		System.out.println(f.getName());//获取文件名称
		long lastModified = f.lastModified(); //获取文件最后修改的时间  毫秒数
		System.out.println(lastModified);
		//下面是格式化时间显示出来   不再显示毫秒数
		Date d=new Date(lastModified);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(d);
		System.out.println(format);
		System.out.println("___________________");
		//获取指定目录下的目录或者文件数组 （String 和File 两个数组）
		File filepa = new File("D:\\");
		String[] list = filepa.list();
		for(String s:list){
			System.out.println(s);
			
		}
		System.out.println("+++++++++++++++++++++++");
		//拿到文件数组  这个 很有用
		File[] listFiles = filepa.listFiles();
		for(File ff:listFiles){
			
			System.out.println(ff.getName());
		}
		
	}

}
