package com.hai.Frames;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Frame多级菜单 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建窗口对象
				final Frame f = new Frame("案例四");
				f.setBounds(300, 200, 500, 400);// 同事设置 位置和大小

				f.setLayout(new FlowLayout());// 设置流布局
				
				final String name = f.getTitle();
			
				//创建菜单栏对象
			 MenuBar mb=new MenuBar();
			 //创建菜单
			 Menu m=new Menu("文件");
			 Menu m1=new Menu("更改名称");
			
			 //创建菜单条目
			 MenuItem mi=new MenuItem("退出系统");
			 MenuItem mi1=new MenuItem("打开记事本");
			
			 MenuItem mi3=new MenuItem("好好学习");
			 final MenuItem mi4=new MenuItem("天天向上");
			 MenuItem mi5=new MenuItem("恢复名称");
			 
			 m.add(mi1);
			 m.add(mi1);
			 m.add(m1); //菜单上面可以添加子菜单 
			 //子菜单上添加菜单条目
			 m1.add(mi3);
			 m1.add(mi4);
			 m1.add(mi5);
			 
			 
			 //添加 条目到菜单 ，将菜单加到菜单栏   将菜单栏设置到窗口 
			 m.add(mi);
			 mb.add(m);
			 f.setMenuBar(mb);
			 //给子菜单的条目加上行为  更改名称
			 mi5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					f.setTitle(name);
					
				}
			});
			 //给子菜单的条目加上行为  更改名称
			 mi4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					f.setTitle(mi4.getLabel());
					
				}
			});
			 
			 //给子菜单的条目加上行为  更改名称
			 mi3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					f.setTitle("好好学习");
					
				}
			});
			 
			 //给打开记事本的菜单加上行为
			 mi1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Runtime r=Runtime.getRuntime();
					try {
						r.exec("notepad");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			 
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
