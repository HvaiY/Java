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

public class Frameһ���˵� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �������ڶ���
		Frame f = new Frame("������");
		f.setBounds(300, 200, 500, 400);// ͬ������ λ�úʹ�С

		f.setLayout(new FlowLayout());// ����������
	
		//�����˵�������
	 MenuBar mb=new MenuBar();
	 //�����˵�
	 Menu m=new Menu("�ļ�");
	 //�����˵���Ŀ
	 MenuItem mi=new MenuItem("�˳�ϵͳ");
	 //��� ��Ŀ���˵� �����˵��ӵ��˵���   ���˵������õ����� 
	 m.add(mi);
	 mb.add(m);
	 f.setMenuBar(mb);
	 
	 //���˵���Ŀ��һ����Ϊ
	 mi.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {		   
			System.exit(0);
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
