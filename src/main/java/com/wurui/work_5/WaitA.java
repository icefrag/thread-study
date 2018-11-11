package com.wurui.work_5;

public class WaitA extends Thread{
	private Object obj;
	public WaitA(Object obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		synchronized (obj) {
			System.out.println("A wait");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("A 醒");
		}
	}
}
