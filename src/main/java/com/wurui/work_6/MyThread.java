package com.wurui.work_6;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("子线程开始运行....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("子线程执行完毕");
	}
}
