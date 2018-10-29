package com.hai.生产者与消费者;

public class GetThread extends Thread {
	private Student s;

	public GetThread(Student s) {

		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
			//如果有数据 生产线程等待  我取完数据后 取消等待
			if(!s.flag){
				try {
					s.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
				System.out.println(s.name + "----" + s.age);
				
				//启动线程
				s.notify();
				s.flag=false;
				
			}
			
		}
	}
}
