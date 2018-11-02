package com.seikinoko.classlock;

public class ClassLockTest {
	public static void main(String[] args) {
		Task task = new Task();
		TaskThread ta = new TaskThread(task, "A");
		TaskThread tb = new TaskThread(task, "B");
		Thread t1 = new Thread(ta);
		t1.start();
		Thread t2 = new Thread(tb);
		t2.start();
	}
}	
