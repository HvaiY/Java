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

public class Frame�༶�˵� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �������ڶ���
				final Frame f = new Frame("������");
				f.setBounds(300, 200, 500, 400);// ͬ������ λ�úʹ�С

				f.setLayout(new FlowLayout());// ����������
				
				final String name = f.getTitle();
			
				//�����˵�������
			 MenuBar mb=new MenuBar();
			 //�����˵�
			 Menu m=new Menu("�ļ�");
			 Menu m1=new Menu("��������");
			
			 //�����˵���Ŀ
			 MenuItem mi=new MenuItem("�˳�ϵͳ");
			 MenuItem mi1=new MenuItem("�򿪼��±�");
			
			 MenuItem mi3=new MenuItem("�ú�ѧϰ");
			 final MenuItem mi4=new MenuItem("��������");
			 MenuItem mi5=new MenuItem("�ָ�����");
			 
			 m.add(mi1);
			 m.add(mi1);
			 m.add(m1); //�˵������������Ӳ˵� 
			 //�Ӳ˵�����Ӳ˵���Ŀ
			 m1.add(mi3);
			 m1.add(mi4);
			 m1.add(mi5);
			 
			 
			 //��� ��Ŀ���˵� �����˵��ӵ��˵���   ���˵������õ����� 
			 m.add(mi);
			 mb.add(m);
			 f.setMenuBar(mb);
			 //���Ӳ˵�����Ŀ������Ϊ  ��������
			 mi5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					f.setTitle(name);
					
				}
			});
			 //���Ӳ˵�����Ŀ������Ϊ  ��������
			 mi4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					f.setTitle(mi4.getLabel());
					
				}
			});
			 
			 //���Ӳ˵�����Ŀ������Ϊ  ��������
			 mi3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					f.setTitle("�ú�ѧϰ");
					
				}
			});
			 
			 //���򿪼��±��Ĳ˵�������Ϊ
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
