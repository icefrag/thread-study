package com.wurui.work_7;

public class ThreadA extends Thread{
	private Task task;

	public ThreadA(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		task.m1();
	}
}
