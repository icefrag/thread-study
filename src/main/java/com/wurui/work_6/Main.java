package com.wurui.work_6;

public class Main {
	public static void main(String[] args) {
		/*
		MyThread my = new MyThread();
		my.start();
		try {
			my.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("等待子线程执行完毕了,一起停止");
		*/
		TaskService task = new TaskService();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
