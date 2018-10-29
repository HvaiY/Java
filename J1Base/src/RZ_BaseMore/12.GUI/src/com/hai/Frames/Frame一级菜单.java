package com.hai.Frames;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame一级菜单 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建窗口对象
		Frame f = new Frame("案例三");
		f.setBounds(300, 200, 500, 400);// 同事设置 位置和大小

		f.setLayout(new FlowLayout());// 设置流布局
	
		//创建菜单栏对象
	 MenuBar mb=new MenuBar();
	 //创建菜单
	 Menu m=new Menu("文件");
	 //创建菜单条目
	 MenuItem mi=new MenuItem("退出系统");
	 //添加 条目到菜单 ，将菜单加到菜单栏   将菜单栏设置到窗口 
	 m.add(mi);
	 mb.add(m);
	 f.setMenuBar(mb);
	 
	 //给菜单条目加一个行为
	 mi.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {		   
			System.exit(0);
		}
	});
		
		

		// windows窗体关闭 事件监听
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);// 退出虚拟机实现关闭效果
			}
		});
		f.setVisible(true);

	}

}
