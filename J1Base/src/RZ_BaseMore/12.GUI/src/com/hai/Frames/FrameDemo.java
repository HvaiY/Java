package com.hai.Frames;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建窗口对象
		Frame f=new Frame("HelloWorld");
		
		//重新设置标题
		
		f.setTitle("大海");
       //设置位置
		f.setLocation(400, 300);
		f.setSize(300, 200);//设置窗口宽  高  像素
		
		//显示窗口
		f.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.setBounds(300, 200, 500, 400);//同事设置 位置和大小  
		
		//windows窗体关闭 事件监听
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);//退出虚拟机实现关闭效果 
			}
		});
	}

}
