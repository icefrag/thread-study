package com.seikinoko.deadlock;

import java.util.concurrent.TimeUnit;

public class Task {
	
	private Object lockA = new Object();
	
	private Object lockB = new Object();

	public void methodOne(String name) {
		System.out.println("任务" + name + "：进入方法1，等待lockA");
		synchronized (lockA) {
			System.out.println("任务" + name + "：已获取到lockA，执行方法1");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("任务" + name + "：方法1执行完成");
			
			methodTwo(name);
		}
	}
	
	public void methodTwo(String name) {
		System.out.println("任务" + name + "：进入方法2，等待lockB");
		synchronized (lockB) {
			System.out.println("任务" + name + "：已获取到lockB，执行方法2");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("任务" + name + "：方法2执行完成");
			
			methodOne(name);
		}
	}
}
