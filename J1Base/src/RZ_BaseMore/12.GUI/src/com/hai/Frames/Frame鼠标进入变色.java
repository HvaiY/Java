package com.hai.Frames;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame�������ɫ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �����������
		final Frame f = new Frame("�ڶ�������");
		// ���ô����λ�úʹ�С
		f.setBounds(200, 300, 400, 300);
		
		f.setLayout(new  FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});

		// ��Ӱ�ť
		Button btn1 = new Button("��ɫ");
		Button btn2 = new Button("��ɫ");
		Button btn3 = new Button("��ɫ");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		// ���ý������ʾ��ɫ
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.RED);
			}
		});
		// ��������뿪����ʾ��ɫ
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
     
		// ���ý������ʾ��ɫ
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.GREEN);
			}
		});
		// ��������뿪����ʾ��ɫ
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
		// ���ý������ʾ��ɫ
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				f.setBackground(Color.BLUE);
			}
		});
		// ��������뿪����ʾ��ɫ
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				f.setBackground(Color.WHITE);
			}
		});
		// ������ʾ
		f.setVisible(true);

	}

}
