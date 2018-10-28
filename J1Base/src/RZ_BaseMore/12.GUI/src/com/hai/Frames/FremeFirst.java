package com.hai.Frames;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FremeFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 创建窗体对象

		Frame f = new Frame("第一个窗体应用");
		// 设置窗体的位置及长宽
		f.setBounds(500, 200, 400, 300);
		// 关闭监听事件
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 设置布局模式
		f.setLayout(new FlowLayout());// 流式布局
		// 添加控件

		Button btn = new Button("点我啊");
		final TextField tf = new TextField(20);
		final TextArea ta = new TextArea(10, 40);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//获取文本框中的值
				String tf_str=tf.getText().trim();
				  tf.setText("");
//				//将值设置到文本域中
//				ta.setText(tf_str);
				//追加到文本框中 
				ta.append(tf_str+"\r\n");
             //文本框再次获取到光标
				tf.requestFocus();
			}
		});

	

		f.add(tf);
		f.add(btn);
		f.add(ta);

		f.setVisible(true);

	}

}
