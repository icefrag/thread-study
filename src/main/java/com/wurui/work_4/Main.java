package com.wurui.work_4;

public class Main {
	public static void main(String[] args) {
		Task task = new Task();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		new Thread(task).start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----end," + task.a.get());
	}
}
