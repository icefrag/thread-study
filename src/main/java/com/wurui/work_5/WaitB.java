package com.wurui.work_5;

public class WaitB extends Thread{
	private Object obj;
	public WaitB(Object obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		synchronized (obj) {
			System.out.println("B wait");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("B 醒");
		}
	}
}
