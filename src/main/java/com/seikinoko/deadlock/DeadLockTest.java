package com.seikinoko.deadlock;

public class DeadLockTest {
	public static void main(String[] args) {
		Task task = new Task();
		TaskThreadA ta = new TaskThreadA(task);
		TaskThreadB tb = new TaskThreadB(task);
		Thread t1 = new Thread(ta);
		t1.start();
		Thread t2 = new Thread(tb);
		t2.start();
	}
}
