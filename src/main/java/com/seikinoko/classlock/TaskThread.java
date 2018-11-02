package com.seikinoko.classlock;

public class TaskThread implements Runnable {
	
	private Task task;
	
	private String name;
	
	public TaskThread(Task task, String name) {
		this.task = task;
		this.name = name;
	}

	public void run() {
		task.method(name);
	}
}
