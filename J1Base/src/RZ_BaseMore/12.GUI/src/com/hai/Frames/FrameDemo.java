package com.hai.Frames;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�������ڶ���
		Frame f=new Frame("HelloWorld");
		
		//�������ñ���
		
		f.setTitle("��");
       //����λ��
		f.setLocation(400, 300);
		f.setSize(300, 200);//���ô��ڿ�  ��  ����
		
		//��ʾ����
		f.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.setBounds(300, 200, 500, 400);//ͬ������ λ�úʹ�С  
		
		//windows����ر� �¼�����
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);//�˳������ʵ�ֹر�Ч�� 
			}
		});
	}

}
