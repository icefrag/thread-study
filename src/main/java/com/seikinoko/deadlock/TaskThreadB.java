package com.seikinoko.deadlock;

public class TaskThreadB implements Runnable {
	
	private Task task;
	
	private String name = "B";
	
	public TaskThreadB(Task task) {
		this.task = task;
	}

	public void run() {
		task.methodTwo(name);
	}
}
