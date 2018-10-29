package com.hai.Files;

import java.io.File;
import java.io.FilenameFilter;

public class judgeFileIstxtDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 判断指定目录下面的文件是否有txt文档并输出对于名称
		// 判断方法有几种，1.可以将目录下的文件或者文件夹全部加载到一个String数组中，再来判断是否为文件，之后再判断是否以txt结尾
		// 我们这里采用第二种方案 ，直接判断是文件并txt结尾 后 加载名字到集合
		//下面的方法还是很不错的 ，
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
