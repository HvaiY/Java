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

		// �����������

		Frame f = new Frame("��һ������Ӧ��");
		// ���ô����λ�ü�����
		f.setBounds(500, 200, 400, 300);
		// �رռ����¼�
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// ���ò���ģʽ
		f.setLayout(new FlowLayout());// ��ʽ����
		// ��ӿؼ�

		Button btn = new Button("���Ұ�");
		final TextField tf = new TextField(20);
		final TextArea ta = new TextArea(10, 40);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//��ȡ�ı����е�ֵ
				String tf_str=tf.getText().trim();
				  tf.setText("");
//				//��ֵ���õ��ı�����
//				ta.setText(tf_str);
				//׷�ӵ��ı����� 
				ta.append(tf_str+"\r\n");
             //�ı����ٴλ�ȡ�����
				tf.requestFocus();
			}
		});

	

		f.add(tf);
		f.add(btn);
		f.add(ta);

		f.setVisible(true);

	}

}
