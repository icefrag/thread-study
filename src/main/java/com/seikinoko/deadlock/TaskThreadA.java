package com.seikinoko.deadlock;

public class TaskThreadA implements Runnable {
	
	private Task task;
	
	private String name = "A";
	
	public TaskThreadA(Task task) {
		this.task = task;
	}

	public void run() {
		task.methodOne(name);
	}
}
