package com.hai.Frames;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Freme���Ƽ���¼�� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �������ڶ���
		Frame f = new Frame("������");
		f.setBounds(300, 200, 500, 400);// ͬ������ λ�úʹ�С

		f.setLayout(new FlowLayout());// ����������
		Label l = new Label("�������������Ŷ����ô������");
		TextField tf = new TextField(40);
		f.add(l);
		f.add(tf);
		tf.addKeyListener(new KeyAdapter() {
			// ��д����¼���¼�
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				// ��ȡ����ֵ���� 0-9��Χ�ھ�ȡ���¼�
				if (!(ch >= '0' && ch <= '9')) {
					e.consume();//
				}
			}
		});

		// windows����ر� �¼�����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);// �˳������ʵ�ֹر�Ч��
			}
		});
		f.setVisible(true);

	}

}
