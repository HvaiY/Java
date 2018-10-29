package com.hai.Frames;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Freme限制键盘录入 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建窗口对象
		Frame f = new Frame("案例三");
		f.setBounds(300, 200, 500, 400);// 同事设置 位置和大小

		f.setLayout(new FlowLayout());// 设置流布局
		Label l = new Label("尝试输入非数字哦，怎么都不行");
		TextField tf = new TextField(40);
		f.add(l);
		f.add(tf);
		tf.addKeyListener(new KeyAdapter() {
			// 重写键盘录入事件
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				// 获取到的值不在 0-9范围内就取消事件
				if (!(ch >= '0' && ch <= '9')) {
					e.consume();//
				}
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
