package com.hai.Frames;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame鼠标进入变色 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建窗体对象
		final Frame f = new Frame("第二个案例");
		// 设置窗体的位置和大小
		f.setBounds(200, 300, 400, 300);
		
		f.setLayout(new  FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});

		// 添加按钮
		Button btn1 = new Button("红色");
		Button btn2 = new Button("绿色");
		Button btn3 = new Button("蓝色");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		// 设置进入后显示颜色
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.RED);
			}
		});
		// 设置鼠标离开后显示颜色
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
     
		// 设置进入后显示颜色
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.GREEN);
			}
		});
		// 设置鼠标离开后显示颜色
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
		// 设置进入后显示颜色
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.BLUE);
			}
		});
		// 设置鼠标离开后显示颜色
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
		// 设置显示
		f.setVisible(true);

	}

}
