package com.wurui.work_7;

public class ThreadB extends Thread{
	private Task task;

	public ThreadB(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		task.m2();
	}
}
